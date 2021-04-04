package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish

class DishesRepository {
    fun getAppetizerData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шампиньоны с пряным нутом и зелёным булгуром",
                "287",
                "https://4.downloader.disk.yandex.ua/disk/c7e1fd8e0f90104425a2955cf9f8616ac10c5008193cfd0c0667a7500254a284/6069cae0/pvVNPdxkXXJ88uIpOLiGcMsSuv1S8Kcmqz6cQJzF9KlZ6e6FEEGpEyf_ANHUq3MrsB6Ln33TYhZoBia91DXk_A%3D%3D?uid=1186320270&filename=%D0%B7%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B0_1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37520&hid=ca8a18657aa7eee373585d6453092296&media_type=image&tknv=v2&etag=3120504ec13b66a7ef36afd4048525a7",
            "Шампиньоны, сушёный чеснок, оливковое масло, черри, орегано, нут, паприка, булгур, перец чили, хмели-сунели",
                "270 г",
                "548 ккал"
            )
        )
        items.add(
            Dish(
                "Хумус с овощными палочкми",
                "257",
                "https://1.downloader.disk.yandex.ua/disk/35ebdf4792cab59761f9bb365e42dc06ce877782108b7fb7a71384a4333a9faa/6069caf8/pvVNPdxkXXJ88uIpOLiGcMOvZvsqiX597v6o9bRptASOOMCH5fo4Htb5vvVNoNJcjeY9DZlEIeJFfk9eauVSEg%3D%3D?uid=1186320270&filename=%D0%B7%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B0_2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29149&hid=d2da0fe865b6eaad0862a71ae2a5de90&media_type=image&tknv=v2&etag=c87ef88386aff9f209344dba7ff5f0ae",
                "Болгарский перец, огурцы, морковь, черри, сельдерей, нут, оливковое масло, паста тахина, соль",
                "230 г",
                "270 ккал"
            )
        )
        items.add(
            Dish(
                "Поке с креветками",
                "427",
                "https://4.downloader.disk.yandex.ua/disk/4cf3fe100aef304824abf5b0667a68accd37200076e98b54883f889e6c89a594/6069cafd/pvVNPdxkXXJ88uIpOLiGcCtaDY6fZ7_Z_fQjMy4gL_GZAnOOZZKGdN3hsXC4zZ8n1hfI5e9BqmRu1b2_YncDQg%3D%3D?uid=1186320270&filename=%D0%B7%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B0_3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29628&hid=4666fd648312a7378222213c4f74e34d&media_type=image&tknv=v2&etag=19cba387d8777df6816924d5e0068ac0",
            "Рис, уксус, сахар, соль, огурец, креветки, соевый соус, кунжутное масло, тобико, шпинат, майонез, шрирача, чеснок",
                "240 г",
                "393 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с чёрной смородиной",
                "127",
                "https://1.downloader.disk.yandex.ua/disk/7480dc6201d3da7582b3f2d3c84fb3f399b346a50f5ac40a3048f9e52293c8c5/6069cb01/pvVNPdxkXXJ88uIpOLiGcGswYn26qFY9o1fkiBEhWMVpgnpxbbxXaPo05psm8DJhl5ozqHp0c-j6CjxOOpVtNA%3D%3D?uid=1186320270&filename=%D0%B7%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B0_4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19285&hid=1cccaf5226ae6457e5c75ba53c16e0fc&media_type=image&tknv=v2&etag=27fb5134b88c6bd10447d759dcb1a7ff",
            "Пшеничная мука, чёрная смородина, вода, сахар, подсолнечное масло, дрожжи, соль",
                "120 г",
                "340 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с картошкой и грибами",
                "127",
                "https://1.downloader.disk.yandex.ua/disk/5d00762f1d0ac70aa7a28062c2d46c7fae6f48abbb6fea8739770a6c89335db7/6069cb08/pvVNPdxkXXJ88uIpOLiGcCEBUi7F8S9WyVk_HIz0IwzzaJpM_UnMmmymUJfysqLYvGPds1BQNnXWzDpipomz6Q%3D%3D?uid=1186320270&filename=%D0%B7%D0%B0%D0%BA%D1%83%D1%81%D0%BA%D0%B0_5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=18653&hid=0f13a95dc392d6c26e49b18b2f255cbd&media_type=image&tknv=v2&etag=aa7b2ee720894ddd9119123c2eb098e8",
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
                "https://4.downloader.disk.yandex.ua/disk/f110b62d38c7667a4934e4f33a2acaca44080cb729b2bf973085058e2ca50c6f/6069d0c0/pvVNPdxkXXJ88uIpOLiGcAeGYswxgWxj1PCCz1mNfndoXoP7F9y765zAPcarvMIGvBKmlZ1V2jih2RZjEZreHQ%3D%3D?uid=1186320270&filename=%D1%81%D0%B0%D0%BB%D0%B0%D1%82_1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36966&hid=93e65dde6db38c70d6538a6310fd0281&media_type=image&tknv=v2&etag=911a858fe2e76816ce833c392e34a226",
            "Руккола, айсберг, романо, черри, соевый соус, говядина, чёрный перец, стручковая фасоль, кунжутное масло, винный уксус, дижонская горчица, репчатый лук",
            "180 г",
            "281 ккал"
            )
        )
        items.add(
            Dish(
                "Печёная свекла с сиртаки и петрушкой",
                "197",
                "https://4.downloader.disk.yandex.ua/disk/14bf3ef1c14e31757f680d3b4dd7b4cf386d3db59e9a492838025ed5a4ffb981/6069d0c6/pvVNPdxkXXJ88uIpOLiGcI5N2dNSa4pnj67TZQ2dyY413I6f8TwMYvakvHhuVoR7jJMZLtcFYujdpHsaN_Ovcg%3D%3D?uid=1186320270&filename=%D1%81%D0%B0%D0%BB%D0%B0%D1%82_2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29910&hid=15c3be121500af0fc8e2decd721ab4d4&media_type=image&tknv=v2&etag=21a38df433e7956063423e1e864af3fb",
                "Свекла, оливковое масло, петрушка, сиртаки",
                "200 г",
                "438 ккал")
        )
        items.add(
            Dish(
                "Рататуй",
                "187",
                "https://4.downloader.disk.yandex.ua/disk/a78a2b7d7c1b5a81867e721b95682c4fe30f0ba0c8197680f28594fd58b094ca/6069d0cb/pvVNPdxkXXJ88uIpOLiGcJAS5OIxwmKcH0rdOaMrSuiI2Dju3tBj81qQLd7vAwUtqDK3DwlULdncgkr_9J8UKQ%3D%3D?uid=1186320270&filename=%D1%81%D0%B0%D0%BB%D0%B0%D1%82_3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29393&hid=b7afad1667a7bd17a1316873e13fdd29&media_type=image&tknv=v2&etag=70288b68f271886a8cd9541244bad429",
                "Кабачок, баклажан, болгарский перец, репчатый лук, прованские травы",
                "150 г",
                "182 ккал")
        )
        items.add(
            Dish(
                "Фунчоза по-корейски",
                "187",
                "https://4.downloader.disk.yandex.ua/disk/c566f3190dc0b41639c423d24d5f01a9e131f2c1ffce0d15afe00382d36b33e5/6069d0d0/pvVNPdxkXXJ88uIpOLiGcKUoCAxthNCmDt0PSKcg0nj2zMNSWKK9yI4b85klX6BowXbJgdBLsCiVRhaoH3iggg%3D%3D?uid=1186320270&filename=%D1%81%D0%B0%D0%BB%D0%B0%D1%82_4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27557&hid=ba5c22564eabc8b4c6c54b1f6a36f414&media_type=image&tknv=v2&etag=f14a59cdd4a646861788c89b481d3aed",
                "Фунчоза, морковь, кориандр, чеснок, болгарский перец, огурец",
                "200 г",
                "164 ккал")
        )
        items.add(
            Dish(
                "Цезарь с куриной грудкой",
                "497",
                "https://1.downloader.disk.yandex.ua/disk/48bb847ba491e9393bfdc89a86cc088499fca2ba853a49e5908f01eaf04b4700/6069d0d4/pvVNPdxkXXJ88uIpOLiGcNRpn1rKh6z4BDKV3BmIsItWgKZrVIh_MQL7oul9AtrhQYyTIWVOkfvby1CHNk5sFQ%3D%3D?uid=1186320270&filename=%D1%81%D0%B0%D0%BB%D0%B0%D1%82_5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36374&hid=b250325eb0c621152c935d226dcd55f7&media_type=image&tknv=v2&etag=d3268dd57ea9145e12922a5f57c60f17",
                "Гренки, айсберг, романо, курица, барбекю, паприка, пармезан, каперсы, анчоусы, майонез",
                "290 г",
                "717 ккал" )
        )
        return items
    }

    fun getMainDishData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Рагу из говядины с салатом",
                "497",
                "https://2.downloader.disk.yandex.ua/disk/962d8909a39577ead78e7ca0b2cbbc48faa59abb0740887e2100c7f7929533a2/6069d3de/pvVNPdxkXXJ88uIpOLiGcD8XZ32knrkabsGJH0ww6mWzqa6nQhkOTmfREOHg5FhwbN7VyUveGIYWFaZtqADnnQ%3D%3D?uid=1186320270&filename=%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5_1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=35055&hid=00d4fb5c19340b3e1a3442c16e4dcc26&media_type=image&tknv=v2&etag=2a5780a1ee1dc2e4a635cb8c3ee37513",
                "Говядина, картофель, морковь, кинза, черри, романо, айсберг",
                "350 г",
                "505 ккал")
        )
        items.add(
            Dish(
                "Домашние котлеты со стручковой фасолью",
                "387",
                "https://4.downloader.disk.yandex.ua/disk/fe03c3601dbbd0545e853e6a1c0d9e14b352ca2bd78e8836f1c6e0439d4019a7/6069d3e3/pvVNPdxkXXJ88uIpOLiGcI1_2HbnYKasewqIH_xaQwGcP9Cb9xX34l7qVLALzfp6gnAfragvvTX-mqxuyR9qFA%3D%3D?uid=1186320270&filename=%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5_2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34062&hid=074b92cb90d459b861b1af9561714d45&media_type=image&tknv=v2&etag=2627c393ff62b8a9d09bf0b144859128",
                "Говядина, репчатый лук, яйцо, стручковая фасоль, свит чили соус, свинина, сливки",
                "250 г",
                "514 ккал" )
        )
        items.add(
            Dish(
                "Курина грудка-гриль",
                "397",
                "https://3.downloader.disk.yandex.ua/disk/6500fa89803ea200e144d5feb7496b098ab18456e7807e8af7a53e4da8051ec0/6069d3e8/pvVNPdxkXXJ88uIpOLiGcPoE1xtAmxcwghlKRgaY-MZUmkRoJ_GxXG9B1MSYA2nZNyadw0ZPceiobu8P0A51Dg%3D%3D?uid=1186320270&filename=%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5_3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=39867&hid=545989e4ce5eb426cb7595c67ff89b6d&media_type=image&tknv=v2&etag=e9fe4ecf86ae4d27b40c80001c795398",
                "Стручковая фасоль, барбекю, айсберг, курица, черри",
                "270 г",
                "452 ккал" )
        )
        items.add(
            Dish(
                "Куриный шницель с брокколи",
                "397",
                "https://2.downloader.disk.yandex.ua/disk/24fc64c630200a4537db09ffe5c7db786db9204f0a7f7c0ac45ffa006a3b7620/6069d3ed/pvVNPdxkXXJ88uIpOLiGcHbtHVwMHBLMKuP_4tFgAwesYc-LMKNJwJA512OJDF5ZKMeH-NixeoeA9cFw2JLD9Q%3D%3D?uid=1186320270&filename=%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5_4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33230&hid=f858b9150a4b62ad0b8c9af1730b8867&media_type=image&tknv=v2&etag=567fef47842beecf50054d8c02632f13",
                "Курица, брокколи, пшеничная мука, яйцо, сухарики, свит чили соус",
                "270 г",
                "716 ккал")
        )
        items.add(
            Dish(
                "Свиный колбаски_гриль с картофельным пюре",
                "357",
                "https://1.downloader.disk.yandex.ua/disk/e4cace4ad2d96f59cd7b60a09adf3e47d5a7555dc7e3897fe919c0b725eb12e5/6069d3f2/pvVNPdxkXXJ88uIpOLiGcA7F3__n6MqSDLeUY4RtDYjBqryxGkzoeUyUY2iktIBaeiG_CcMBl1we_VNJEg4JEg%3D%3D?uid=1186320270&filename=%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D0%BE%D0%B5_5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=30445&hid=ecbab725253d04a529cc669c57a0adc4&media_type=image&tknv=v2&etag=2e0214677e4628384298cc04b3c4feb3",
                "Свинина, курица, крахмал, молоко, сырный соус, картофель, глюкозный сироп",
                "350 г",
                "1082 ккал")
        )
        return items
    }

    fun getSideDishData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Рис с рататуем и гаспачо",
                "197",
                "https://4.downloader.disk.yandex.ua/disk/3522fe7e6407ca61f670a781d2b2ace0bafb1a43ba546deecee5abb0cfe97815/6069d6f0/pvVNPdxkXXJ88uIpOLiGcLV1eH2CYPrdYbdna1KgLX1IcMO7I1ILrKtHYFxVM5db78IPQavEKTV-nrdUoB8DtQ%3D%3D?uid=1186320270&filename=%D0%B3%D0%B0%D1%80%D0%BD%D0%B8%D1%80_1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33974&hid=3ccfc6753a68f3932c8b680486f07c24&media_type=image&tknv=v2&etag=94943dab1877f40e52160d3b0ca3033a",
                "Рис, болгарский перец, кабачок, баклажан, гаспачо",
                "230 г",
                "375 ккал" )
        )
        items.add(
            Dish(
                "Удон с говядиной",
                "397",
                "https://3.downloader.disk.yandex.ua/disk/6701397e2a671d6eedcd1242d6f59ea408d5c7e838488538925ecd3d060ac293/6069d6f5/pvVNPdxkXXJ88uIpOLiGcIDJ9v4AzV3ALs5F51ScOwUBmZNbnJlfxBmU5a4ugh3Ab4PydidPQ7FyX8U3ymEaIQ%3D%3D?uid=1186320270&filename=%D0%B3%D0%B0%D1%80%D0%BD%D0%B8%D1%80_2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37035&hid=911eceabf0d09bcb1bc7c8b5b443909e&media_type=image&tknv=v2&etag=68fd2e9ebf1c7bce252d3ef718f3818c",
                "Говядина, морковь, брокколи, удон, красный лук, кунжут, соль",
                "280 г",
                " 567 ккал")
        )
        items.add(
            Dish(
                "Пенне с брокколи и лососем",
                "497",
                "https://3.downloader.disk.yandex.ua/disk/1a3b03e4a0b37d911805f0bca29358e06af81570be148cf5c925584c8dcbfec1/6069d6f9/pvVNPdxkXXJ88uIpOLiGcOZ7OGiKvdsK7WViQtvtzFxiSugChep75P3WhzbImF1O5ezguq7AU5G68JA9xKH7mg%3D%3D?uid=1186320270&filename=%D0%B3%D0%B0%D1%80%D0%BD%D0%B8%D1%80_3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36527&hid=ce403d9c4e2486cfc08c1ccb786d81ec&media_type=image&tknv=v2&etag=56170e0a71df15e1e0381f80d5e3a9c4",
                "Лосось, брокколи, пенне, пармезан, сливки, соль",
                "270 г",
                "633 ккал")
        )
        items.add(
            Dish(
                "Спагетти карбонара",
                "297",
                "https://2.downloader.disk.yandex.ua/disk/85eb9b1fa787661a9381143894c3667e02267c5a541a28ae28aba7d208d13a9c/6069d702/pvVNPdxkXXJ88uIpOLiGcOTeqSJBz-IYYzkIhs03owBug1KOYzRVPGtq9w2cwZFlSRkt6Hho1jmtJcNb9IxJQw%3D%3D?uid=1186320270&filename=%D0%B3%D0%B0%D1%80%D0%BD%D0%B8%D1%80_4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=32962&hid=4f24264e2c6050ef9b47a9cbf8d196ff&media_type=image&tknv=v2&etag=0e7851f39cf765a610d75e880211f3fd",
                "Бекон, спагетти, сливки, чеснок, соль, яйцо",
                "270 г",
                "913 ккал")
        )
        items.add(
            Dish(
                "Спагетти с куриной грудкой, шпинатом и сливками",
                "547",
                "https://1.downloader.disk.yandex.ua/disk/eced583acfc3ea5884dc394f2891dbe8ee59a3cb7518455a2790890bca58dc20/6069d706/pvVNPdxkXXJ88uIpOLiGcOxneorYrlwulvpT8hI4uAkC9pZklda4NHC8va7j6sxA0yTF5hEL9-iA90h1kj5MqA%3D%3D?uid=1186320270&filename=%D0%B3%D0%B0%D1%80%D0%BD%D0%B8%D1%80_5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37062&hid=69075a6f4cc3907aa683a71670e320f8&media_type=image&tknv=v2&etag=291f6c9b9be8c80049b26688c03c58fe",
                "Спагетти, шпинат, курица, паприка, базилик, кедровый орех, пармезан",
                "280 г",
                "630 ккал")
        )
        return items
    }

    fun getDessertData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шоколадный мусс",
                "237",
                "https://2.downloader.disk.yandex.ua/disk/9e8cfb22e2a3d781dbfa36e237695d3a8a16ffeea498c2655df1f794589779a6/6069d9b0/pvVNPdxkXXJ88uIpOLiGcIelIJjtyHVH5s8dm6Gz5K8QQdygi8CgEQzLG2tlfWkNQs8EG2wu7_Df-8LvJcdekg%3D%3D?uid=1186320270&filename=%D0%B4%D0%B5%D1%81%D0%B5%D1%80%D1%82_1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=25404&hid=8cf24c06cc075ff502cbbd17ffccf8af&media_type=image&tknv=v2&etag=d026f8b4b4ff66b2a10bfe9b562190c0",
                "Голубика, фундук, какао, кокосовое молоко, финики, соль",
                "140 г",
                "381 ккал" )
        )
        items.add(
            Dish(
                "Шоколадный брауни",
                "267",
                "https://1.downloader.disk.yandex.ua/disk/61fefd174e8bccb03aee73dbdb3bbfa845759efcb6bd5e3490729fb609b9f94a/6069d9b5/pvVNPdxkXXJ88uIpOLiGcBRiVIQfqCz6bKTEBrXMda1vtM3_4q6c7LWMfY0fvGxwqreFUZynk8GDQMO42Sv0MA%3D%3D?uid=1186320270&filename=%D0%B4%D0%B5%D1%81%D0%B5%D1%80%D1%82_2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22817&hid=4a2a621c7ff719f3e125cf44cc9250db&media_type=image&tknv=v2&etag=16ce7000bda5b01f580109369050b0f1",
                "Сахар, яйцо, шоколад, пшеничная мука, фундук, сливочное масло, тёмный шоколад",
                "180 г",
                "470 ккал")
        )
        items.add(
            Dish(
                "Шоколадный кекс",
                "257",
                "https://2.downloader.disk.yandex.ua/disk/c12bc3017ea876b6c60fc3d3efba18179ee10257cfa7292b2740cfd24599aa41/6069d9b8/pvVNPdxkXXJ88uIpOLiGcIg7VbWAbbBHmYhon8i--Rg28KtiY9Y0v6-kcONyxVFylkgKCRc_SGLwBWKQe0GgkQ%3D%3D?uid=1186320270&filename=%D0%B4%D0%B5%D1%81%D0%B5%D1%80%D1%82_3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=21505&hid=f7a92abf66427efc68b80a835eb61ffe&media_type=image&tknv=v2&etag=a78438abee840d857614da2c08e9b7ca",
                "Шоколад, мука, сахар, яйцо, сливки, молоко, ванилин, сливочное масло",
                "150 г",
                "355 ккал"
            )
        )
        items.add(
            Dish(
                "Наполеон",
                "137",
                "https://2.downloader.disk.yandex.ua/disk/406b93665bac819d2c13d66be009513c6de618f2f21fcda91157519a310458cf/6069d9bd/pvVNPdxkXXJ88uIpOLiGcCeGIZlV_PaQlxNXDVg53ryapBlgIGBl_Q2ff98MJqT2J-OkqMWjGiOFD2uWVQ8Iqg%3D%3D?uid=1186320270&filename=%D0%B4%D0%B5%D1%81%D0%B5%D1%80%D1%82_4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=26582&hid=e06ea8a5711ab31cfd2ad9c05572f973&media_type=image&tknv=v2&etag=22300da6cd204dbdcc01706da6c785e8",
                "Пшеничная мука, сливочное масло, молоко, яйцо, сгущёнка, крахмал кукурузный, вода",
                "115 г",
                "641 ккал"
            )
        )
        items.add(
            Dish(
                "Тарталетка солёная карамель с фундуком",
                "157",
                "https://4.downloader.disk.yandex.ua/disk/ad7b8a573ef1c422de4f17b5299825c92f0a59f0733e6ee8c7763a9432ec035b/6069d9c2/pvVNPdxkXXJ88uIpOLiGcPMPVv8jtgHkZZvrjVf4ivNerhF9EuInZZjT3j9J1Z4fbEkq9pmUD8vFnK62qenoNw%3D%3D?uid=1186320270&filename=%D0%B4%D0%B5%D1%81%D0%B5%D1%80%D1%82_5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22386&hid=76dfaeba0effbb02ff18f53d523b0952&media_type=image&tknv=v2&etag=8b9ce34f856e4d403f6c0280a026d57b",
                "Пшеничная мука, сливочное масло, мёд, сливки, фундук, яйцо, какао, сахар",
                "90 г",
                "400 ккал"
            )
        )
        return items
    }
}