package com.example.calculadora_

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val calculo = findViewById<TextView>(R.id.calculo)
        val resultado = findViewById<TextView>(R.id.resultado)
        val num1 = findViewById<Button>(R.id.um)
        val num2 = findViewById<Button>(R.id.dois)
        val num3 = findViewById<Button>(R.id.tres)
        val num4 = findViewById<Button>(R.id.quatro)
        val num5 = findViewById<Button>(R.id.cinco)
        val num6 = findViewById<Button>(R.id.seis)
        val num7 = findViewById<Button>(R.id.sete)
        val num8 = findViewById<Button>(R.id.oito)
        val num9 = findViewById<Button>(R.id.nove)
        val num0 = findViewById<Button>(R.id.zero)
        val limpar = findViewById<Button>(R.id.clear)
        val parentesq = findViewById<Button>(R.id.parentesq)
        val parentdir = findViewById<Button>(R.id.parentdir)
        val divisao = findViewById<Button>(R.id.divisao)
        val multiplicar = findViewById<Button>(R.id.multipli)
        val subtracao = findViewById<Button>(R.id.subtracao)
        val soma = findViewById<Button>(R.id.soma)
        val ponto = findViewById<Button>(R.id.ponto)
        val apagar = findViewById<ImageButton>(R.id.deletar)
        val igual = findViewById<Button>(R.id.igual)




        num1.setOnClickListener{
            calculo.text = "${calculo.text}1"
        }
        num2.setOnClickListener{
            calculo.text = "${calculo.text}2"
        }
        num3.setOnClickListener{
            calculo.text = "${calculo.text}3"
        }
        num4.setOnClickListener{
            calculo.text = "${calculo.text}4"
        }
        num5.setOnClickListener{
            calculo.text = "${calculo.text}5"
        }
        num6.setOnClickListener{
            calculo.text = "${calculo.text}6"
        }
        num7.setOnClickListener{
            calculo.text = "${calculo.text}7"
        }
        num8.setOnClickListener{
            calculo.text = "${calculo.text}8"
        }
        num9.setOnClickListener{
            calculo.text = "${calculo.text}9"
        }
        num0.setOnClickListener{
            calculo.text = "${calculo.text}0"
        }
        parentesq.setOnClickListener{
            calculo.text = "${calculo.text}("
        }
        parentdir.setOnClickListener{
            calculo.text = "${calculo.text})"
        }
        divisao.setOnClickListener{
            calculo.text = "${calculo.text}/"
        }
        multiplicar.setOnClickListener{
            calculo.text = "${calculo.text}*"
        }
        subtracao.setOnClickListener{
            calculo.text = "${calculo.text}-"
        }
        soma.setOnClickListener{
            calculo.text = "${calculo.text}+"
        }
        ponto.setOnClickListener{
            calculo.text = "${calculo.text}."
        }
        apagar.setOnClickListener{

            calculo.text = calculo.text.dropLast(1)

        }
        limpar.setOnClickListener{
            calculo.text = ""
            resultado.text = ""
        }
        igual.setOnClickListener {
            val resultadoCalculo = Expression(calculo.text.toString()).calculate()

            if (resultadoCalculo.isNaN()) {
                resultado.text = "Expressão Inválida"
            } else {
                // Verifica se o número é inteiro ou decimal
                val resultadoFormatado = if (resultadoCalculo % 1.0 == 0.0) {
                    resultadoCalculo.toInt().toString() // Exibe sem decimal se for inteiro
                } else {
                    resultadoCalculo.toString() // Exibe com decimal se for necessário
                }

                resultado.text = resultadoFormatado
            }
        }

    }
}