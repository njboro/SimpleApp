package com.example.simpleapp.programs

object AppConfig {
    var theme = "Light"
    var language = "English"

    fun showConfig() {
        println("Theme: $theme, language: $language")
    }
}

fun main() {
    AppConfig.theme = "Dark"
    AppConfig.showConfig()
}