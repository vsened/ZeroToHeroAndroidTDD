package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        if (savedInstanceState != null) {
            textView.visibility = View.INVISIBLE
        } else {
            textView.visibility = View.VISIBLE
        }

        button.setOnClickListener {
            textView.visibility = if
                    (textView.visibility == View.VISIBLE) View.INVISIBLE
            else View.VISIBLE
        }
    }

    private fun initViews() {
        textView = findViewById(R.id.titleTextView)
        button = findViewById(R.id.hideButton)
    }
}