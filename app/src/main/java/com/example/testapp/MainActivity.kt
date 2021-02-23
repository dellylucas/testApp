package com.example.testapp

import android.os.Bundle
import android.view.View.OnFocusChangeListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        val autocompleteEditText = findViewById<AutoCompleteTextView>(R.id.autocompleteEditTexta)
        autocompleteEditText?.setAdapter(
            ArrayAdapter(
                this,
                R.layout.texterr,
                arrayListOf("aaaa", "aabbb", "aabbbb", "aabbbbb", "aabbbbbb", "aabbbbbbb", "aabbbbbbbb", "aabbbbbbbbb")
            )
        )
    }
}