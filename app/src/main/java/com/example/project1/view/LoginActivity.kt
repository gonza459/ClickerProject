package com.example.project1.view

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.project1.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginUsernameField.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(p0: Editable?){

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int){

            }

            override fun onTextChanged(p0: CharSequence?,p1: Int, p2: Int, p3: Int ){

            }


        })

        loginButton.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java).apply{putExtra("username", loginUsernameField.text)})
        }


    }
}