package com.example.radiobuttonsandcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener {
            val radioGroupID=rgMeat.checkedRadioButtonId
            val meat=findViewById<RadioButton>(radioGroupID)
            val cheese=cbCheese.isChecked
            val onion=cbOnion.isChecked
            val tomato=cbTomato.isChecked
            tvOrder.text="You ordered a burger with:\n"+
                    "${meat.text}\n"+
                    (if (cheese) "Cheese\n" else "")+
                    (if (tomato) "Tomato\n" else "")+
                    (if (onion) "Onion\n" else "")

        }



    }
}