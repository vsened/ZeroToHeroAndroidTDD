package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var string: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        string = if (savedInstanceState != null) {
            getString(R.string.i_am_an_android_developer)
        } else {
            getString(R.string.hello_world)
        }
        initViews()
        button.setOnClickListener {
            textView.text = getString(R.string.i_am_an_android_developer)
        }
    }

    private fun initViews() {
        textView = findViewById(R.id.titleTextView)
        textView.text = string
        button = findViewById(R.id.changeButton)
    }
}
