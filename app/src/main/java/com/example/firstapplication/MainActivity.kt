package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sendBtn: Button = findViewById(R.id.btn1)
        val nameEdit: EditText = findViewById(R.id.text1)
        sendBtn.setOnClick {
            val userEmailEntered: String nameEdit.text.toString()
            Snackbar.make(findViewById())
        }
    }

}