package com.example.transferapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Find the TextView by its ID
        val alreadyHaveAnAccountButton = findViewById<TextView>(R.id.AlreadyHaveAnAccount)

        // Set an OnClickListener on the TextView
        alreadyHaveAnAccountButton.setOnClickListener {
            // Create an Intent to navigate to LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            // Start the LoginActivity
            startActivity(intent)
        }
        val registerbutton= findViewById<Button>(R.id.RegisterButton)

        registerbutton.setOnClickListener {
            val intent= Intent(this, QuestionsActivity::class.java)
            startActivity(intent)
        }
    }
}
