package com.krisna.biofun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.krisna.biofun.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val correctValue = getIntent().getIntExtra("amountRight", 0)
        val wrongValue = getIntent().getIntExtra("amountWrong",0)
        if (correctValue != null && wrongValue != null) {
            Log.d("correctValue", correctValue.toString())
            Log.d("wrongValue", wrongValue.toString())
        }

        binding.progressCorrect.progress = correctValue
        binding.textValuecorrect.text = "$correctValue" + "/" + binding.progressCorrect.max

        binding.progressWrong.progress = wrongValue
        binding.textValuewrong.text = "$wrongValue" + "/" + binding.progressWrong.max

    }
}