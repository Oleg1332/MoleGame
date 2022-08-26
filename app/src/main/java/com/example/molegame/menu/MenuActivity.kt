package com.example.molegame.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.molegame.appComponent
import com.example.molegame.databinding.ActivityMainBinding
import com.example.molegame.game.GameActivity
import javax.inject.Inject

class MenuActivity : AppCompatActivity() {
    private lateinit var menuComponent: MenuComponent
    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var menuViewModel: MenuViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        menuComponent = this.appComponent.menuComponent().create()
        menuComponent.inject(this)

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews() {
        binding.buttonStart.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }

        menuViewModel.getRecord().observe(this) { record ->
            binding.textviewRecord.text = "Current record:\n$record"
        }
    }
}