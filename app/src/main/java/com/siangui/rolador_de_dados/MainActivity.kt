package com.siangui.rolador_de_dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewByld(R.id.button)
        rollButton.setOnclickListener{
            vall resultTextView: TextView = findViewByld(R.id.textView)
            resultTextView.text ="6"
        }

    }
}