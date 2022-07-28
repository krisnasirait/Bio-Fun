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


        val myvalue = getIntent().getIntExtra("amountRight", 0)
        if (myvalue != null) {
            Log.d("myvalue", myvalue.toString())
        }

        binding.progressResult.progress = myvalue
        binding.textValueresult.text = "$myvalue" + "/" + binding.progressResult.max

    }
}