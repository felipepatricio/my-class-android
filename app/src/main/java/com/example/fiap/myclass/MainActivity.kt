package com.example.fiap.myclass

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.fiap.myclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnRegister: Button = findViewById<Button>(R.id.btn_register_profile)
        val edtFullName: EditText = findViewById<EditText>(R.id.edt_full_name)
        val edtEmail: EditText = findViewById<EditText>(R.id.edt_email)
        val edtPassword: EditText = findViewById<EditText>(R.id.edt_password)

        btnRegister.setOnClickListener(View.OnClickListener {
            val registerPersist = this.getSharedPreferences("userData", Context.MODE_PRIVATE)
            val edit = registerPersist.edit()

            edit.putString("full_name", edtFullName.text.toString())
            edit.putString("email", edtEmail.text.toString())
            edit.putString("password", edtPassword.text.toString())
            edit.apply()

            Toast.makeText(this, "Usuário registrado", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        })
    }
}