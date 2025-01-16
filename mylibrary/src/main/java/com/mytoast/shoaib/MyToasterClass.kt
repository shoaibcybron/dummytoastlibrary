package com.mytoast.shoaib

import android.content.Context
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MyToasterClass {
    companion object{
        fun myMethod(context: Context, msg: String) {
            CoroutineScope(Dispatchers.Main).launch {
                Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
            }
        }
    }
}