package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish

class DishesRepository {
    fun getAppetizerData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шампиньоны с пряным нутом и зелёным булгуром",
                "287",
                "https://2.downloader.disk.yandex.ua/disk/c96c678ad9dabdab7a52f2186f0c623261c28c59cb28a15670274c9a5e0ee514/607880a4/pvVNPdxkXXJ88uIpOLiGcMsSuv1S8Kcmqz6cQJzF9KlZ6e6FEEGpEyf_ANHUq3MrsB6Ln33TYhZoBia91DXk_A%3D%3D?uid=1186320270&filename=sn1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37520&hid=ca8a18657aa7eee373585d6453092296&media_type=image&tknv=v2&etag=3120504ec13b66a7ef36afd4048525a7",
                "Шампиньоны, сушёный чеснок, оливковое масло, черри, орегано, нут, паприка, булгур, перец чили, хмели-сунели",
                "270 г",
                "548 ккал"
            )
        )
        items.add(
            Dish(
                "Хумус с овощными палочками",
                "257",
                "https://3.downloader.disk.yandex.ua/disk/763a3b5c49226182d6ccdd98edda9491acb97d78c38b624666d09668991dc3c2/607880a8/pvVNPdxkXXJ88uIpOLiGcMOvZvsqiX597v6o9bRptASOOMCH5fo4Htb5vvVNoNJcjeY9DZlEIeJFfk9eauVSEg%3D%3D?uid=1186320270&filename=sn2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29149&hid=d2da0fe865b6eaad0862a71ae2a5de90&media_type=image&tknv=v2&etag=c87ef88386aff9f209344dba7ff5f0ae",
                "Болгарский перец, огурцы, морковь, черри, сельдерей, нут, оливковое масло, паста тахина, соль",
                "230 г",
                "270 ккал"
            )
        )
        items.add(
            Dish(
                "Поке с креветками",
                "427",
                "https://3.downloader.disk.yandex.ua/disk/ae4938fca3ee162004bd9c463ea76334e4955ae551be66e0b3665f8e057679f4/607880ae/pvVNPdxkXXJ88uIpOLiGcCtaDY6fZ7_Z_fQjMy4gL_GZAnOOZZKGdN3hsXC4zZ8n1hfI5e9BqmRu1b2_YncDQg%3D%3D?uid=1186320270&filename=sn3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29628&hid=4666fd648312a7378222213c4f74e34d&media_type=image&tknv=v2&etag=19cba387d8777df6816924d5e0068ac0",
                "Рис, уксус, сахар, соль, огурец, креветки, соевый соус, кунжутное масло, тобико, шпинат, майонез, шрирача, чеснок",
                "240 г",
                "393 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с чёрной смородиной",
                "127",
                "https://1.downloader.disk.yandex.ua/disk/3ebc7d4c4622b4a94bc1af18c4037f7c552402a1b5eec0afbafe66b6c0735476/607880b3/pvVNPdxkXXJ88uIpOLiGcGswYn26qFY9o1fkiBEhWMVpgnpxbbxXaPo05psm8DJhl5ozqHp0c-j6CjxOOpVtNA%3D%3D?uid=1186320270&filename=sn4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19285&hid=1cccaf5226ae6457e5c75ba53c16e0fc&media_type=image&tknv=v2&etag=27fb5134b88c6bd10447d759dcb1a7ff",
                "Пшеничная мука, чёрная смородина, вода, сахар, подсолнечное масло, дрожжи, соль",
                "120 г",
                "340 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с картошкой и грибами",
                "127",
                "https://4.downloader.disk.yandex.ua/disk/2126a72da456421b4d00f9d6d7ed4632261f20d9b050421ad42df50dd959d87c/607880b8/pvVNPdxkXXJ88uIpOLiGcCEBUi7F8S9WyVk_HIz0IwzzaJpM_UnMmmymUJfysqLYvGPds1BQNnXWzDpipomz6Q%3D%3D?uid=1186320270&filename=sn5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=18653&hid=0f13a95dc392d6c26e49b18b2f255cbd&media_type=image&tknv=v2&etag=aa7b2ee720894ddd9119123c2eb098e8",
                "Пшеничная мука, картофель, шампиньоны, репчатый лук, вода, сахар, подсолнечное масло, соль, перец чёрный молотый",
                "120 г",
                "277 ккал"
            )
        )
        items.add(
            Dish(
                "Бекон",
                "127",
                "https://2.downloader.disk.yandex.ua/disk/7838f4aa61603bde681a5c3dc92fc58f9c2c103a15538827e338b2e9431bbc3a/607880be/pvVNPdxkXXJ88uIpOLiGcODZS-8FbnM5MVs2lg8DUwkK0y5i4HU-UTVvhVJe0hTKDbkmG0e5UKxH6fLR8N-0mA%3D%3D?uid=1186320270&filename=sn6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27446&hid=d42c465294007c250c8416d36525d0bf&media_type=image&tknv=v2&etag=32af10045771a4056c825027d6b05efd",
                "Бекон",
                "30 г",
                "261 ккал"
            )
        )
        items.add(
            Dish(
                "Слабосолёный лосось",
                "437",
                "https://1.downloader.disk.yandex.ua/disk/0104fa2948ba0a33c4fc8bbaeeef79143744dcce30b5601cf7cdea224686ab04/607880c3/pvVNPdxkXXJ88uIpOLiGcNV5sjyi_X5k33WrGum7WAwIHSUPHKpoDpLRzqUozWei0050pjHI-66rKccd1Ivj5Q%3D%3D?uid=1186320270&filename=sn7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=24374&hid=4ae870863251e56723ece3f7ff965ea3&media_type=image&tknv=v2&etag=3233ff1290b0d4f07da2a4ddb5cc989e",
                "Слабосолёный лосось",
                "100 г",
                "193 ккал"
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
                "https://3.downloader.disk.yandex.ua/disk/585502489297daff8d54dd0c4c77eeffbdaf8a73d42cea3e2b69ff17b6ee3267/60788110/pvVNPdxkXXJ88uIpOLiGcCP9_sLrW1m4NJAGGgodmDilBMMlzX9YB62uU7Gnbfa7gIae11ahB-f1RatYs8kK1w%3D%3D?uid=1186320270&filename=sal1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36966&hid=93e65dde6db38c70d6538a6310fd0281&media_type=image&tknv=v2&etag=911a858fe2e76816ce833c392e34a226",
                "Руккола, айсберг, романо, черри, соевый соус, говядина, чёрный перец, стручковая фасоль, кунжутное масло, винный уксус, дижонская горчица, репчатый лук",
                "180 г",
                "281 ккал"
            )
        )
        items.add(
            Dish(
                "Печёная свекла с сиртаки и петрушкой",
                "197",
                "https://4.downloader.disk.yandex.ua/disk/b1e9e2154a5ff9048376e7482c89e4f7ef86d2315f294bade2c1a2f255f544b9/60788116/pvVNPdxkXXJ88uIpOLiGcI5N2dNSa4pnj67TZQ2dyY413I6f8TwMYvakvHhuVoR7jJMZLtcFYujdpHsaN_Ovcg%3D%3D?uid=1186320270&filename=sal2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29910&hid=15c3be121500af0fc8e2decd721ab4d4&media_type=image&tknv=v2&etag=21a38df433e7956063423e1e864af3fb",
                "Свекла, оливковое масло, петрушка, сиртаки",
                "200 г",
                "438 ккал"
            )
        )
        items.add(
            Dish(
                "Рататуй",
                "187",
                "https://2.downloader.disk.yandex.ua/disk/4c4610ecf262b2e00b11a61db154807b970969da71658349efd0826e5abbab65/6078811a/pvVNPdxkXXJ88uIpOLiGcJAS5OIxwmKcH0rdOaMrSuiI2Dju3tBj81qQLd7vAwUtqDK3DwlULdncgkr_9J8UKQ%3D%3D?uid=1186320270&filename=sal3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29393&hid=b7afad1667a7bd17a1316873e13fdd29&media_type=image&tknv=v2&etag=70288b68f271886a8cd9541244bad429",
                "Кабачок, баклажан, болгарский перец, репчатый лук, прованские травы",
                "150 г",
                "182 ккал"
            )
        )
        items.add(
            Dish(
                "Фунчоза по-корейски",
                "187",
                "https://3.downloader.disk.yandex.ua/disk/bae26050515a8a6a916fe553364cf870e54e13ad3c3cc72dcc9a8309a3b4373a/6078811f/pvVNPdxkXXJ88uIpOLiGcKUoCAxthNCmDt0PSKcg0nj2zMNSWKK9yI4b85klX6BowXbJgdBLsCiVRhaoH3iggg%3D%3D?uid=1186320270&filename=sal4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27557&hid=ba5c22564eabc8b4c6c54b1f6a36f414&media_type=image&tknv=v2&etag=f14a59cdd4a646861788c89b481d3aed",
                "Фунчоза, морковь, кориандр, чеснок, болгарский перец, огурец",
                "200 г",
                "164 ккал"
            )
        )
        items.add(
            Dish(
                "Цезарь с куриной грудкой",
                "497",
                "https://2.downloader.disk.yandex.ua/disk/d97d4834e954d825cd2e50b83dab7355a10a4256bcdc32eda12b75c95ab6b6c6/60788123/pvVNPdxkXXJ88uIpOLiGcNRpn1rKh6z4BDKV3BmIsItWgKZrVIh_MQL7oul9AtrhQYyTIWVOkfvby1CHNk5sFQ%3D%3D?uid=1186320270&filename=sal5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36374&hid=b250325eb0c621152c935d226dcd55f7&media_type=image&tknv=v2&etag=d3268dd57ea9145e12922a5f57c60f17",
                "Гренки, айсберг, романо, курица, барбекю, паприка, пармезан, каперсы, анчоусы, майонез",
                "290 г",
                "717 ккал"
            )
        )
        items.add(
            Dish(
                "Оливье с лососем",
                "357",
                "https://4.downloader.disk.yandex.ua/disk/60edd2c378a21699e3de85f32b83164239fdd1a150a28de70937e80e04030a98/60788129/pvVNPdxkXXJ88uIpOLiGcKo66u88IrlzVGK2npsSWbGK4jG8cYvJjfJfpbc3ZHqEGy_MRDdGiRNN-cqNwWvrFQ%3D%3D?uid=1186320270&filename=sal6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36658&hid=9b86dc5cd319bc2fa83faecb7d92b297&media_type=image&tknv=v2&etag=85231fecb749afb5d12ca3a0494277c8",
                "Каперсы, морковь, картофель, зелёный горошек, огурцы, слабосолёный лосось, майонез, маринованные огурцы, кетчуп, чеснок, ред девил соус",
                "220 г",
                "294 ккал"
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
                "https://4.downloader.disk.yandex.ua/disk/de83b2bd6f96a4bee8355613da5cad9231d2e8d37be52e13e45c582e745381f7/6078817f/pvVNPdxkXXJ88uIpOLiGcBYVjyN3O6IjefONHw2JI2uRce_B81VZ2ulERp9JpPAl57poH90sR1tIbLbdqyfTWw%3D%3D?uid=1186320270&filename=m1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=35055&hid=00d4fb5c19340b3e1a3442c16e4dcc26&media_type=image&tknv=v2&etag=2a5780a1ee1dc2e4a635cb8c3ee37513",
                "Говядина, картофель, морковь, кинза, черри, романо, айсберг",
                "350 г",
                "505 ккал"
            )
        )
        items.add(
            Dish(
                "Домашние котлеты со стручковой фасолью",
                "387",
                "https://3.downloader.disk.yandex.ua/disk/c907f40f774fbbfd056281c02406dd0f2e2f33c7fda093a75fc30915b9ef11f4/60788184/pvVNPdxkXXJ88uIpOLiGcI1_2HbnYKasewqIH_xaQwGcP9Cb9xX34l7qVLALzfp6gnAfragvvTX-mqxuyR9qFA%3D%3D?uid=1186320270&filename=m2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34062&hid=074b92cb90d459b861b1af9561714d45&media_type=image&tknv=v2&etag=2627c393ff62b8a9d09bf0b144859128",
                "Говядина, репчатый лук, яйцо, стручковая фасоль, свит чили соус, свинина, сливки",
                "250 г",
                "514 ккал"
            )
        )
        items.add(
            Dish(
                "Курина грудка-гриль",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/002dede32f9e1aa26571bf21cfe3bd5a882969fc8de12e4184dbf4d60dea7a18/60788189/pvVNPdxkXXJ88uIpOLiGcBfKsIEA2Gk9mjeRdYmcUn5SdXVDDStTiQiyoZ7WRz3OvcXUVCbT0qym7WYZvV0XCQ%3D%3D?uid=1186320270&filename=m3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=39867&hid=545989e4ce5eb426cb7595c67ff89b6d&media_type=image&tknv=v2&etag=e9fe4ecf86ae4d27b40c80001c795398",
                "Стручковая фасоль, барбекю, айсберг, курица, черри",
                "270 г",
                "452 ккал"
            )
        )
        items.add(
            Dish(
                "Куриный шницель с брокколи",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/067fde747f9d84e3ccdb472e8806a3f3c9affd0a63c925c209a3a59984671b64/6078818e/pvVNPdxkXXJ88uIpOLiGcHbtHVwMHBLMKuP_4tFgAwesYc-LMKNJwJA512OJDF5ZKMeH-NixeoeA9cFw2JLD9Q%3D%3D?uid=1186320270&filename=m4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33230&hid=f858b9150a4b62ad0b8c9af1730b8867&media_type=image&tknv=v2&etag=567fef47842beecf50054d8c02632f13",
                "Курица, брокколи, пшеничная мука, яйцо, сухарики, свит чили соус",
                "270 г",
                "716 ккал"
            )
        )
        items.add(
            Dish(
                "Свиные колбаски-гриль с картофельным пюре",
                "357",
                "https://3.downloader.disk.yandex.ua/disk/7eba63c44a75a1789f0ed9b5a2477e2f1bf3cad23a89bd2e0f4d863fb7af29b2/60788194/pvVNPdxkXXJ88uIpOLiGcA7F3__n6MqSDLeUY4RtDYjBqryxGkzoeUyUY2iktIBaeiG_CcMBl1we_VNJEg4JEg%3D%3D?uid=1186320270&filename=m5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=30445&hid=ecbab725253d04a529cc669c57a0adc4&media_type=image&tknv=v2&etag=2e0214677e4628384298cc04b3c4feb3",
                "Свинина, курица, крахмал, молоко, сырный соус, картофель, глюкозный сироп",
                "350 г",
                "1082 ккал"
            )
        )
        items.add(
            Dish(
                "Лосось с зелёной пастой и жареными ананасами",
                "827",
                "https://1.downloader.disk.yandex.ua/disk/f3cb29dde9b0e78a160e6d0131e1d0a6eede1cd6a8533430313dd633ec89e1f7/60788199/pvVNPdxkXXJ88uIpOLiGcAAbJDGsvEBsLn7Ae8Sa-Vr3Ie2eJthHx1W5KpKBj7MN6uGM8Uo328XOa-cQO5fywA%3D%3D?uid=1186320270&filename=m6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37654&hid=15754d10e0ca6f80406b3d1067ebc3c1&media_type=image&tknv=v2&etag=7b47171413dd41e7ac1b8d69683a6575",
                "Лосось, спагетти, базилик, кедровый орех, арахис, мёд, ананас, пармезан, оливковое масло",
                "290 г",
                "800 ккал"
            )
        )
        items.add(
            Dish(
                "Рулька с картофельным пюре",
                "745",
                "https://2.downloader.disk.yandex.ua/disk/afe7a9b7bfd6c3215bc983043b8b241c1ee6e3db1f2b4b4366ff5d4b8be17217/6078819f/pvVNPdxkXXJ88uIpOLiGcJDMoAyO7nc-wCzpNG4p8gKOomC3kxxMDL7RFdpjkfd9sLjY2w985qnD_6aKcH7P7Q%3D%3D?uid=1186320270&filename=m7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=28697&hid=0b52583b535083b1efbac67eecfff423&media_type=image&tknv=v2&etag=af73909eed0b2b6ea06feb26f3c7c741",
                "Свинина, барбекю, молоко, картофель, сливочное масло, зернистая горчица, мёд, майонез",
                "690 г",
                "2350 ккал"
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
                "https://2.downloader.disk.yandex.ua/disk/9a2a698f43a3f9694f0c43cd95c37199bd498a10ce02e13783e0f024aa071a53/607881e6/pvVNPdxkXXJ88uIpOLiGcLV1eH2CYPrdYbdna1KgLX1IcMO7I1ILrKtHYFxVM5db78IPQavEKTV-nrdUoB8DtQ%3D%3D?uid=1186320270&filename=s1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33974&hid=3ccfc6753a68f3932c8b680486f07c24&media_type=image&tknv=v2&etag=94943dab1877f40e52160d3b0ca3033a",
                "Рис, болгарский перец, кабачок, баклажан, гаспачо",
                "230 г",
                "375 ккал"
            )
        )
        items.add(
            Dish(
                "Удон с говядиной",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/1da7120ec859571f8b368b3f0fe801d194a29ce3a6905892b850c90a09096559/607881eb/pvVNPdxkXXJ88uIpOLiGcIDJ9v4AzV3ALs5F51ScOwUBmZNbnJlfxBmU5a4ugh3Ab4PydidPQ7FyX8U3ymEaIQ%3D%3D?uid=1186320270&filename=s2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37035&hid=911eceabf0d09bcb1bc7c8b5b443909e&media_type=image&tknv=v2&etag=68fd2e9ebf1c7bce252d3ef718f3818c",
                "Говядина, морковь, брокколи, удон, красный лук, кунжут, соль",
                "280 г",
                " 567 ккал"
            )
        )
        items.add(
            Dish(
                "Пенне с брокколи и лососем",
                "497",
                "https://4.downloader.disk.yandex.ua/disk/83ec689ac23f6b565422f0e7a3806f6406c86aa92ded7b931da1e2585e872586/607881ef/pvVNPdxkXXJ88uIpOLiGcOZ7OGiKvdsK7WViQtvtzFxiSugChep75P3WhzbImF1O5ezguq7AU5G68JA9xKH7mg%3D%3D?uid=1186320270&filename=s3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36527&hid=ce403d9c4e2486cfc08c1ccb786d81ec&media_type=image&tknv=v2&etag=56170e0a71df15e1e0381f80d5e3a9c4",
                "Лосось, брокколи, пенне, пармезан, сливки, соль",
                "270 г",
                "633 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти карбонара",
                "297",
                "https://1.downloader.disk.yandex.ua/disk/b484766c199eade2a9a13f44aaca2668d8bf8627d155393bfef61b0e6411901e/607881f4/pvVNPdxkXXJ88uIpOLiGcOTeqSJBz-IYYzkIhs03owBug1KOYzRVPGtq9w2cwZFlSRkt6Hho1jmtJcNb9IxJQw%3D%3D?uid=1186320270&filename=s4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=32962&hid=4f24264e2c6050ef9b47a9cbf8d196ff&media_type=image&tknv=v2&etag=0e7851f39cf765a610d75e880211f3fd",
                "Бекон, спагетти, сливки, чеснок, соль, яйцо",
                "270 г",
                "913 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти с куриной грудкой, шпинатом и сливками",
                "547",
                "https://4.downloader.disk.yandex.ua/disk/044c35fa4488940c6976ae27318fc573af2122bf6d4855bab0ce6991c148bd2b/607881f9/pvVNPdxkXXJ88uIpOLiGcOxneorYrlwulvpT8hI4uAkC9pZklda4NHC8va7j6sxA0yTF5hEL9-iA90h1kj5MqA%3D%3D?uid=1186320270&filename=s5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37062&hid=69075a6f4cc3907aa683a71670e320f8&media_type=image&tknv=v2&etag=291f6c9b9be8c80049b26688c03c58fe",
                "Спагетти, шпинат, курица, паприка, базилик, кедровый орех, пармезан",
                "280 г",
                "630 ккал"
            )
        )
        items.add(
            Dish(
                "Сливочные гребешки с вешенками",
                "767",
                "https://1.downloader.disk.yandex.ua/disk/95acdcb5976eed0cfda560208df4723759e23aa5f4046a756c1a1006bd16fafc/607881ff/pvVNPdxkXXJ88uIpOLiGcMq8Jo6HX-XE3jEHZ3_sypjdn_98MIPav9tnIezGm6NZYVKDn9K332iPAhVvdOd8eA%3D%3D?uid=1186320270&filename=s6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34116&hid=5b7eaf5c3d1271a6d2af2d13a2193327&media_type=image&tknv=v2&etag=13248891c3bde34d5eb27acd34fd77ac",
                "Гребешки, вешенки, репчатый лук, сливочное масло, лук зелёный",
                "230 г",
                "624 ккал"
            )
        )
        items.add(
            Dish(
                "Азу из говядины с картофельным пюре",
                "397",
                "https://4.downloader.disk.yandex.ua/disk/7201eb667e1a50d8095bf848cf6c014591255dd478881116573f431a3e59af7b/60788208/pvVNPdxkXXJ88uIpOLiGcDTFclTWA6Dkz7rgg7uI-JYKA2LmFVanqq2qKWfsUlV7zpuy3ePn7wvzz6JvLbIwXQ%3D%3D?uid=1186320270&filename=s7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34625&hid=9379f51f20addd42a4aba367d38c2e0b&media_type=image&tknv=v2&etag=daefc23f963d71920f57542dcbdcae76",
                "Говядина, картофель, молоко, сахар, репчатый лук, солёные огурцы, томатная паста, уксус, маринованные огурцы",
                "300 г",
                "577 ккал"
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
                "https://1.downloader.disk.yandex.ua/disk/6c128d789d28f6f24679ff8a2947da345dd4b64b92f6ecd169ddc2752dc51644/60788250/pvVNPdxkXXJ88uIpOLiGcIelIJjtyHVH5s8dm6Gz5K8QQdygi8CgEQzLG2tlfWkNQs8EG2wu7_Df-8LvJcdekg%3D%3D?uid=1186320270&filename=d1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=25404&hid=8cf24c06cc075ff502cbbd17ffccf8af&media_type=image&tknv=v2&etag=d026f8b4b4ff66b2a10bfe9b562190c0",
                "Голубика, фундук, какао, кокосовое молоко, финики, соль",
                "140 г",
                "381 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный брауни",
                "267",
                "https://4.downloader.disk.yandex.ua/disk/9d88406acee0218eb8a8b4e7cfca3224e72e9d3fe28e0d19a1ab916526ecc4fc/60788255/pvVNPdxkXXJ88uIpOLiGcAQb-_WDbuKwNgFqrzhGUjDLhZUww1_2L7-uWzf8GrhZpI3DwawmUFMrFM_0oo-83Q%3D%3D?uid=1186320270&filename=d2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22817&hid=4a2a621c7ff719f3e125cf44cc9250db&media_type=image&tknv=v2&etag=16ce7000bda5b01f580109369050b0f1",
                "Сахар, яйцо, шоколад, пшеничная мука, фундук, сливочное масло, тёмный шоколад",
                "180 г",
                "470 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный кекс",
                "257",
                "https://4.downloader.disk.yandex.ua/disk/230a049a0f53625952a420d1c77f0c0e2e9fa6cccec08fd8466508d9188d0b13/6078825a/pvVNPdxkXXJ88uIpOLiGcOEFUHoENBgJppVqihQxkS7_2tchruTXIpbafQ9OiJsjosqHVd3k6tsAjPU0g3SCHg%3D%3D?uid=1186320270&filename=d3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=21505&hid=f7a92abf66427efc68b80a835eb61ffe&media_type=image&tknv=v2&etag=a78438abee840d857614da2c08e9b7ca",
                "Шоколад, мука, сахар, яйцо, сливки, молоко, ванилин, сливочное масло",
                "150 г",
                "355 ккал"
            )
        )
        items.add(
            Dish(
                "Наполеон",
                "137",
                "https://2.downloader.disk.yandex.ua/disk/44166895e80055789e66a78662687de019197d516150b592e7bafc9268175315/6078825f/pvVNPdxkXXJ88uIpOLiGcCeGIZlV_PaQlxNXDVg53ryapBlgIGBl_Q2ff98MJqT2J-OkqMWjGiOFD2uWVQ8Iqg%3D%3D?uid=1186320270&filename=d4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=26582&hid=e06ea8a5711ab31cfd2ad9c05572f973&media_type=image&tknv=v2&etag=22300da6cd204dbdcc01706da6c785e8",
                "Пшеничная мука, сливочное масло, молоко, яйцо, сгущёнка, крахмал кукурузный, вода",
                "115 г",
                "641 ккал"
            )
        )
        items.add(
            Dish(
                "Тарталетка солёная карамель с фундуком",
                "157",
                "https://2.downloader.disk.yandex.ua/disk/950c275d7cc51b052cb9ad09b41df36906afea5a0623254667fcfbc2af4318cd/60788263/pvVNPdxkXXJ88uIpOLiGcPMPVv8jtgHkZZvrjVf4ivNerhF9EuInZZjT3j9J1Z4fbEkq9pmUD8vFnK62qenoNw%3D%3D?uid=1186320270&filename=d5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22386&hid=76dfaeba0effbb02ff18f53d523b0952&media_type=image&tknv=v2&etag=8b9ce34f856e4d403f6c0280a026d57b",
                "Пшеничная мука, сливочное масло, мёд, сливки, фундук, яйцо, какао, сахар",
                "90 г",
                "400 ккал"
            )
        )
        items.add(
            Dish(
                "Завтрак с творожным сыром и лососем",
                "297",
                "https://4.downloader.disk.yandex.ua/disk/4807ef504597df4410555c5a13fa5f3c3ec0daa9fc99ee8c60f45ee34833f7a9/6078826b/pvVNPdxkXXJ88uIpOLiGcHS11fiUpWw4oeXaK7zIZncNGxdV6cg-yvqOw5ZxAZwekJJBUNqJ75v_Ok4aDMAlgA%3D%3D?uid=1186320270&filename=d6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19647&hid=9e8da6a6e31d1f0363ffeb1b3ae6c9e1&media_type=image&tknv=v2&etag=9b0e6c34ffff4745e03ba8cd56c91bfd",
                "Мука, молоко, яйцо, сахар, творожный сыр, слабосолёный лосось, сметана",
                "210 г",
                "513 ккал"
            )
        )
        items.add(
            Dish(
                "Творожная запеканка с вишнёвым вареньем",
                "267",
                "https://3.downloader.disk.yandex.ua/disk/d92214b8c7cf107242ebf799eab23c3c7067bd85ae46408364135f23552fb7d1/60788270/pvVNPdxkXXJ88uIpOLiGcDKaAsPP-JhiRqqsCHDBCUK9LkDO3zLpYjO_RETLrXS65EB5ya-pYlQT5Ur8gw4eEQ%3D%3D?uid=1186320270&filename=d7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=23149&hid=d4d74df0468941dcb3fcd0404f7995b8&media_type=image&tknv=v2&etag=32042986794d2b7ac54fc4a092a6c611",
                "Творог, яйцо, мука, сметана, вишня, сахар, ванилин",
                "310 г",
                "745 ккал"
            )
        )
        return items
    }
}