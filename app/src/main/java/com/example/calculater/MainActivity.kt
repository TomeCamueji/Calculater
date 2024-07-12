package com.example.calculater

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import javax.script.ScriptEngineManager

class MainActivity : AppCompatActivity() {

    private lateinit var textInput: TextView
    private lateinit var textResult: TextView
    private lateinit var btnsqr: Button
    private lateinit var btnPi: Button
    private lateinit var btnPower: Button
    private lateinit var btnFatorial: Button
    private lateinit var btnclear: Button
    private lateinit var btnParent: Button
    private lateinit var btnPorcent: Button
    private lateinit var btnDiv: Button
    private lateinit var btnMult: Button
    private lateinit var btnSub: Button
    private lateinit var btnAdd: Button
    private lateinit var btnegual: Button
    private lateinit var btnpoint: Button
    private lateinit var btnBackspace: Button
    private lateinit var btn0: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.text_input)
        textResult = findViewById(R.id.text_result)
        btn0 = findViewById(R.id.btn_0)
        btn1 = findViewById(R.id.btn_1)
        btn2 = findViewById(R.id.btn_2)
        btn3 = findViewById(R.id.btn_3)
        btn4 = findViewById(R.id.btn_4)
        btn5 = findViewById(R.id.btn_5)
        btn6 = findViewById(R.id.btn_6)
        btn7 = findViewById(R.id.btn_7)
        btn8 = findViewById(R.id.btn_8)
        btn9 = findViewById(R.id.btn_9)
        btnsqr = findViewById(R.id.btn_sqr)
        btnPi = findViewById(R.id.btn_pi)
        btnPower = findViewById(R.id.btn_power)
        btnFatorial = findViewById(R.id.btn_fatorial)
        btnclear = findViewById(R.id.btn_clear)
        btnParent = findViewById(R.id.btn_parent)
        btnPorcent = findViewById(R.id.btn_porcent)
        btnDiv = findViewById(R.id.btn_div)
        btnMult = findViewById(R.id.btn_mult)
        btnSub = findViewById(R.id.btn_sub)
        btnAdd = findViewById(R.id.btn_add)
        btnegual = findViewById(R.id.btn_egual)
        btnpoint = findViewById(R.id.btn_point)
        btnBackspace = findViewById(R.id.btn_backspace)

        textInput.movementMethod = ScrollingMovementMethod()
        textInput.isActivated = true
        textInput.isPressed = true

        var str: String

        btn0.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "0"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "0"
                expressionText(str)
                resultText()
            }
        }
        btn1.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "1"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "1"
                expressionText(str)
                resultText()
            }
        }
        btn2.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "2"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "2"
                expressionText(str)
                resultText()
            }}
        btn3.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "3"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "3"
                expressionText(str)
                resultText()
            } }
        btn4.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "4"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "4"
                expressionText(str)
                resultText()
            }
        }
        btn5.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "5"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "5"
                expressionText(str)
                resultText()
            }
        }
        btn6.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "6"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "6"
                expressionText(str)
                resultText()
            }
        }
        btn7.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "7"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "7"
                expressionText(str)
                resultText()
            }
        }
        btn8.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "8"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "8"
                expressionText(str)
                resultText()
            }
        }
        btn9.setOnClickListener {
            if (textInput.text.toString().startsWith("0")){
                str = textInput.text.toString().replace("0","") + "9"
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "9"
                expressionText(str)
                resultText()
            }
        }
        btnsqr.setOnClickListener {
        }
        btnPi.setOnClickListener {  }
        btnPower.setOnClickListener {
            if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
                textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
                textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
                textInput.text.toString().endsWith("**")){
                str = textInput.text.toString()
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "**"
                expressionText(str)
            }
        }
        btnParent.setOnClickListener {  }
        btnPorcent.setOnClickListener {
            if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
                textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
                textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
                textInput.text.toString().endsWith("**")){
                str = textInput.text.toString()
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "%"
                expressionText(str)
            }
        }
        btnFatorial.setOnClickListener {  }
        btnclear.setOnClickListener {
            expressionText("0")
            textInput.textSize = 60f
            textResult.textSize = 30f
            resultText()
        }
        btnMult.setOnClickListener {
            if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
                textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
                textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
                textInput.text.toString().endsWith("**")){
                str = textInput.text.toString()
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "*"
                expressionText(str)
            }
        }
        btnAdd.setOnClickListener {  if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
            textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
            textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
            textInput.text.toString().endsWith("**")){
            str = textInput.text.toString()
            expressionText(str)
            resultText()
        }else{
            str = textInput.text.toString() + "+"
            expressionText(str)
        } }
        btnegual.setOnClickListener {
            textInput.textSize = 30f
            textResult.textSize = 60f
        }
        btnDiv.setOnClickListener {
            if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
                textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
                textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
                textInput.text.toString().endsWith("**")){
                str = textInput.text.toString()
                expressionText(str)
                resultText()
            }else{
                str = textInput.text.toString() + "/"
                expressionText(str)
            }
        }
        btnSub.setOnClickListener {  if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
            textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
            textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
            textInput.text.toString().endsWith("**")){
            str = textInput.text.toString()
            expressionText(str)
            resultText()
        }else{
            str = textInput.text.toString() + "-"
            expressionText(str)
        } }
        btnpoint.setOnClickListener {  if (textInput.text.toString().endsWith("%")|| textInput.text.toString().endsWith("/")||
            textInput.text.toString().endsWith("+")||textInput.text.toString().endsWith("*")||
            textInput.text.toString().endsWith("-")||textInput.text.toString().endsWith(",")||
            textInput.text.toString().endsWith("**")){
            str = textInput.text.toString()
            expressionText(str)
            resultText()
        }else{
            str = textInput.text.toString() + ","
            expressionText(str)
        } }
        btnBackspace.setOnClickListener {
            if (textInput.text.toString().isNotEmpty()){
                val lastindex = textInput.text.toString().lastIndex
                str = textInput.text.toString().substring(0,lastindex)
                expressionText(str)
                resultText()
            }
        }

    }

    private fun expressionText(str: String) {
        textInput.text = str
    }

    private fun resultText() {
        val exp = textInput.text.toString()
        val engine = ScriptEngineManager().getEngineByName("rhino")

        try {
            val result = engine.eval(exp).toString()
            textResult.text = "$result"
        } catch (e: Exception) {
            textResult.text = "Erro: ${e.message}"
        }
    }

}