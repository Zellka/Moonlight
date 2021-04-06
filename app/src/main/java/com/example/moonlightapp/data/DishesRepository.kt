package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish

class DishesRepository {
    fun getAppetizerData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шампиньоны с пряным нутом и зелёным булгуром",
                "287",
                "https://2.downloader.disk.yandex.ua/disk/378795578ff26e4f5c78cea577cd9152aa9078c2c149d186cb99380c9b8afa11/606ca251/pvVNPdxkXXJ88uIpOLiGcMsSuv1S8Kcmqz6cQJzF9KlZ6e6FEEGpEyf_ANHUq3MrsB6Ln33TYhZoBia91DXk_A%3D%3D?uid=1186320270&filename=sn1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37520&hid=ca8a18657aa7eee373585d6453092296&media_type=image&tknv=v2&etag=3120504ec13b66a7ef36afd4048525a7",
                "Шампиньоны, сушёный чеснок, оливковое масло, черри, орегано, нут, паприка, булгур, перец чили, хмели-сунели",
                "270 г",
                "548 ккал"
            )
        )
        items.add(
            Dish(
                "Хумус с овощными палочками",
                "257",
                "https://1.downloader.disk.yandex.ua/disk/4544f043c9076474dee501129f0de4a55157943212ae75e1c547acc98c2cb537/606ca259/pvVNPdxkXXJ88uIpOLiGcMOvZvsqiX597v6o9bRptASOOMCH5fo4Htb5vvVNoNJcjeY9DZlEIeJFfk9eauVSEg%3D%3D?uid=1186320270&filename=sn2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29149&hid=d2da0fe865b6eaad0862a71ae2a5de90&media_type=image&tknv=v2&etag=c87ef88386aff9f209344dba7ff5f0ae",
                "Болгарский перец, огурцы, морковь, черри, сельдерей, нут, оливковое масло, паста тахина, соль",
                "230 г",
                "270 ккал"
            )
        )
        items.add(
            Dish(
                "Поке с креветками",
                "427",
                "https://4.downloader.disk.yandex.ua/disk/10efe3733e703c183d3faf9465c1cf5528b3f016d207b16749ba67863469d491/606ca25e/pvVNPdxkXXJ88uIpOLiGcCtaDY6fZ7_Z_fQjMy4gL_GZAnOOZZKGdN3hsXC4zZ8n1hfI5e9BqmRu1b2_YncDQg%3D%3D?uid=1186320270&filename=sn3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29628&hid=4666fd648312a7378222213c4f74e34d&media_type=image&tknv=v2&etag=19cba387d8777df6816924d5e0068ac0",
                "Рис, уксус, сахар, соль, огурец, креветки, соевый соус, кунжутное масло, тобико, шпинат, майонез, шрирача, чеснок",
                "240 г",
                "393 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с чёрной смородиной",
                "127",
                "https://2.downloader.disk.yandex.ua/disk/ebee1dec0765ee35ebbc60bc3e43f90e217c82b957bd8d7c9f91b01aa046dd87/606ca264/pvVNPdxkXXJ88uIpOLiGcGswYn26qFY9o1fkiBEhWMVpgnpxbbxXaPo05psm8DJhl5ozqHp0c-j6CjxOOpVtNA%3D%3D?uid=1186320270&filename=sn4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19285&hid=1cccaf5226ae6457e5c75ba53c16e0fc&media_type=image&tknv=v2&etag=27fb5134b88c6bd10447d759dcb1a7ff",
                "Пшеничная мука, чёрная смородина, вода, сахар, подсолнечное масло, дрожжи, соль",
                "120 г",
                "340 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с картошкой и грибами",
                "127",
                "https://4.downloader.disk.yandex.ua/disk/8bc1948ae3f4a32be37550aaa2f716b9f5ebe87510d64f57efedf13bae7bd2d4/606ca268/pvVNPdxkXXJ88uIpOLiGcCEBUi7F8S9WyVk_HIz0IwzzaJpM_UnMmmymUJfysqLYvGPds1BQNnXWzDpipomz6Q%3D%3D?uid=1186320270&filename=sn5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=18653&hid=0f13a95dc392d6c26e49b18b2f255cbd&media_type=image&tknv=v2&etag=aa7b2ee720894ddd9119123c2eb098e8",
                "Пшеничная мука, картофель, шампиньоны, репчатый лук, вода, сахар, подсолнечное масло, соль, перец чёрный молотый",
                "120 г",
                "277 ккал"
            )
        )
        return items
    }

    fun getSaladData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Салат с ростбифом и соусом вафу",
                "497",
                "https://4.downloader.disk.yandex.ua/disk/ec6974de38e1225550d96aacf323567def149936db7b5b33f0056c061b2236b8/606ca310/pvVNPdxkXXJ88uIpOLiGcCP9_sLrW1m4NJAGGgodmDilBMMlzX9YB62uU7Gnbfa7gIae11ahB-f1RatYs8kK1w%3D%3D?uid=1186320270&filename=sal1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36966&hid=93e65dde6db38c70d6538a6310fd0281&media_type=image&tknv=v2&etag=911a858fe2e76816ce833c392e34a226",
                "Руккола, айсберг, романо, черри, соевый соус, говядина, чёрный перец, стручковая фасоль, кунжутное масло, винный уксус, дижонская горчица, репчатый лук",
                "180 г",
                "281 ккал"
            )
        )
        items.add(
            Dish(
                "Печёная свекла с сиртаки и петрушкой",
                "197",
                "https://4.downloader.disk.yandex.ua/disk/535540e02dfb1c5cbab5f857fcf2e415fa307a28fc441b3d3274ee09b5648228/606ca316/pvVNPdxkXXJ88uIpOLiGcI5N2dNSa4pnj67TZQ2dyY413I6f8TwMYvakvHhuVoR7jJMZLtcFYujdpHsaN_Ovcg%3D%3D?uid=1186320270&filename=sal2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29910&hid=15c3be121500af0fc8e2decd721ab4d4&media_type=image&tknv=v2&etag=21a38df433e7956063423e1e864af3fb",
                "Свекла, оливковое масло, петрушка, сиртаки",
                "200 г",
                "438 ккал"
            )
        )
        items.add(
            Dish(
                "Рататуй",
                "187",
                "https://1.downloader.disk.yandex.ua/disk/9fdfb3a58b7b71247ef5df67b0e5fd76fec9e795d8eb2741040623853a0483bf/606ca343/pvVNPdxkXXJ88uIpOLiGcJAS5OIxwmKcH0rdOaMrSuiI2Dju3tBj81qQLd7vAwUtqDK3DwlULdncgkr_9J8UKQ%3D%3D?uid=1186320270&filename=sal3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29393&hid=b7afad1667a7bd17a1316873e13fdd29&media_type=image&tknv=v2&etag=70288b68f271886a8cd9541244bad429",
                "Кабачок, баклажан, болгарский перец, репчатый лук, прованские травы",
                "150 г",
                "182 ккал"
            )
        )
        items.add(
            Dish(
                "Фунчоза по-корейски",
                "187",
                "https://4.downloader.disk.yandex.ua/disk/a06389ca3614e4df4d2d8c1ee4cda839ee9974c1806b0d48ecf03402c70be065/606ca31f/pvVNPdxkXXJ88uIpOLiGcKUoCAxthNCmDt0PSKcg0nj2zMNSWKK9yI4b85klX6BowXbJgdBLsCiVRhaoH3iggg%3D%3D?uid=1186320270&filename=sal4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27557&hid=ba5c22564eabc8b4c6c54b1f6a36f414&media_type=image&tknv=v2&etag=f14a59cdd4a646861788c89b481d3aed",
                "Фунчоза, морковь, кориандр, чеснок, болгарский перец, огурец",
                "200 г",
                "164 ккал"
            )
        )
        items.add(
            Dish(
                "Цезарь с куриной грудкой",
                "497",
                "https://1.downloader.disk.yandex.ua/disk/8e698380003ecbf172a96fe246c913f9b4e7c81ae4fcf1a836c97b4c95cc1d9d/606ca324/pvVNPdxkXXJ88uIpOLiGcNRpn1rKh6z4BDKV3BmIsItWgKZrVIh_MQL7oul9AtrhQYyTIWVOkfvby1CHNk5sFQ%3D%3D?uid=1186320270&filename=sal5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36374&hid=b250325eb0c621152c935d226dcd55f7&media_type=image&tknv=v2&etag=d3268dd57ea9145e12922a5f57c60f17",
                "Гренки, айсберг, романо, курица, барбекю, паприка, пармезан, каперсы, анчоусы, майонез",
                "290 г",
                "717 ккал"
            )
        )
        return items
    }

    fun getMainDishData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Рагу из говядины с салатом",
                "497",
                "https://1.downloader.disk.yandex.ua/disk/b368e5edd7ee2cf109bb9669410cfc178efc2bbf419d7bed6b4e9ee306d04aff/606ca36b/pvVNPdxkXXJ88uIpOLiGcBYVjyN3O6IjefONHw2JI2uRce_B81VZ2ulERp9JpPAl57poH90sR1tIbLbdqyfTWw%3D%3D?uid=1186320270&filename=m1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=35055&hid=00d4fb5c19340b3e1a3442c16e4dcc26&media_type=image&tknv=v2&etag=2a5780a1ee1dc2e4a635cb8c3ee37513",
                "Говядина, картофель, морковь, кинза, черри, романо, айсберг",
                "350 г",
                "505 ккал"
            )
        )
        items.add(
            Dish(
                "Домашние котлеты со стручковой фасолью",
                "387",
                "https://1.downloader.disk.yandex.ua/disk/3eb7526099684e68e60ee003b63363cb8aa096beacaf6109da1cb08f17a43af8/606ca370/pvVNPdxkXXJ88uIpOLiGcI1_2HbnYKasewqIH_xaQwGcP9Cb9xX34l7qVLALzfp6gnAfragvvTX-mqxuyR9qFA%3D%3D?uid=1186320270&filename=m2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34062&hid=074b92cb90d459b861b1af9561714d45&media_type=image&tknv=v2&etag=2627c393ff62b8a9d09bf0b144859128",
                "Говядина, репчатый лук, яйцо, стручковая фасоль, свит чили соус, свинина, сливки",
                "250 г",
                "514 ккал"
            )
        )
        items.add(
            Dish(
                "Курина грудка-гриль",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/f466654c65a03ce897be3f6b31f03cd39d8afaf219b442e2b1387ff469099523/606ca374/pvVNPdxkXXJ88uIpOLiGcBfKsIEA2Gk9mjeRdYmcUn5SdXVDDStTiQiyoZ7WRz3OvcXUVCbT0qym7WYZvV0XCQ%3D%3D?uid=1186320270&filename=m3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=39867&hid=545989e4ce5eb426cb7595c67ff89b6d&media_type=image&tknv=v2&etag=e9fe4ecf86ae4d27b40c80001c795398",
                "Стручковая фасоль, барбекю, айсберг, курица, черри",
                "270 г",
                "452 ккал"
            )
        )
        items.add(
            Dish(
                "Куриный шницель с брокколи",
                "397",
                "https://3.downloader.disk.yandex.ua/disk/a4bba314fb46203157eed579f74f6365f3467c574a662234452e7e28ebeefa49/606ca379/pvVNPdxkXXJ88uIpOLiGcHbtHVwMHBLMKuP_4tFgAwesYc-LMKNJwJA512OJDF5ZKMeH-NixeoeA9cFw2JLD9Q%3D%3D?uid=1186320270&filename=m4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33230&hid=f858b9150a4b62ad0b8c9af1730b8867&media_type=image&tknv=v2&etag=567fef47842beecf50054d8c02632f13",
                "Курица, брокколи, пшеничная мука, яйцо, сухарики, свит чили соус",
                "270 г",
                "716 ккал"
            )
        )
        items.add(
            Dish(
                "Свиные колбаски-гриль с картофельным пюре",
                "357",
                "https://1.downloader.disk.yandex.ua/disk/674186b0d124a97fdc4ad0d9840ad6c8e82c5efb1e9f1192265991fa84515ad2/606ca37f/pvVNPdxkXXJ88uIpOLiGcA7F3__n6MqSDLeUY4RtDYjBqryxGkzoeUyUY2iktIBaeiG_CcMBl1we_VNJEg4JEg%3D%3D?uid=1186320270&filename=m5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=30445&hid=ecbab725253d04a529cc669c57a0adc4&media_type=image&tknv=v2&etag=2e0214677e4628384298cc04b3c4feb3",
                "Свинина, курица, крахмал, молоко, сырный соус, картофель, глюкозный сироп",
                "350 г",
                "1082 ккал"
            )
        )
        return items
    }

    fun getSideDishData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Рис с рататуем и гаспачо",
                "197",
                "https://3.downloader.disk.yandex.ua/disk/b70239fc6c0391a356e15e9f7f4313849c118108db40d0df5a4a68930c6555ab/606ca3b8/pvVNPdxkXXJ88uIpOLiGcLV1eH2CYPrdYbdna1KgLX1IcMO7I1ILrKtHYFxVM5db78IPQavEKTV-nrdUoB8DtQ%3D%3D?uid=1186320270&filename=s1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33974&hid=3ccfc6753a68f3932c8b680486f07c24&media_type=image&tknv=v2&etag=94943dab1877f40e52160d3b0ca3033a",
                "Рис, болгарский перец, кабачок, баклажан, гаспачо",
                "230 г",
                "375 ккал"
            )
        )
        items.add(
            Dish(
                "Удон с говядиной",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/cb1ec7dd3d00f23dd1ca44af4fd1e711780eabc34b3d6f8c1221da33a0cd6f0b/606ca3bc/pvVNPdxkXXJ88uIpOLiGcIDJ9v4AzV3ALs5F51ScOwUBmZNbnJlfxBmU5a4ugh3Ab4PydidPQ7FyX8U3ymEaIQ%3D%3D?uid=1186320270&filename=s2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37035&hid=911eceabf0d09bcb1bc7c8b5b443909e&media_type=image&tknv=v2&etag=68fd2e9ebf1c7bce252d3ef718f3818c",
                "Говядина, морковь, брокколи, удон, красный лук, кунжут, соль",
                "280 г",
                " 567 ккал"
            )
        )
        items.add(
            Dish(
                "Пенне с брокколи и лососем",
                "497",
                "https://4.downloader.disk.yandex.ua/disk/d4046f6b3ab7dc3d88356f6f91d50fefa9eb4711d0ada1e0ac441fa302d5fea7/606ca3c3/pvVNPdxkXXJ88uIpOLiGcOZ7OGiKvdsK7WViQtvtzFxiSugChep75P3WhzbImF1O5ezguq7AU5G68JA9xKH7mg%3D%3D?uid=1186320270&filename=s3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36527&hid=ce403d9c4e2486cfc08c1ccb786d81ec&media_type=image&tknv=v2&etag=56170e0a71df15e1e0381f80d5e3a9c4",
                "Лосось, брокколи, пенне, пармезан, сливки, соль",
                "270 г",
                "633 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти карбонара",
                "297",
                "https://4.downloader.disk.yandex.ua/disk/3f87320d336439156c178aa0e9d43f0f5bfecc9db82d70746c37883d1bb3fa5d/606ca3c7/pvVNPdxkXXJ88uIpOLiGcOTeqSJBz-IYYzkIhs03owBug1KOYzRVPGtq9w2cwZFlSRkt6Hho1jmtJcNb9IxJQw%3D%3D?uid=1186320270&filename=s4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=32962&hid=4f24264e2c6050ef9b47a9cbf8d196ff&media_type=image&tknv=v2&etag=0e7851f39cf765a610d75e880211f3fd",
                "Бекон, спагетти, сливки, чеснок, соль, яйцо",
                "270 г",
                "913 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти с куриной грудкой, шпинатом и сливками",
                "547",
                "https://2.downloader.disk.yandex.ua/disk/96c8664fda55b579c10f714ab247e71bfb4f1e6a20eab9513bd17d8e60d1c019/606ca3cc/pvVNPdxkXXJ88uIpOLiGcOxneorYrlwulvpT8hI4uAkC9pZklda4NHC8va7j6sxA0yTF5hEL9-iA90h1kj5MqA%3D%3D?uid=1186320270&filename=s5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37062&hid=69075a6f4cc3907aa683a71670e320f8&media_type=image&tknv=v2&etag=291f6c9b9be8c80049b26688c03c58fe",
                "Спагетти, шпинат, курица, паприка, базилик, кедровый орех, пармезан",
                "280 г",
                "630 ккал"
            )
        )
        return items
    }

    fun getDessertData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шоколадный мусс",
                "237",
                "https://4.downloader.disk.yandex.ua/disk/1ff684257adf93b760d51ac48f0c037d2432917a90a5068973eec542a47d9d17/606ca40d/pvVNPdxkXXJ88uIpOLiGcIelIJjtyHVH5s8dm6Gz5K8QQdygi8CgEQzLG2tlfWkNQs8EG2wu7_Df-8LvJcdekg%3D%3D?uid=1186320270&filename=d1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=25404&hid=8cf24c06cc075ff502cbbd17ffccf8af&media_type=image&tknv=v2&etag=d026f8b4b4ff66b2a10bfe9b562190c0",
                "Голубика, фундук, какао, кокосовое молоко, финики, соль",
                "140 г",
                "381 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный брауни",
                "267",
                "https://3.downloader.disk.yandex.ua/disk/7fb4ec9d70a8662afde9a5e653c158628349983217b2f8a49543db1d399b23fc/606ca411/pvVNPdxkXXJ88uIpOLiGcAQb-_WDbuKwNgFqrzhGUjDLhZUww1_2L7-uWzf8GrhZpI3DwawmUFMrFM_0oo-83Q%3D%3D?uid=1186320270&filename=d2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22817&hid=4a2a621c7ff719f3e125cf44cc9250db&media_type=image&tknv=v2&etag=16ce7000bda5b01f580109369050b0f1",
                "Сахар, яйцо, шоколад, пшеничная мука, фундук, сливочное масло, тёмный шоколад",
                "180 г",
                "470 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный кекс",
                "257",
                "https://2.downloader.disk.yandex.ua/disk/ada3eef307f022c0f24a31ae008db277a63bc16bf19791d881dc9b9f7e505ee1/606ca418/pvVNPdxkXXJ88uIpOLiGcOEFUHoENBgJppVqihQxkS7_2tchruTXIpbafQ9OiJsjosqHVd3k6tsAjPU0g3SCHg%3D%3D?uid=1186320270&filename=d3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=21505&hid=f7a92abf66427efc68b80a835eb61ffe&media_type=image&tknv=v2&etag=a78438abee840d857614da2c08e9b7ca",
                "Шоколад, мука, сахар, яйцо, сливки, молоко, ванилин, сливочное масло",
                "150 г",
                "355 ккал"
            )
        )
        items.add(
            Dish(
                "Наполеон",
                "137",
                "https://1.downloader.disk.yandex.ua/disk/9632474960299afcdb26a0b3ce9d84689797b54a2823b7c7db6fd4203651fff5/606ca41d/pvVNPdxkXXJ88uIpOLiGcCeGIZlV_PaQlxNXDVg53ryapBlgIGBl_Q2ff98MJqT2J-OkqMWjGiOFD2uWVQ8Iqg%3D%3D?uid=1186320270&filename=d4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=26582&hid=e06ea8a5711ab31cfd2ad9c05572f973&media_type=image&tknv=v2&etag=22300da6cd204dbdcc01706da6c785e8",
                "Пшеничная мука, сливочное масло, молоко, яйцо, сгущёнка, крахмал кукурузный, вода",
                "115 г",
                "641 ккал"
            )
        )
        items.add(
            Dish(
                "Тарталетка солёная карамель с фундуком",
                "157",
                "https://2.downloader.disk.yandex.ua/disk/60888ad1b5ea9c3f33b3ea39c1051aae00e25144255ebcace734d8869faf95d7/606ca425/pvVNPdxkXXJ88uIpOLiGcPMPVv8jtgHkZZvrjVf4ivNerhF9EuInZZjT3j9J1Z4fbEkq9pmUD8vFnK62qenoNw%3D%3D?uid=1186320270&filename=d5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22386&hid=76dfaeba0effbb02ff18f53d523b0952&media_type=image&tknv=v2&etag=8b9ce34f856e4d403f6c0280a026d57b",
                "Пшеничная мука, сливочное масло, мёд, сливки, фундук, яйцо, какао, сахар",
                "90 г",
                "400 ккал"
            )
        )
        return items
    }
}