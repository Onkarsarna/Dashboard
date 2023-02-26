package com.example.dashboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide();
        this.getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );

    }

     private fun dataCheck() {
          if (loginInput.editableText.toString().isEmpty())  {
              Toast.makeText(this,"Please Enter Email Id",Toast.LENGTH_SHORT).show()
              return
          }
         else if(pswdInput.editableText.toString().isEmpty()) {
             Toast.makeText(this,"Please Enter Password",Toast.LENGTH_SHORT).show()
         return
         }
    }

   private fun credCheck(){
        val userName ="1"
        val password = "1"
        val email =loginInput.editableText.toString()
        val pass= pswdInput.editableText.toString()
        if(email.equals(userName, ignoreCase = true) && pass ==password )
        {
            val intent = Intent(this,BoardPage::class.java)
            startActivity(intent)
        }
          else {
           Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_SHORT).show()
       }
    }
    fun signInBtn(view: View) {
        /*val name = loginInput.editableText.toString()
        Toast.makeText(this, "Button is pressed by $name", Toast.LENGTH_LONG).show()*//*
        if (loginInput.editableText.toString().isEmpty())  {
            Toast.makeText(this,"Please Enter Email Id",Toast.LENGTH_LONG).show()
        }
        else if(pswdInput.editableText.toString().isEmpty()) {
            Toast.makeText(this,"Please Enter Password",Toast.LENGTH_LONG).show()
        }*/
        dataCheck()
        credCheck()
    }

    }