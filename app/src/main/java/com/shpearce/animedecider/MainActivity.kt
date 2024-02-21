package com.shpearce.animedecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.shpearce.animedecider.databinding.ActivityMainBinding
import java.util.Random

//The Dinner Decider App
class MainActivity : AppCompatActivity() {

    //Binding to elements that exist in the Apps User Interface
    private lateinit var binding:ActivityMainBinding

    //The list of Restaurants that will be selected that will decide where user will go to dinner
    val animeList = arrayListOf("DragonBall Z", "Naruto Shippuden", "One Piece", "Jojo")

    //What needs to occur when the app is created?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set the binding that will be used to reference elements in the main Activity Interface
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //What happens when the decideBtn is pressed?
        binding.decideBtn.setOnClickListener {
            //Create Random Object
            val random = Random()

            //Select random integer value from range of the animeList Array
            val randomAnime = random.nextInt(animeList.count())

            //set selectedAnimeTxt to be the an element from animeList at index randomAnime
            binding.selectedAnimeTxt.text = animeList[randomAnime]
        }

        //What happens when the addFoodBtn is pressed?
        binding.addAnimeBtn.setOnClickListener {

            //Extract data from addFoodTxt and convert it into a string and store it in newFood
            val newAnime = binding.addAnimeTxt.text.toString()

            if(newAnime != "")
            {
                //Add newFood to the foodList
                animeList.add(newAnime)

                //Clear the new Input Item after it has been added to foodList
                binding.addAnimeTxt.text.clear()
            }
        }
    }
}