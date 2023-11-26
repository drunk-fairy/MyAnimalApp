package com.example.myanimalapp

// DetailsActivity.kt
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myanimalapp.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal = intent.getParcelableExtra<Animal>("animal")
        animal?.let {
            binding.imageviewDetails.setImageResource(it.imageResId)
            binding.nameTextviewDetails.text = it.name
            binding.descriptionTextviewDetails.text = it.description
        }
    }
}