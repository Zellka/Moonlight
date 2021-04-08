package com.example.moonlightapp.utils

object BotResponse {

    fun getBasicResponses(yourMessage: String): String {

        val random = (0..2).random()
        val message = yourMessage.toLowerCase()

        return when {

            message.contains("привет") || message.contains("здравствуйте") -> {
                when (random) {
                    0 -> "Привет!"
                    1 -> "Здравствуйте"
                    2 -> "Добрый день"
                    else -> "error" }
            }

            message.contains("да") -> "Выберите:\n\n1. Оформить заказ\n2. Условия доставки\n3. Сколько ждать заказ?\n4. Как можно оплатить?\n\nили задайте свой вопрос"
            message.contains("спасибо") || message.contains("ок") -> {
                when (random) {
                    0 -> "Был рад помочь"
                    1 -> "Обращайтесь ещё"
                    2 -> "Всегда рад помочь"
                    else -> "error" }
            }
            message.contains("свой вопрос") || message.contains("вопрос") -> "Какой?"
            message.contains("1") -> "Перейдите в раздел 'Корзина' и перейдите в 'Оформить заказ'"
            message.contains("2") -> "Доставка осуществляется по всему Донецку. Доставка бесплатная. Минимальная сумма заказа - 400 рублей"
            message.contains("3") -> "Среднее время ожидания 30-60 минут"
            message.contains("4") -> "Оплата производится наличными курьеру"

            message.contains("достав") && message.contains("?") -> "Доставка осуществляется по всему Донецку. За дополнительной информацией обращайтесь: +38 (071) 333–33-00"
            message.contains("жало") -> "Вы можете обратиться: +38 (071) 333–33-00"

            else -> "Обратитесь по номеру: +38 (071) 333–33-00"
        }
    }
}