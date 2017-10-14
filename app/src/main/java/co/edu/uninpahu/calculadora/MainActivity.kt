package co.edu.uninpahu.calculadora

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.estudiantes.calculadora.R
import java.util.ArrayList


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private val screen: TextView? = null
    private val mContext: Context? = null
    private val numA: Int? = null
    private val numB: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById(R.id.btn0).setOnClickListener(this)
        findViewById(R.id.btn1).setOnClickListener(this)
        findViewById(R.id.btn2).setOnClickListener(this)
        findViewById(R.id.btn3).setOnClickListener(this)
        findViewById(R.id.btn4).setOnClickListener(this)
        findViewById(R.id.btn5).setOnClickListener(this)
        findViewById(R.id.btn6).setOnClickListener(this)
        findViewById(R.id.btn7).setOnClickListener(this)
        findViewById(R.id.btn8).setOnClickListener(this)
        findViewById(R.id.btn9).setOnClickListener(this)
        findViewById(R.id.btn_cls).setOnClickListener(this)
    }

    override fun onClick(button_var: View) {
        val button = button_var.id
        val result = findViewById(R.id.resultView) as TextView
        when (button) {
            R.id.btn0 -> result.append("0")
            R.id.btn1 -> result.append("1")
            R.id.btn2 -> result.append("2")
            R.id.btn3 -> result.append("3")
            R.id.btn4 -> result.append("4")
            R.id.btn5 -> result.append("5")
            R.id.btn6 -> result.append("6")
            R.id.btn7 -> result.append("7")
            R.id.btn8 -> result.append("8")
            R.id.btn9 -> result.append("9")
            R.id.btn_cls -> result.text = null
            else -> {
            }
        }
    }
}
