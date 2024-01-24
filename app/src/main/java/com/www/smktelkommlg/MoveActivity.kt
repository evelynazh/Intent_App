package com.www.smktelkommlg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button



abstract class MoveActivity : AppCompatActivity(),
    View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val btnBackActivity: Button =
            findViewById(R.id.btn_back1)
        btnBackActivity.setOnClickListener(this)



    }

    fun OnClick(v: View) {
        when (v.id) {
            R.id.btn_back1 -> {
                val backIntent = Intent(
                    this@MoveActivity,
                    MainActivity::class.java
                )
                startActivity(backIntent)
            }
        }
    }
}