package com.example.culculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import javax.security.auth.Subject

class MainActivity : AppCompatActivity() {
    lateinit var btnadd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnmultiply: Button
    lateinit var  tvAdd : TextView
    lateinit var tvSubtract: TextView
    lateinit var tvModulus:TextView
    lateinit var tvProduct:TextView
    lateinit var etNum1:EditText
    lateinit var  etNum2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btn_add)
        btnSubtract = findViewById(R.id.btn_subtract)
        btnModulus = findViewById((R.id.btn_modulus))
        btnmultiply = findViewById(R.id.tvProduct)
        tvAdd = findViewById(R.id.tvAdd)
        tvSubtract = findViewById(R.id.tvSubtract)
        tvModulus = findViewById(R.id.tvModulus)
        tvProduct = findViewById(R.id.tvProduct)
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)


        btnadd.setOnClickListener {
            var Num1 = etNum1.text.toString().toInt()
            var Num2 = etNum2.text.toString().toInt()
            calculateAddition(Num1, Num2)
        }
        btnModulus.setOnClickListener {
            var Num1 = etNum1.text.toString().toInt()
            var Num2 = etNum2.text.toString().toInt()
            calculateRemainder(Num1, Num2)
        }
        btnmultiply.setOnClickListener {
            var Num1 = etNum1.text.toString().toInt()
            var NUm2 = etNum2.text.toString().toInt()
            calculateProduct(Num1, NUm2)
        }
        btnSubtract.setOnClickListener {
            var Num1=etNum1.text.toString().toInt()
            var Num2=etNum2.text.toString().toInt()
             calculateSubtraction(Num1,Num2)
        }

    }

     fun calculateSubtraction(num1: Int, num2: Int) {
         var subtraction=num1-num2
         tvSubtract.text=subtraction.toString()

    }

    fun calculateProduct(num1: Int, nUm2: Int) {
        var multiplication=num1*nUm2
        tvProduct.text=multiplication.toString()

    }

    fun calculateRemainder(num1:Int, num2: Int) {
        var Modulus=num1%num2
        tvModulus.text=Modulus.toString()

    }

    fun calculateAddition(num1: Int, num2: Int) {
        var sum=num1+num2
        tvAdd.text=sum.toString()

    }

}
