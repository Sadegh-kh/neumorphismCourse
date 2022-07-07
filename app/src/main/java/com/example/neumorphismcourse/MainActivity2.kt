package com.example.neumorphismcourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.neumorphismcourse.databinding.ActivityMain2Binding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        navigationAct()
    }

    private fun navigationAct() {
        binding.btnNeuBattery.setOnClickListener {
            neuOn(binding.btnNeuBattery)
            neuOff(binding.btnNeuDry)
            neuOff(binding.btnNeuProgram)
            neuOff(binding.btnNeuRange)
        }
        binding.btnNeuDry.setOnClickListener {
            neuOn(binding.btnNeuDry)
            neuOff(binding.btnNeuBattery)
            neuOff(binding.btnNeuProgram)
            neuOff(binding.btnNeuRange)
        }
        binding.btnNeuProgram.setOnClickListener {
            neuOn(binding.btnNeuProgram)
            neuOff(binding.btnNeuDry)
            neuOff(binding.btnNeuBattery)
            neuOff(binding.btnNeuRange)
        }
        binding.btnNeuRange.setOnClickListener {
            neuOn(binding.btnNeuRange)
            neuOff(binding.btnNeuDry)
            neuOff(binding.btnNeuProgram)
            neuOff(binding.btnNeuBattery)
        }
    }


    fun neuOn(viewNeu:NeumorphImageView){
        viewNeu.setShapeType(ShapeType.PRESSED)
        viewNeu.setColorFilter(
            ContextCompat.getColor(
                this,R.color.blue_light
            ), android.graphics.PorterDuff.Mode.SRC_IN
        )
    }
    fun neuOff(viewNeu: NeumorphImageView){
        viewNeu.setShapeType(ShapeType.FLAT)
        viewNeu.setColorFilter(
            ContextCompat.getColor(
                this,R.color.gray_text
            ), android.graphics.PorterDuff.Mode.SRC_IN
        )
    }


}