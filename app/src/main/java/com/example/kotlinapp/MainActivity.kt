package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinapp.weigts.Rectangle

class MainActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.simpleName;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData();
//        val s = getContent("1");
//        Log.w(TAG, "s--->$s");

//        rang(9);
//        cycle();

        val rect: Rectangle = Rectangle(3, 4);
        Log.w(TAG, "width--->${rect.width}")
        Log.w(TAG, "height--->${rect.height}")


    }

    private fun initData() {
        val items = listOf<String>("aaa", "bbbb", "ccc");
        val num = items.lastIndex;
        Log.w(TAG, "num--->$num");
        when {
            "aaa" in items -> Log.w(TAG, "aaa 在集合里面")
            "bbb" !in items -> Log.w(TAG, "bbb 不在集合里面")
        }
//        for (index in items.indices) {
//            if (index == 1) {
//                Log.w(TAG, "item--->${items[index]}");
//            }
//        }

        val fruits = listOf("banana", "aAocado", "aBple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase() }
            .forEach { Log.w(TAG, "it--->${it}") }
    }

    private fun getContent(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "你好"
            is String -> "String"
            !is String -> "not a String"
            else -> "unknown"
        }


    private fun rang(x: Int) {
        if (x in 1..10 step 2) {
            Log.w(TAG, "在区间范围内")
        } else {
            Log.w(TAG, "不在区间范围内")
        }
    }

    private fun cycle() {
        for (x in 1..10 step 2) {
            Log.w(TAG, "x-->$x")
        }
    }


}