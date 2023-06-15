package com.example.kulinarex

import org.json.JSONObject

class Recipes {
    val recipesString = """{
  "recipes": [
    [
      {
        "recipeName": "Koreańskie burgery",
        "recipeImage": "koreanski_burger",
        "recipeIngredients": [
          "wołowina mielona o zawartości tłuszczu ok. 20% 1kg",
          "przyprawa koreański grill 1 opakowanie",
          "świeża kolendra 1 pęczek",
          "bułka z sezamem do hamburgerów 4 sztuki",
          "grzyby shitake suszone 100g",
          "sos sweet chilli 100g",
          "sos sojowy 3 łyżki",
          "olej sezamowy z uprażonych ziaren sezamu 50ml",
          "ser cheddar 100g",
          "kapusta kimchi gotowana 200g",
          "liście sałaty 5 sztuk",
          "imbir 4cm"
        ],
        "recipe": [
          "Grzyby shitake zalej gotującą się wodą i odstaw, aż zmiękną. Następnie drobno je posiekaj. Pokrój również natkę kolendry. Imbir zetrzyj na tarce.",
          "Wymieszaj mięso mielone, przyprawę koreański grill, pokrojone grzyby shitake, sos sojowy, kolendrę, olej sezamowy i imbir. Z powstałej masy uformuj 4 okrągłe hamburgery grubości ok. 1 cm.",
          "Hamburgery smaż na grillu, decydując o stopniu wysmażenia według własnych upodobań. Aby średnio wysmażyć mięso, trzeba je grillować po 4 minuty z każdej strony. Gotowe hamburgery posmaruj sosem sweet chili.",
          "Bułki opiecz z obu stron na złoty kolor. Na jednej połówce układają kolejno: usmażone mięso, ser i kapustę kimchi. Całość przykryj drugą połówką bułki z sezamem."
        ],
        "times": [
          240,
          240
        ]
      },
      {
        "recipeName": "Kurczak po zbójnicku zapiekany w ziemniakach",
        "recipeImage": "kurczak_zbojnicki",
        "recipeIngredients": [
          "ziemniaki 8 sztuk",
          "pierś z kurczaka 300g",
          "przyprawa do kurczaka 1 opakowanie",
          "cebula 1 sztuka",
          "ząbek czosnku 2 sztuki",
          "dowolne grzyby 200g",
          "oscypek 1 sztuka",
          "wędzony chudy boczek 100g",
          "olej roślinny 3 łyżki"
        ],
        "recipe": [
          "Ziemniaki umyj, osusz, natrzyj z wierzchu olejem. Wstaw do nagrzanego do 180°C piekarnika na około ok. 45 minut. Gdy będą już miękkie, wystudź je. Przekrój na pół i wydrąż, zachowując skórkę i miąższ.",
          "Pierś z kurczaka umyj, pokrój w kostkę i oprósz połową torebki opakowania z przyprawą do kurczaka. Nada ona mięsu delikatnie ziołowego aromatu i sprawi, że kurczak będzie soczysty.",
          "Boczek pokrój w kosteczkę i podsmaż na patelni do momentu wytopienia się tłuszczu. Nadmiar tłuszczu usuń na z patelnię, wrzuć pokrojone piersi. Przesmaż je tylko chwilę, tak aby były jeszcze surowe w środku.",
          "Cebule pokrój w plastry, grzyby umyj i rozdrobnij, przecinając duże kawałki na pół. Posiekaj drobno czosnek, dodaj do kurczaka i podsmaż chwile wszystko razem na patelni. Ser zetrzyj na tarce.",
          "Do miski przełóż podsmażonego kurczaka z warzywami i połącz z miąższem z ziemniaków, grzyby, czosnek, oraz połowę startego sera. Całość dopraw pozostałą przyprawa do kurczaka Knorr. Otrzymanym w ten sposób farszem napełnij połówki ziemniaków. Posyp je z wierzchu pozostałym tartym serem. Ułóż na blasze do pieczenia. Całość wstaw do nagrzanego do 190°C piekarnika na około ok. 20 minut."
        ],
        "times": [
          2700,
          1200
        ]
      },
      {
        "recipeName": "Sałatka z pieczoną kaczką",
        "recipeImage": "salatka_kaczka",
        "recipeIngredients": [
          "pierś z kaczki 1 sztuka",
          "sos sałatkowy koperkowo-ziołowy 1 opakowanie",
          "mieszane sałaty: raddicchio, rukola, sałata lodowa 4 garście",
          "mango 1 sztuka",
          "granat 1 sztuka",
          "musztarda Dijon 1 łyżeczka",
          "skórka z pomarańczy",
          "cukier 1 łyżeczka",
          "sól morska 1 łyżeczka",
          "ocet balsamiczny 3 łyżki",
          "oliwa z oliwek 3 łyżki"
        ],
        "recipe": [
          "Pierś osusz papierowym ręcznikiem. Skórę ponacinaj ostrym nożem. W miseczce wymieszaj skórkę z pomarańczy, sól oraz cukier. Natrzyj pierś i odstaw na 1 godzinę do lodówki.",
          "Po tym czasie marynatę ściągnij z mięsa. Pierś ułóż na zimnej patelni skórą do dołu i smaż na wolnym ogniu. Po kilku minutach, gdy skóra lekko się zarumieni, mięso przewróć na drugą stronę. Smaż do momentu, gdy mięso w środku będzie różowe, ale nie krwiste. Po usmażeniu pierś wystudź.",
          "Mango obierz i pokrój w cząstki – ósemki. Z granatu wyjmij pestki. Sałaty wymieszaj i przełóż na półmisek. Owoce rozłóż na sałatach.",
          "W słoiczku połącz oliwę, ocet, musztardę oraz zawartość opakowania sosu. Zamknij słoiczek i energicznie potrząsając, wymieszaj składniki sosu.",
          "Wystudzoną pierś kaczki pokrój w cienkie plastry i ułóż na sałacie. Całość polej przygotowanym sosem i podawaj najlepiej z chrupiącymi grzankami z bagietki."
        ],
        "times": [
          10,
          20
        ]
      },
      {
        "recipeName": "Roladki z szynki",
        "recipeImage": "roladki_szynka",
        "recipeIngredients": [
          "szynka w dużych plastrach 6 plastrów",
          "przyprawa smażona cebula 1 opakowanie",
          "tłusty biały ser 200g",
          "majonez 2 łyżki",
          "sok z cytryny 1 łyżka",
          "posiekany koperek 1 łyżka",
          "posiekany szczypiorek 1 łyżka"
        ],
        "recipe": [
          "Utrzyj w misce biały ser z majonezem, sokiem z cytryny.",
          "Dodaj koperek, szczypiorek oraz przyprawę smażona cebula. Ponownie utrzyj tak, aby wszystkie składniki się połączyły. Masę wstaw na godzinę do lodówki.",
          "Nałóż na każdy plaster masę serową i zwijaj za pomocą folii. Roladki schłódź w lodówce przez godzinę.",
          "Przed podaniem roladki pokrój na 2 centymetrowe kawałki."
        ],
        "times": [
          3600,
          3600
        ]
      },
      {
        "recipeName": "Duszona karkówka w sosie własnym z cebulą",
        "recipeImage": "karkowka_cebula",
        "recipeIngredients": [
          "karkówka wieprzowa 600g",
          "sos do pieczeni 1 opakowanie",
          "woda 1l",
          "majeranek 1 łyżeczka",
          "cebula 3 sztuki",
          "mąka 4 łyżki",
          "liść laurowy 1 sztuka",
          "ziele angielskie 2 ziarna",
          "pieprz czarny ziarnisty 2 ziarna",
          "olej do smażenia"
        ],
        "recipe": [
          "Mięso opłucz i pokrój na kotlety grubości 2 cm.",
          "Każdy rozbij lekko tłuczkiem, posyp pieprzem i oprósz mąką.",
          "W następnej kolejności obsmaż je z obu stron na złoty kolor na rozgrzanym oleju.",
          "Cebule pokrój w piórka i przesmaż w garnku na rozgrzanym oleju, dodaj majeranek, liść laurowy oraz ziele.",
          "Gdy cebula nabierze złotego koloru, wsyp pozostałą mąkę i przesmaż razem. Następnie dodaj 1 l wrzącej wody.",
          "Włóż mięso, sos do pieczeni i duś na małym ogniu do momentu, gdy karkówka będzie miękka. Podawaj z ziemniakami lub kaszą."
        ],
        "times": []
      },
      {
        "recipeName": "Schab z pieczarkami pod pierzynką z majonezu i żółtego sera",
        "recipeImage": "schab_pieczarki",
        "recipeIngredients": [
          "schab środkowy bez kości 1kg",
          "pieczarki 500g",
          "majonez 150g",
          "majonez pikantny 50g",
          "przyprawa do mięs 2 łyżki",
          "cebula 1 sztuka",
          "żółty ser 100g",
          "ząbek czosnku 1 sztuka",
          "natka pietruszki 1 pęczek"
        ],
        "recipe": [
          "Schab oczyść z błon i tłuszczu. Pokrój w ok 1 cm grubości kotlety. Mięso oprósz dokładnie przyprawą do mięs.",
          "Pieczarki umyj, zetrzyj na tarce o grubych oczkach, cebulę pokrój w drobna kostkę, czosnek rozetrzyj na pastę, pietruszkę drobno posiekaj – wszystko razem wymieszaj z majonezem i ketchupem. Tak przygotowany farsz nałóż na poszczególne kotlety.",
          "Posyp je po wierzchu żółtym serem. Całość piecz w piekarniku nagrzanym do 180 stopni C przez około 15 minut."
        ],
        "times": [
          900
        ]
      },
      {
        "recipeName": "Pieczony schab z ziołowym nadzieniem i sosem pieczarkowym",
        "recipeImage": "schab_ziolowy",
        "recipeIngredients": [
          "schab środkowy 600g",
          "przyprawa do mięs 2 łyżki",
          "pieczywo tostowe 8 kromek",
          "pieczarki 10 sztuk",
          "jajko 1 sztuka",
          "bulion 0.5 szklanki",
          "natka pietruszki 1 łyżka",
          "sos do pieczeni ciemny 1 opakowanie",
          "pieprz czarny mielony 1 szczypta",
          "tymianek suszony 1 łyżeczka",
          "czosnek 1 ząbek"
        ],
        "recipe": [
          "Pieczywo pokrój w niedużą kostkę i przełóż do miski. Dodaj posiekane zioła i czosnek, bulion oraz jajko. Wszystko razem wymieszaj i dopraw do smaku pieprzem.",
          "Mięso oczyść z błon, a następnie cienkim nożem zrób otwór w środku schabu na wylot. Natrzyj mięso przyprawą do mięs.",
          "Przygotowanym farszem wypełnij otwór w mięsie. Mięso obsmaż z każdej strony na rozgrzanej patelni i zawiń ściśle w folię aluminiową. Następnie wstaw do nagrzanego do 180 °C piekarnika na 50 minut.",
          "Pieczarki pokrój w grube plastry i przesmaż na tej samej patelni. Wlej szklankę zimnej wody, zdejmij patelnię z ognia i dodaj sos pieczeniowy ciemny Knorr. Doprowadź do wrzenia i gotuj jeszcze 2-3 minuty. Po upieczeniu mięso pokrój w plastry i podawaj z powstałym pieczarkowym sosem."
        ],
        "times": [
          3000,
          120
        ]
      }
    ],
    [
      {
        "recipeName": "Sałatka po grecku",
        "recipeImage": "salatka_grecka",
        "recipeIngredients": [
          "kilka liści sałaty lodowej",
          "pomidory koktajlowe 250g",
          "zielony ogórek 1 sztuka",
          "czerwona cebula 1 sztuka",
          "sos sałatkowy grecki 1 sztuka",
          "oliwa z oliwek 5 łyżek",
          "ser feta 150g",
          "czarne oliwki 50g",
          "papryka czerwona 1 sztuka"
        ],
        "recipe": [
          "Umyj wszystkie warzywa, a następnie osusz je dokładnie. Sałatę porwij na duże kawałki, pomidorki przekrój na pół, cebulę pokrój w kostkę lub w plastry, ogórka przekrój na pół i pokrój w półplastry, paprykę pokrój na cienkie plastry.",
          "Wymieszaj sos sałatkowy z trzema łyżkami oliwy i trzema łyżkami wody.",
          "W odpowiednim naczyniu ułóż sałatę, na nią połóż pozostałe pokrojone warzywa, a na wierzchu ułóż oliwki. Sałatkę posyp rozkruszonym serem feta. Całość polej sosem sałatkowym."
        ],
        "times": [
          20,
          30
        ]
      },
      {
        "recipeName": "Kremowa zupa pomidorowa",
        "recipeImage": "zupa_pomidorowa",
        "recipeIngredients": [
          "cebula 1 sztuka",
          "gałązka tymianku",
          "pasta pomidorowa 70g",
          "pomidory bez skórki 2 puszki",
          "spaghetti bolognese Fix 1 opakowanie",
          "śmietana 12% 125ml",
          "oliwa z oliwek 3 łyżki",
          "ząbek czosnku 1 sztuka",
          "papryka ostra w proszku 0.5 łyżeczki"
        ],
        "recipe": [
          "W garnku rozgrzej oliwę, podsmaż na niej cebulę i czosnek, aż zrobią się delikatnie rumiane. Dodaj tymianek i pomidory z puszki.",
          "Fix wymieszaj z 350 ml wody, połącz go w garnku z gotującymi się pomidorami. Zupę gotuj, mieszając co jakiś czas, przez co najmniej 10 minut.",
          "Na koniec usuń z zupy gałązkę tymianku, dopraw do smaku ostrą papryką, zabiel śmietaną i zmiksuj na gładko mikserem. Podawaj z chrupiącym chlebem np. z oliwkowym tapenade."
        ],
        "times": [
          14,
          42,
          3
        ]
      },
      {
        "recipeName": "Zupa brokułowa",
        "recipeImage": "zupa_brokulowa",
        "recipeIngredients": [
          "łodyga selera 2 sztuki",
          "brokuły 600g",
          "ziemniak 1 sztuka",
          "bulion warzywny 2 sztuki",
          "śmietana 12% 150ml",
          "parmezan 100g",
          "oliwa 2 łyżki",
          "ząbek czosnku 2 sztuki"
        ],
        "recipe": [
          "Selera i brokuły pokrój na mniejsze kawałki- nie muszą być regularne, posiekaj drobno dwa ząbki czosnku. Zetrzyj ser na tarce, ziemniaka obierz i pokrój w drobną kostkę.",
          "W garnku na rozgrzanej oliwie podsmaż czosnek, gdy się lekko zarumieni dodaj selera, smaż go przez 1- 2 minuty cały czas mieszając. Dodaj ziemniaki i brokuły, całość zalej litrem wody. Wszystko razem gotuj około 15 minut pod przykryciem, aż ziemniaki zmiękną . Do zupy dodaj kostki rosołowe, śmietanę, dokładnie wymieszaj, wszystko razem zmiksuj w kielichu blendera i przecedź przez sito.",
          "Zupę podawaj udekorowaną śmietaną, z wierzchu posypaną tartym serem parmezan."
        ],
        "times": []
      },
      {
        "recipeName": "Fasolka szparagowa z ryżem",
        "recipeImage": "fasolka_szparagowa",
        "recipeIngredients": [
          "bulion warzywny 1 sztuka",
          "ryż jaśminowy 200g",
          "oliwa z oliwek 2 łyżki",
          "cebula 1 sztuka",
          "zielona fasolka szparagowa 500g",
          "mleko kokosowe 1 puszka",
          "wegetariańskie czerwone curry 1 łyżka",
          "wiórki kokosowe"
        ],
        "recipe": [
          "Cebulę drobno pokrój w kostkę, zeszklij w garnku na rozgrzanej oliwie. Dodaj ryż, chwilę smaż, aż zrobi się szklisty, wlej wodę na 2-3 cm nad powierzchnię ryżu. Wodę zagotuj, dodaj bulion na włoszczyźnie. Całość dokładnie pomieszaj, aby kostka się rozpuściła. Ryż gotuj pod przykryciem w kąpieli wodnej, aż zrobi się zupełnie miękki.",
          "Fasolkę oczyść, przekrój na pół, zalej mlekiem kokosowym, dodaj czerwonego curry. Całość gotuj około 15-20 minut, aż fasolka zrobi się miękka.",
          "Fasolkę podawaj z ryżem, oprószoną kawałkami świeżego kokosa."
        ],
        "times": [
          30
        ]
      },
      {
        "recipeName": "Szwajcarski quiche z brokułami i serem",
        "recipeImage": "quiche",
        "recipeIngredients": [
          "gotowe ciasto francuskie 1 sztuka",
          "cebula 1 sztuka",
          "główka brokuła 1 sztuka",
          "ser ementaler 200g",
          "pomidory koktajlowe 10 sztuk",
          "jajka 3 sztuki",
          "śmietana 12% 250ml",
          "fix zapiekanka makaronowa z szynką 1 opakowanie",
          "bułka tarta 2 łyżki",
          "masło 1 łyżka"
        ],
        "recipe": [
          "Foremkę na tatrę wysmaruj tłuszczem, oprósz bułką tartą, wyłóż pergaminem. Gotowe rozmrożone ciasto francuskie delikatnie rozwałkuj na stolnicy oprószonej mąka. Ciasto umieść w foremce, przykryj pergaminem . Do środka włóż porcelanowe kulki lub nasyp do środka grochu. Całość piecz w 200*C przez około 10 minut, aż ciasto zrobi się rumiane. Po upieczeniu usuń kulki.",
          "Pokrój cebulę w pół plastry, pomidory przekrój na pół, zetrzyj ser na tarce. Brokuły pokrój na mniejsze różyczki, sparz w gotującej się wodzie przez 1-2 minuty, a następnie zahartuj zanurzając je w zimnej wodzie.",
          "Jajka wymieszaj ze śmietaną, fixem i połową sera.",
          "Na zapieczonym cieście równomiernie poukładaj różyczki brokułów, cebulę i pomidory, całość zalej śmietaną z jajkami, oprósz z wierzchu pozostałym serem.",
          "Całość wstaw do nagrzanego do 180*C piekarnika na około 35 minut."
        ],
        "times": [
          600,
          90,
          2100
        ]
      },
      {
        "recipeName": "Wiosenny makaron z warzywami",
        "recipeImage": "wiosenny",
        "recipeIngredients": [
          "szparagi 1 pęczek",
          "fix spaghetti bolognese 1 opakowanie",
          "makaron fettuccine 300g",
          "pomidory pelatti z puszki 400g",
          "świeży szpinak 200g",
          "zielony groszek 200g",
          "ser feta 100g",
          "oliwa z oliwek 3 łyżki",
          "ząbek czosnku 3 sztuki"
        ],
        "recipe": [
          "Makaron ugotuj na sposób al dente, według zaleceń producenta.",
          "Posiekaj drobno czosnek szparagi obierz, odetnij ich zdrewniałe części, przetnij po długości na pół . Szparagi gotuj 4-5 minut w lekko osolonej wodzie. A następnie schłodź w zimnej wodzie, pokrój w 3 cm kawałki. Szpinak umyj, osusz, oderwij końcówki łodygi listków.",
          "Na rozgrzanej na patelni oliwie podsmaż czosnek. Gdy zacznie delikatnie zmieniać kolor, dodaj pomidory z puszki, fix i dokładnie pomieszaj całość. Do sosu pomidorowego dodaj szparagi, szpinak i zielony groszek. Wszystko razem gotuj chwilę, dodaj makaron, dokładnie wymieszaj go z sosem.",
          "Makaron rozłóż na talerze, posyp pokruszonym serem feta po wierzchu."
        ],
        "times": []
      },
      {
        "recipeName": "Makaron w kremowym sosie z dynią i skwarkami z suszonych pomidorów",
        "recipeImage": "makaron_dynia",
        "recipeIngredients": [
          "dynia piżmowa 1 sztuka",
          "makaron 150g",
          "cebula 1 sztuka",
          "pomidory suszone 10 sztuk",
          "przyprawa z papryką wędzoną grubo mielona 3 szczypty",
          "przyprawa pikantna grubo mielona 1 szczypta",
          "przyprawa czosnkowa grubo mielona 1 szczypta",
          "przyprawa włoska grubo mielona 2 szczypty",
          "masło 1 łyżka",
          "mascarpone 2 łyżki",
          "orzeczy brazylijskie 1 garść",
          "pesto z suszonych pomidorów 2 łyżki",
          "pieprz ziołowy 2 szczypty",
          "ser feta 0.25 opakowania",
          "syrop klonowy 1 łyżka"
        ],
        "recipe": [
          "Dynię pokrój na mniejsze części i włóż do nagrzanego do 180 stopni C piekarnika na ok. 30 minut. Jak tylko dynia będzie miękka pokrój ją w kostkę.",
          "Na maśle zeszklij pokrojoną w kostkę cebulkę. Dodaj pokrojone w kostkę suszone pomidor,y syrop klonowy i wszystkie przyprawy grubo mielone. Podsmażaj ok. 3 minuty.",
          "Ugotuj makaron według instrukcji. Następnie odcedź go i dodaj do niego pesto, pieprz ziołowy i mascarpone.",
          "Posiekaj orzechy oraz pokrój ser w kostkę. Makaron wyłóż na talerze, połóż na niego dynię i posyp skwarkami z suszonych pomidorów. Do tego dodaj kilka kostek fety i posiekane orzechy."
        ],
        "times":[1800,180]
      }
    ]
  ]
}"""
    private val recipes = JSONObject(recipesString).getJSONArray("recipes")
    fun recipes() : ArrayList<String>{
        val recipeNames = ArrayList<String>()
        for(i in 0 until recipes.length()){
            recipeNames.add(recipes.getJSONObject(i).getString("recipeName"))
        }
        return recipeNames
    }

}
