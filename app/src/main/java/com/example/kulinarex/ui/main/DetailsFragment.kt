package com.example.kulinarex.ui.main

import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.os.Bundle
import android.os.Handler
import android.text.Html
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.INVISIBLE
import android.view.ViewGroup
import android.widget.*
import com.example.kulinarex.R
import com.example.kulinarex.databinding.FragmentDetailsBinding
import java.util.ArrayList

class DetailsFragment : Fragment(), View.OnClickListener{


    private var seconds = 70;
    private var running: Boolean = false
    private var wasRunning: Boolean = false
    private var playing: Boolean = false
    private var which_timer = 0;
    private lateinit var viewModel: DetailsViewModel
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!
    private lateinit var times: ArrayList<Int>
    private lateinit var player: MediaPlayer

    override fun onClick(view: View){
        if (view.id==R.id.start_time){
            onStartTime()
        }
        else if(view.id==R.id.next_time){
            onStopTime()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState!= null) {
            seconds = savedInstanceState.getInt("seconds")
            running = savedInstanceState.getBoolean("running")
            wasRunning = savedInstanceState.getBoolean("was_running")
            which_timer = savedInstanceState.getInt("which_timer")
            playing = savedInstanceState.getBoolean("playing")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val ingredients = requireArguments().getStringArrayList(ARG_RECIPE_INGREDIENTS)
        val image = requireArguments().getInt(ARG_RECIPE_IMAGE)
        val recipe = requireArguments().getStringArrayList(ARG_RECIPE)
        times = requireArguments().getIntegerArrayList(ARG_TIMES)!!
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        requireActivity().findViewById<ImageView>(R.id.recipe_image).setImageResource(image)
        val root = _binding!!.root

        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
        player = MediaPlayer.create(root.context, soundUri)
        runStoper(root)

        val startButton = root.findViewById<Button>(R.id.start_time)
        startButton.setOnClickListener(this)
        val stopButton = root.findViewById<Button>(R.id.next_time)
        stopButton.setOnClickListener(this)

        binding.ingredients.text = ingredients?.joinToString("\n")
        binding.floatingActionButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,ingredients?.joinToString("\n"))
            startActivity(intent)
        }

        if (times.size==0){
            _binding!!.cardView5.visibility = GONE
        }
        if (times.size==1){
            _binding!!.nextTime.setText("Kończ")
        }

        if (savedInstanceState == null) {
            if(times.size>0) {
                seconds = times[which_timer]
            }
        }
        if (which_timer >= times.size){
            _binding!!.startTime.visibility = INVISIBLE
            _binding!!.nextTime.visibility = INVISIBLE
        }

        var recipe_string = ""
        for(i in 1 .. recipe!!.size){
            recipe_string += "<h2>Krok "+i+"</h2>" +recipe?.get(i-1)+"<br>"
        }
        binding.recipe.text = Html.fromHtml(recipe_string+"<h2>Smacznego!</h2>")
        return root
    }

    private fun onStartTime(){
        running = true
    }

    private fun onStopTime(){
        running = false
        wasRunning = false
        player.stop()
        player.prepare()
        playing = false
        which_timer++
        if (which_timer < times.size) {
            seconds = times[which_timer]
            val hours = seconds/3600
            val minutes = (seconds%3600)/60
            val secs = seconds % 60
            _binding!!.time.setText(String.format("%d:%02d:%02d", hours, minutes, secs))
            if(which_timer == times.size-1){
                _binding!!.nextTime.setText("Kończ")
            }
        }
        else{
            _binding!!.time.setText("Koniec")
            _binding!!.startTime.visibility = INVISIBLE
            _binding!!.nextTime.visibility = INVISIBLE
        }

    }

    fun runStoper(view: View){
        val time: TextView = view.findViewById(R.id.time)
        val handler = Handler()
        handler.post( object: Runnable{
            override fun run(){
                val hours = seconds/3600
                val minutes = (seconds%3600)/60
                val secs = seconds % 60
                if (which_timer >= times.size){
                    time.setText("Koniec")
                }
                else {
                    time.setText(String.format("%d:%02d:%02d", hours, minutes, secs))
                }
                if(seconds==0){
                    running=false
                    wasRunning=false
                    if (!playing and (which_timer < times.size)) {
                        player.start()
                        playing = true
                    }
                }
                if(running){
                    seconds--
                }
                handler.postDelayed(this,1000)
            }
        }


        )
    }

    override fun onPause(){
        super.onPause()
        wasRunning = running
        running = false
    }
    override fun onResume(){
        super.onResume()
        if(wasRunning){
            running = true;
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("seconds",seconds)
        outState.putBoolean("running",running)
        outState.putBoolean("was_running",wasRunning)
        outState.putInt("which_timer",which_timer)
        outState.putBoolean("playing",playing)
    }

    override fun onDestroy(){
        super.onDestroy()
        player.release()
    }

    companion object {
        private const val ARG_RECIPE_IMAGE = "recipe_image"
        private const val ARG_RECIPE_INGREDIENTS = "recipe_ingredients"
        private const val ARG_RECIPE = "recipe"
        private const val ARG_TIMES = "times"
        @JvmStatic
        fun newInstance(image: Int, ingredients: ArrayList<String>, recipe: ArrayList<String>, times: ArrayList<Int>): DetailsFragment {
            return DetailsFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_RECIPE_IMAGE, image)
                    putStringArrayList(ARG_RECIPE_INGREDIENTS, ingredients)
                    putStringArrayList(ARG_RECIPE,recipe)
                    putIntegerArrayList(ARG_TIMES,times)
                }
            }
        }
    }


}