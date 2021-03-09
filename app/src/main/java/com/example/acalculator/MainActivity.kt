package com.example.acalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName
    var LastCalc = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        val date = Calendar.getInstance().time
        var dateTimeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())

        button_0.setOnClickListener {
            Log.i(TAG, "Click no botão 0")
            if (text_visor.text == "0") {
                text_visor.text = "0"
            } else {
                text_visor.append("0")
            }
            Toast.makeText(this, "Use btn 0 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_1.setOnClickListener {
            Log.i(TAG, "Click no botão 1")
            if (text_visor.text == "0") {
                text_visor.text = "1"
            } else {
                text_visor.append("1")
            }
            Toast.makeText(this, "Use btn 1 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_2.setOnClickListener {
            Log.i(TAG, "Click no botão 2")
            if (text_visor.text == "0") {
                text_visor.text = "2"
            } else {
                text_visor.append("2")
            }
            Toast.makeText(this, "Use btn 2 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_3.setOnClickListener {
            Log.i(TAG, "Click no botão 3")
            if (text_visor.text == "0") {
                text_visor.text = "3"
            } else {
                text_visor.append("3")
            }
            Toast.makeText(this, "Use btn 3 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_4.setOnClickListener {
            Log.i(TAG, "Click no botão 4")
            if (text_visor.text == "0") {
                text_visor.text = "4"
            } else {
                text_visor.append("4")
            }
            Toast.makeText(this, "Use btn 4 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_5.setOnClickListener {
            Log.i(TAG, "Click no botão 5")
            if (text_visor.text == "0") {
                text_visor.text = "5"
            } else {
                text_visor.append("5")
            }
            Toast.makeText(this, "Use btn 5 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_6.setOnClickListener {
            Log.i(TAG, "Click no botão 6")
            if (text_visor.text == "0") {
                text_visor.text = "6"
            } else {
                text_visor.append("6")
            }
            Toast.makeText(this, "Use btn 6 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_7.setOnClickListener {
            Log.i(TAG, "Click no botão 7")
            if (text_visor.text == "0") {
                text_visor.text = "7"
            } else {
                text_visor.append("7")
            }
            Toast.makeText(this, "Use btn 7 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_8.setOnClickListener {
            Log.i(TAG, "Click no botão 8")
            if (text_visor.text == "0") {
                text_visor.text = "8"
            } else {
                text_visor.append("8")
            }
            Toast.makeText(this, "Use btn 8 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_9.setOnClickListener {
            Log.i(TAG, "Click no botão 9")
            if (text_visor.text == "0") {
                text_visor.text = "9"
            } else {
                text_visor.append("9")
            }
            Toast.makeText(this, "Use btn 9 - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_adition.setOnClickListener {
            Log.i(TAG, "Click no botão +")
            text_visor.append("+")
            Toast.makeText(this, "Use btn + - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_sub.setOnClickListener {
            Log.i(TAG, "Click no botão -")
            text_visor.append("-")
            Toast.makeText(this, "Use btn (-) - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_division.setOnClickListener {
            Log.i(TAG, "Click no botão /")
            text_visor.append("/")
            Toast.makeText(this, "Use btn / - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_mult.setOnClickListener {
            Log.i(TAG, "Click no botão *")
            text_visor.append("*")
            Toast.makeText(this, "Use btn * - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_last.setOnClickListener {
            Log.i(TAG, "Click no botão Last")
            text_visor.text = LastCalc
            Toast.makeText(this, "Use btn LAST - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_t2.setOnClickListener {
            Log.i(TAG, "Click no botão Test2")
            text_visor.text = "Palmeiras Campeão"
            Toast.makeText(
                this,
                "Use btn Test2 - ${dateTimeFormat.format(date)}",
                Toast.LENGTH_SHORT
            ).show()
        }

        button_reset.setOnClickListener {
            Log.i(TAG, "Click no botão Reset")
            text_visor.text = ("0")
            Toast.makeText(
                this,
                "Use btn Reset - ${dateTimeFormat.format(date)}",
                Toast.LENGTH_LONG
            ).show()
        }

        button_dec.setOnClickListener {
            Log.i(TAG, "Click no botão Decimal")
            text_visor.append(".")
            Toast.makeText(this, "Use btn . - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_back.setOnClickListener {
            Log.i(TAG, "Click no botão <")
            if (text_visor.length() > 0) {
                text_visor.text = text_visor.text.substring(0, text_visor.length() - 1)
            } else {
                text_visor.text = "0"
            }
            Toast.makeText(this, "Use btn Back - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }

        button_equals.setOnClickListener {
            Log.i(TAG, "Click no botão =")
            LastCalc = "${text_visor.text}"
            val expression = ExpressionBuilder(text_visor.text.toString()).build()
            text_visor.text = expression.evaluate().toString()
            Log.i(TAG, "O Resultado da expressão é ${text_visor.text}")
            Toast.makeText(this, "Use btn = - ${dateTimeFormat.format(date)}", Toast.LENGTH_SHORT)
                .show()
        }


    }
}