package com.chandravir.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            when(it.itemId) {
                R.id.home -> {
                    openHome()
                    Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()

                }
                R.id.dashboard -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, DashboardFragment())
                        .commit()
                    Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show()

                }
                R.id.guard -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, GuardFragment())
                        .commit()

                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ProfileFragment())
                        .commit()
                    Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()

                }

            }
            return@setOnItemSelectedListener true





        }

    }

    private fun openHome() {

    }

}