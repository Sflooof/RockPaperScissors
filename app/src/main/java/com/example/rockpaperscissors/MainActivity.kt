package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.rockpaperscissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onClickScissorsBtn(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.UserImg.setBackgroundResource(R.drawable.scissorsimage)
        if (gameChoice == "Камень") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.ResultTxt.text = "Ничья"
        else if (gameChoice == "Бумага") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.ResultTxt.text = "Вы выиграли"
        else binding.ResultTxt.text = "Вы проиграли"
    }

    fun onClickPaperBtn(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.UserImg.setBackgroundResource(R.drawable.paperimage)
        if (gameChoice == "Камень") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.ResultTxt.text = "Ничья"
        else if (gameChoice == "Ящерица") binding.ResultTxt.text = "Вы проиграли"
        else binding.ResultTxt.text = "Вы выиграли"
    }

    fun onClickRockBtn(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.UserImg.setBackgroundResource(R.drawable.rockimage)
        if (gameChoice == "Камень") binding.ResultTxt.text = "Ничья"
        else if (gameChoice == "Ножницы") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.ResultTxt.text = "Вы выиграли"
        else binding.ResultTxt.text = "Вы проиграли"
    }

    fun onClickLizardBtn(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.UserImg.setBackgroundResource(R.drawable.lizardimage)
        if (gameChoice == "Камень") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Ножницы") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Бумага") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Ящерица") binding.ResultTxt.text = "Ничья"
        else binding.ResultTxt.text = "Вы выиграили"
    }

    fun onClickSpockBtn(view: View)
    {
        val options = arrayOf("Камень","Ножницы","Бумага","Ящерица","Спок")
        val gameChoice = getGameChoice(options)
        binding.UserImg.setBackgroundResource(R.drawable.spockimage)
        if (gameChoice == "Камень") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Ножницы") binding.ResultTxt.text = "Вы выиграли"
        else if (gameChoice == "Бумага") binding.ResultTxt.text = "Вы проиграли"
        else if (gameChoice == "Ящерица") binding.ResultTxt.text = "Вы проиграли"
        else binding.ResultTxt.text = "Ничья"
    }

    fun getGameChoice(optionsParam: Array<String>): String {
        var choice = optionsParam[(Math.random() * optionsParam.size).toInt()]
        if (choice == "Камень") binding.ComputerImg.setBackgroundResource(R.drawable.rockimage)
        else if (choice == "Ножницы") binding.ComputerImg.setBackgroundResource(R.drawable.scissorsimage)
        else if (choice == "Бумага") binding.ComputerImg.setBackgroundResource(R.drawable.paperimage)
        else if (choice == "Ящерица") binding.ComputerImg.setBackgroundResource(R.drawable.lizardimage)
        else binding.ComputerImg.setBackgroundResource(R.drawable.spockimage)
        return choice
    }
}