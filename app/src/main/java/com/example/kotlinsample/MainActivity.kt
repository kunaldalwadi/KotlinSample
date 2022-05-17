package com.example.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("Hello this is starting of onCreate")

        doSomething()

        val ans = fibonacci(5)

        println(ans)

        printMultiTable(1..8, 1..5)

    }

    fun doSomething() {
        println("I am here doing something.")
    }

    fun fibonacci(number: Int): Long {
        return if (number < 2) {
            1
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2)
        }
    }

    fun printMultiTable(rows: IntRange, cols: IntRange) {

        for (row in rows) {
            for (col in cols) {
                System.out.format("%-8d", row * col)
            }
        }
    }

    fun gcd(num1: Int, num2: Int): Int {

        var max = 1;

        if (num1 <= num2) {
            for (n in 1..num1)
            {
                if(num1 % n == 0 && num2 % n == 0)
                {
                    max = Math.max(max, n)
                }
            }
        }

        return max;
    }

}
