package com.example.myanimalapp

// MainActivity.kt
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myanimalapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.button1.setOnClickListener{
            onClickMethod1(it)
        }
        binding.button2.setOnClickListener{
            onClickMethod2(it)
        }
        binding.button3.setOnClickListener{
            onClickMethod3(it)
        }
    }

    private fun onClickMethod1(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("animal",
            Animal(resources.getString(R.string.cat_name),
            R.drawable.cat_img,
            resources.getString(R.string.cat_details)))
        startActivity(intent)
    }

    private fun onClickMethod2(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("animal",
            Animal(resources.getString(R.string.dog_name),
                R.drawable.dog_img,
                resources.getString(R.string.dog_details)))
        startActivity(intent)
    }

    private fun onClickMethod3(v: View) {
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra("animal",
            Animal(resources.getString(R.string.bunny_name),
                R.drawable.bunny_img,
                resources.getString(R.string.bunny_details)))
        startActivity(intent)
    }
}


