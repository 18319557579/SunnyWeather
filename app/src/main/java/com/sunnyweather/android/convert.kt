package com.sunnyweather.android

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main(){
//    GlobalScope.launch {
//        println("codes run in coroutine scope")
//    }
//    Thread.sleep(1000)

    val str = "C:\\Users\\11525\\AndroidStudioProjects\\SunnyWeather"
    println(str.replace("\\","/"))
    println("你好2")

}