package com.example.jetpackcomposechecking

import android.content.Context
import com.example.jetpackcomposechecking.ListItems.User
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStream

object DataManager {

    var data = emptyArray<User>()

    fun getUser() : List<User>  {

        val list = mutableListOf<User>()
        list.add(User("user", "abc", "abc@jhh", "uhrh"))
        list.add(User("user1", "abcd", "abc@jhh", "uhrh"))
        list.add(User("user2", "abcrr", "abc@jhh", "uhrh"))
        list.add(User("user3", "abcqwe", "abc@jhh", "uhrh"))
        return list
    }

    fun loadJsonFromAsset(context: Context, fileName : String) {
        val inputStream  = context.assets.open(fileName)
        val size : Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<User>::class.java)


        /*val user = Gson().fromJson(json, List<User>::class.java)
        return Gson().fromJson(json, type)

        val bufferedReader : BufferedReader = inputStream.bufferedReader()
        bufferedReader.use {
            return it.readText()
        }*/
    }
}