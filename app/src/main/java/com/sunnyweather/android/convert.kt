package com.sunnyweather.android

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){
//    GlobalScope.launch {
//        println("codes run in coroutine scope")
//    }
//    Thread.sleep(1000)

    val str = "app\\src\\main\\java\\com\\sunnyweather\\android\\logic\\model"
    println(str.replace("\\","/"))
    println("你好")

}