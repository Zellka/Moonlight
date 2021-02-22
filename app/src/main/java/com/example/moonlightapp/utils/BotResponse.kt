package com.example.moonlightapp.utils

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {

            message.contains("привет") || message.contains("здравствуйте") -> {
                when (random) {
                    0 -> "Привет!"
                    1 -> "Здравствуйте"
                    2 -> "Добрый день"
                    else -> "error" }
            }

            message.contains("да") -> "1.Как оформить заказ\n2.Условия доставки\n3.Сколько ждать заказ?\n4.Как можно оплатить?\n5.Как можно связаться?\n\nили задайте свой вопрос"
            message.contains("спасибо") || message.contains("ок") -> {
                when (random) {
                    0 -> "Был рад помочь"
                    1 -> "Обращайтесь ещё"
                    2 -> "Всегда рад помочь"
                    else -> "error" }
            }
            message.contains("1") -> "Перейдите в раздел 'Корзина' и нажмите на 'Оформить заказ'"
            message.contains("2") -> "Доставка осуществляется по всему Донецку. Доставка бесплатная. Минимальная сумма доставки - 400 рублей"
            message.contains("3") -> "Среднее время ожидания 30-60 минут"
            message.contains("4") -> "Оплата производится наличными курьеру"
            message.contains("5") -> "По номеру телефона: +38 (071) 333–33-00"

            message.contains("достав") && message.contains("?") -> "Доставка осуществляется по всему Донецку. За дополнительной информацией обращайтесь: +38 (071) 333–33-00 "
            message.contains("жало") -> "Вы можете обратиться: +38 (071) 333–33-00"

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