package com.example.calculator_kotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Math.ulp
import kotlin.math.*
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    private var number:Double = 0.0
    private var number1: Double = 0.0
    private lateinit var numberInput: TextView
    private lateinit var delText: String
    var action by Delegates.notNull<Char>()
    private var check: Boolean = true
    private var checkNumber: Boolean = true
    private var checkAction: Boolean = true
    private var delete: Boolean = true
    private var checkZero: Boolean = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberInput = findViewById(R.id.inputoutputtext)
        if(savedInstanceState!=null)
        {
            number = savedInstanceState.getDouble("number")
            number1 = savedInstanceState.getDouble("number1")
            action = savedInstanceState.getChar("action")
            checkAction = savedInstanceState.getBoolean("checkAction")
            checkNumber = savedInstanceState.getBoolean("checkNumber")
            check = savedInstanceState.getBoolean("check")
            delete = savedInstanceState.getBoolean("delete")
            numberInput.text = savedInstanceState.getString("numberInput")
        }

    }


    public fun onClick(view: View){
        try{
            if (numberInput.text.toString() == "Infinity" || numberInput.text == "Wrong operation" || numberInput.text == "NaN"){
                numberInput.text = "Wrong operation"
                checkNumber = false
                delete = false

            }
            when (view.id){
                R.id.btn_zero ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("0")


                }
                R.id.btn_one ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("1")


                }
                R.id.btn_two ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("2")


                }
                R.id.btn_three ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("3")


                }
                R.id.btn_four ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("4")


                }
                R.id.btn_five ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("5")


                }
                R.id.btn_six ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("6")


                }
                R.id.btn_seven ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("7")


                }
                R.id.btn_eight ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("8")

                }
                R.id.btn_nine ->{
                    if(numberInput.length() == 1 && numberInput.text.toString()[0] == '0'){
                        numberInput.text= "";
                    }
                    if(checkNumber && checkZero)
                        numberInput.append("9")


                }
                R.id.btn_plus ->{
                   check = true
                    checkNumber = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = ""
                    action = '+'

                }
                R.id.btn_minus ->{
                    check = true
                    checkNumber = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = ""
                    action = '-'

                }
                R.id.btn_mult ->{
                    check = true
                    checkNumber = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = ""
                    action = '×'

                }
                R.id.btn_divide ->{
                    check = true
                    checkNumber = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = ""
                    action = '/'

                }
                R.id.btn_power ->{
                    check = true
                    checkNumber = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = ""
                    action = 'p'

                }
                R.id.btn_del ->{
                    if(delete){
                        delText = numberInput.text.toString()
                        if(delText.isNotEmpty()){
                            delText =  delText.substring(0, delText.length - 1)
                            numberInput.setText(delText)
                        }
                    }

                }

                R.id.btn_c ->{
                    checkNumber = true
                    checkAction =true
                    check = true
                    delete = true
                    number = 0.0
                    number1 = 0.0
                    numberInput.text = ""
                }

                R.id.btn_square ->{
                    checkNumber = true
                    check = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    numberInput.text = Math.pow(number, 2.0).toString()

                }

                R.id.btn_root ->{
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    if (number>=0){
                        numberInput.text = Math.sqrt(number).toString()
                    } else {
                        numberInput.text = "Wrong action"
                        delete = false
                    }

                }

                R.id.btn_equal ->{
                    checkNumber = false
                    check = false
                    number1 = numberInput.text.toString().toDouble()
                   if (number1 == 0.0 && action == '/') {
                       numberInput.text = "Cannot divide by 0"
                       delete =  false
                   } else if (number1>323 && action =='p'){
                       numberInput.text = "Too big Number for power operation"
                       delete = false
                   } else {
                       numberInput.text = action(number, number1).toString()
                       number = number1
                       checkAction = false

                   }
                }
                R.id.btn_dot -> {
                    if(check && checkNumber) {

                        numberInput.text ="${numberInput.text}."
                        check = false
                        checkZero = true
                    }
                }

                R.id.btn_percent ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                   numberInput.text = (number1/100).toString()

                }

                R.id.btn_sin ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 == 30.0)
                        numberInput.text = "0.5"
                    else
                        numberInput.text = sin(Math.toRadians(number1)).toString()

                }

                R.id.btn_cos ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 == 60.0)
                        numberInput.text = "0.5"
                    else if(number1 == 90.0)
                        numberInput.text = "0"
                    else
                        numberInput.text = cos(Math.toRadians(number1)).toString()

                }

                R.id.btn_tan ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 == 90.0) {
                        numberInput.text = "not defined"
                        checkNumber = false
                        delete = false
                    }
                    else
                        numberInput.text = tan(Math.toRadians(number1)).toString()

                }

                R.id.btn_cot ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 == 0.0) {
                        numberInput.text = "not defined"
                        checkNumber = false
                        delete = false
                    }
                    else
                        numberInput.text =(1/tan(Math.toRadians(number1))).toString()

                }

                R.id.btn_ln ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 < 1) {
                        numberInput.text = "Not a number"
                        checkNumber = false
                        delete = false
                    }
                    else
                        numberInput.text = ln(number1).toString()

                }

                R.id.btn_log ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }
                    if (number1 <1) {
                        numberInput.text = "Not a number"
                        checkNumber = false
                        delete = false
                    }
                    else
                        numberInput.text = log10(number1).toString()

                }

                R.id.btn_fact ->{
                    check = true
                    checkNumber = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number1 = numberInput.text.toString().toDouble()
                    }

                    var fact:Long = 1

                  if(number1<20){
                      for (i in 1..number1.toInt())
                          fact *= i

                    numberInput.text = fact.toString()}
                    else
                        numberInput.text = "too big number for factorial"
                    delete = false
                    checkAction = false
                    checkNumber = false
                    check = false


                }

                R.id.btn_powersqrt ->{
                    checkNumber = true
                    check = true
                    checkAction = true
                    if(numberInput.text.toString().isNotEmpty()){
                        number = numberInput.text.toString().toDouble()
                    }
                    if(number>=0){
                        numberInput.text = ""
                        action = 's'
                    } else {
                        numberInput.text = "Wrong action"
                        delete = false
                    }

                }
            }

        } catch (e: Exception){
            numberInput.text = "Wrong operation"
        }

    }

    public fun action(number: Double, number1: Double): Double {
        when(action){
            '+' ->
                return number+number1
            '-' ->
                return number-number1
            '×' ->
                return number*number1
            '/' ->
                return number/number1
            'p'->
                return number.pow(number1)
            's'->{
                var dres: Double = number.pow(1/number1)
                var ires = round(dres)
                var diff: Double = abs(dres-ires)
                if(diff< ulp(10.0)){
                    return ires
                } else {
                    return dres
                }
            }
        }
        return 0.0

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("numberInput", numberInput.text.toString())
        outState.putDouble("number", number)
        outState.putDouble("number1", number1)
        outState.putBoolean("check", check)
        outState.putBoolean("checkNumber", checkNumber)
        outState.putBoolean("delete", delete)
        outState.putBoolean("checkAction", checkAction)
        outState.putChar("action", action)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        super.onRestoreInstanceState(savedInstanceState)
        savedInstanceState.getString("numberInput")
        savedInstanceState.getDouble("number")
        savedInstanceState.getDouble("number1")
        savedInstanceState.getBoolean("checkNumber")
        savedInstanceState.getBoolean("check")
        savedInstanceState.getChar("action")
        savedInstanceState.getBoolean("delete")
        savedInstanceState.getBoolean("checkAction")
    }
}
