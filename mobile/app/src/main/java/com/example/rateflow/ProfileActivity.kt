package com.example.rateflow

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class ProfileActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Connect XML to this Activity
        setContentView(R.layout.profile_page)

        val btnLogout = findViewById<MaterialButton>(R.id.btnLogout)

        btnLogout.setOnClickListener {

            // Example: Go back to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            // Close current activity
            finish()
        }

    }


}