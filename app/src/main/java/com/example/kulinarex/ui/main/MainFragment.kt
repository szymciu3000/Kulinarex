package com.example.kulinarex.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.kulinarex.ItemsViewModel
import com.example.kulinarex.Recipes
import com.example.kulinarex.RecyclerAdapter
import com.example.kulinarex.databinding.FragmentMainBinding
import org.json.JSONObject


class MainFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val section = requireArguments().getInt(ARG_SECTION_NUMBER)
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        val root = binding.root

        val recipesString = Recipes().recipesString
        val recipes = JSONObject(recipesString)
        if(section==1) {
            val textView: TextView = binding.sectionLabel
                textView.text = "Witaj w Kulinarexie - aplikacji z przepisami. "
        }

        val recyclerview: RecyclerView = binding.recyclerview
        recyclerview.layoutManager = StaggeredGridLayoutManager(2,RecyclerView.VERTICAL )
        val data = ArrayList<ItemsViewModel>()
        if(section!=1) {
            for (i in 0 until (recipes.getJSONArray("recipes").getJSONArray(section-2).length() )){
                val recipe_tmp = recipes.getJSONArray("recipes").getJSONArray(section-2).getJSONObject(i)
                val recipeName = recipe_tmp.getString("recipeName")
                val recipeImage: Int = resources.getIdentifier(recipe_tmp.getString("recipeImage"),"drawable",context?.packageName)
                val recipeIngredients = ArrayList<String>()
                for( j in 0 until recipe_tmp.getJSONArray("recipeIngredients").length()){
                    recipeIngredients.add(recipe_tmp.getJSONArray("recipeIngredients").getString(j))
                }
                val recipe = ArrayList<String>()
                for( j in 0 until recipe_tmp.getJSONArray("recipe").length()){
                    recipe.add(recipe_tmp.getJSONArray("recipe").getString(j))
                }
                val times = ArrayList<Int>()
                for( j in 0 until recipe_tmp.getJSONArray("times").length()){
                    times.add(recipe_tmp.getJSONArray("times").getInt(j))
                }
                data.add(ItemsViewModel(recipeName,recipeImage,recipeIngredients,recipe,times))
            }
        }
        val adapter = RecyclerAdapter(data)
        recyclerview.adapter = adapter
        return root
    }

    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"
        @JvmStatic
        fun newInstance(sectionNumber: Int): MainFragment {
            return MainFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}