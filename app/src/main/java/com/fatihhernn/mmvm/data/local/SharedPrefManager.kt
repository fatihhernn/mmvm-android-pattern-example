package com.fatihhernn.mmvm.data.local

import android.content.Context
import android.content.SharedPreferences

class SharedPrefManager(context: Context) {

    companion object{
        const val TOKEN="com.fatihhernn.TOKEN"
    }

    private val sharedPreferences : SharedPreferences =
        context.getSharedPreferences("sharedPreferences",Context.MODE_PRIVATE)

    fun saveToken(token: String) {
        sharedPreferences.edit().putString(TOKEN,token).apply()
    }
    fun getToken(): String? {
        return sharedPreferences.getString(TOKEN,"")
    }
}