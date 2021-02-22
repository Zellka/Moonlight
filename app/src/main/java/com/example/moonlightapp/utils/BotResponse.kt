package com.example.moonlightapp.utils

import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            //Hello
            message.contains("привет") || message.contains("здравствуйте") -> {
                when (random) {
                    0 -> "Привет!"
                    1 -> "Здравствуйте"
                    2 -> "Добрый день"
                    else -> "error" }
            }

            //How are you?
            message.contains("как дела") -> {
                when (random) {
                    0 -> "Всё хорошо. Спасибо"
                    1 -> "Неплохо.Спасибо!"
                    2 -> "Прекрасно"
                    else -> "error"
                }
            }

            //when the programme doesn't understand
            else -> {
                when (random) {
                    0 -> "Я не понимаю..."
                    1 -> "Попробуйте спросить что-нибудь другое"
                    2 -> "Я не могу ответить"
                    else -> "error"
                }
            }
        }
    }
}