package com.example.transferapp

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(context: Context) {
    private val preferences: SharedPreferences = context.getSharedPreferences("AppPrefs", Context.MODE_PRIVATE)

    companion object {
        private const val QUESTIONS_SHOWN = "questions_shown"
    }

    fun areQuestionsShown(): Boolean {
        return preferences.getBoolean(QUESTIONS_SHOWN, false)
    }

    fun setQuestionsShown(shown: Boolean) {
        val editor = preferences.edit()
        editor.putBoolean(QUESTIONS_SHOWN, shown)
        editor.apply()
    }
}
