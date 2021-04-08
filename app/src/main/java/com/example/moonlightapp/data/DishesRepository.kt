package com.example.moonlightapp.data

import com.example.moonlightapp.entity.Dish

class DishesRepository {
    fun getAppetizerData(): List<Dish> {
        val items: MutableList<Dish> = ArrayList()
        items.add(
            Dish(
                "Шампиньоны с пряным нутом и зелёным булгуром",
                "287",
                "https://1.downloader.disk.yandex.ua/disk/e6d29880081c12264b61120a69cc388af6354375e7836133be4e8bf56a4f7674/606f83d2/pvVNPdxkXXJ88uIpOLiGcMsSuv1S8Kcmqz6cQJzF9KlZ6e6FEEGpEyf_ANHUq3MrsB6Ln33TYhZoBia91DXk_A%3D%3D?uid=1186320270&filename=sn1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37520&hid=ca8a18657aa7eee373585d6453092296&media_type=image&tknv=v2&etag=3120504ec13b66a7ef36afd4048525a7",
                "Шампиньоны, сушёный чеснок, оливковое масло, черри, орегано, нут, паприка, булгур, перец чили, хмели-сунели",
                "270 г",
                "548 ккал"
            )
        )
        items.add(
            Dish(
                "Хумус с овощными палочками",
                "257",
                "https://1.downloader.disk.yandex.ua/disk/c3ed55ad8edd28f2d655cfe851a0fb1a6d2ad69f44441e061eca29712ffa50b2/606f83db/pvVNPdxkXXJ88uIpOLiGcMOvZvsqiX597v6o9bRptASOOMCH5fo4Htb5vvVNoNJcjeY9DZlEIeJFfk9eauVSEg%3D%3D?uid=1186320270&filename=sn2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29149&hid=d2da0fe865b6eaad0862a71ae2a5de90&media_type=image&tknv=v2&etag=c87ef88386aff9f209344dba7ff5f0ae",
                "Болгарский перец, огурцы, морковь, черри, сельдерей, нут, оливковое масло, паста тахина, соль",
                "230 г",
                "270 ккал"
            )
        )
        items.add(
            Dish(
                "Поке с креветками",
                "427",
                "https://2.downloader.disk.yandex.ua/disk/7d53b7a53f0e45c26fbe32b82a1602f3a5e1992d7cb6eea0bcd2868d081cadd5/606f83df/pvVNPdxkXXJ88uIpOLiGcCtaDY6fZ7_Z_fQjMy4gL_GZAnOOZZKGdN3hsXC4zZ8n1hfI5e9BqmRu1b2_YncDQg%3D%3D?uid=1186320270&filename=sn3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29628&hid=4666fd648312a7378222213c4f74e34d&media_type=image&tknv=v2&etag=19cba387d8777df6816924d5e0068ac0",
                "Рис, уксус, сахар, соль, огурец, креветки, соевый соус, кунжутное масло, тобико, шпинат, майонез, шрирача, чеснок",
                "240 г",
                "393 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с чёрной смородиной",
                "127",
                "https://3.downloader.disk.yandex.ua/disk/ba564e063da125a5829ee8d1a71ae0f6189b4818855f0ec39cb8570da6baadae/606f83e3/pvVNPdxkXXJ88uIpOLiGcGswYn26qFY9o1fkiBEhWMVpgnpxbbxXaPo05psm8DJhl5ozqHp0c-j6CjxOOpVtNA%3D%3D?uid=1186320270&filename=sn4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19285&hid=1cccaf5226ae6457e5c75ba53c16e0fc&media_type=image&tknv=v2&etag=27fb5134b88c6bd10447d759dcb1a7ff",
                "Пшеничная мука, чёрная смородина, вода, сахар, подсолнечное масло, дрожжи, соль",
                "120 г",
                "340 ккал"
            )
        )
        items.add(
            Dish(
                "Пирожки с картошкой и грибами",
                "127",
                "https://2.downloader.disk.yandex.ua/disk/37c5dc936ebe71f00bc519125ac2220cab691d265bcbaf2284a07f758d566bc3/606f83e9/pvVNPdxkXXJ88uIpOLiGcCEBUi7F8S9WyVk_HIz0IwzzaJpM_UnMmmymUJfysqLYvGPds1BQNnXWzDpipomz6Q%3D%3D?uid=1186320270&filename=sn5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=18653&hid=0f13a95dc392d6c26e49b18b2f255cbd&media_type=image&tknv=v2&etag=aa7b2ee720894ddd9119123c2eb098e8",
                "Пшеничная мука, картофель, шампиньоны, репчатый лук, вода, сахар, подсолнечное масло, соль, перец чёрный молотый",
                "120 г",
                "277 ккал"
            )
        )
        items.add(
            Dish(
                "Бекон",
                "127",
                "https://1.downloader.disk.yandex.ua/disk/d45768f85abed0e16cac8005c14a578af1e446361d9e388806416a29cc781a81/606f83f8/pvVNPdxkXXJ88uIpOLiGcODZS-8FbnM5MVs2lg8DUwkK0y5i4HU-UTVvhVJe0hTKDbkmG0e5UKxH6fLR8N-0mA%3D%3D?uid=1186320270&filename=sn6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27446&hid=d42c465294007c250c8416d36525d0bf&media_type=image&tknv=v2&etag=32af10045771a4056c825027d6b05efd",
                "Бекон",
                "30 г",
                "261 ккал"
            )
        )
        items.add(
            Dish(
                "Слабосолёный лосось",
                "437",
                "https://4.downloader.disk.yandex.ua/disk/727c33d63386b8a4d02ec39f85685d613a3de622f8713b171c5c48e5d3c1b0e2/606f83fc/pvVNPdxkXXJ88uIpOLiGcNV5sjyi_X5k33WrGum7WAwIHSUPHKpoDpLRzqUozWei0050pjHI-66rKccd1Ivj5Q%3D%3D?uid=1186320270&filename=sn7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=24374&hid=4ae870863251e56723ece3f7ff965ea3&media_type=image&tknv=v2&etag=3233ff1290b0d4f07da2a4ddb5cc989e",
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
                "https://3.downloader.disk.yandex.ua/disk/7c75b527ab138c7ee553e709d4ece2907ffc81d89556e211d24908ccbe6fc05f/606f8461/pvVNPdxkXXJ88uIpOLiGcCP9_sLrW1m4NJAGGgodmDilBMMlzX9YB62uU7Gnbfa7gIae11ahB-f1RatYs8kK1w%3D%3D?uid=1186320270&filename=sal1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36966&hid=93e65dde6db38c70d6538a6310fd0281&media_type=image&tknv=v2&etag=911a858fe2e76816ce833c392e34a226",
                "Руккола, айсберг, романо, черри, соевый соус, говядина, чёрный перец, стручковая фасоль, кунжутное масло, винный уксус, дижонская горчица, репчатый лук",
                "180 г",
                "281 ккал"
            )
        )
        items.add(
            Dish(
                "Печёная свекла с сиртаки и петрушкой",
                "197",
                "https://3.downloader.disk.yandex.ua/disk/6b6396232660ad37cb0e73f3c6947fa37e18cd31795cf27a95491434b41d0044/606f8467/pvVNPdxkXXJ88uIpOLiGcI5N2dNSa4pnj67TZQ2dyY413I6f8TwMYvakvHhuVoR7jJMZLtcFYujdpHsaN_Ovcg%3D%3D?uid=1186320270&filename=sal2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29910&hid=15c3be121500af0fc8e2decd721ab4d4&media_type=image&tknv=v2&etag=21a38df433e7956063423e1e864af3fb",
                "Свекла, оливковое масло, петрушка, сиртаки",
                "200 г",
                "438 ккал"
            )
        )
        items.add(
            Dish(
                "Рататуй",
                "187",
                "https://1.downloader.disk.yandex.ua/disk/f2eb9eb2a2f685e4d28b535d0b724a8db5bc7d92d9ec73dff9383e3550ada0fb/606f846b/pvVNPdxkXXJ88uIpOLiGcJAS5OIxwmKcH0rdOaMrSuiI2Dju3tBj81qQLd7vAwUtqDK3DwlULdncgkr_9J8UKQ%3D%3D?uid=1186320270&filename=sal3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=29393&hid=b7afad1667a7bd17a1316873e13fdd29&media_type=image&tknv=v2&etag=70288b68f271886a8cd9541244bad429",
                "Кабачок, баклажан, болгарский перец, репчатый лук, прованские травы",
                "150 г",
                "182 ккал"
            )
        )
        items.add(
            Dish(
                "Фунчоза по-корейски",
                "187",
                "https://1.downloader.disk.yandex.ua/disk/e077ac259739f96e7022b35928a9d4c7ca58041a018ff3dd312da41dcee0d629/606f8471/pvVNPdxkXXJ88uIpOLiGcKUoCAxthNCmDt0PSKcg0nj2zMNSWKK9yI4b85klX6BowXbJgdBLsCiVRhaoH3iggg%3D%3D?uid=1186320270&filename=sal4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=27557&hid=ba5c22564eabc8b4c6c54b1f6a36f414&media_type=image&tknv=v2&etag=f14a59cdd4a646861788c89b481d3aed",
                "Фунчоза, морковь, кориандр, чеснок, болгарский перец, огурец",
                "200 г",
                "164 ккал"
            )
        )
        items.add(
            Dish(
                "Цезарь с куриной грудкой",
                "497",
                "https://4.downloader.disk.yandex.ua/disk/92bdf8654de65989d4b71bcca9094156684f7c2857bc3239ffe8291c9f2993ea/606f8476/pvVNPdxkXXJ88uIpOLiGcNRpn1rKh6z4BDKV3BmIsItWgKZrVIh_MQL7oul9AtrhQYyTIWVOkfvby1CHNk5sFQ%3D%3D?uid=1186320270&filename=sal5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36374&hid=b250325eb0c621152c935d226dcd55f7&media_type=image&tknv=v2&etag=d3268dd57ea9145e12922a5f57c60f17",
                "Гренки, айсберг, романо, курица, барбекю, паприка, пармезан, каперсы, анчоусы, майонез",
                "290 г",
                "717 ккал"
            )
        )
        items.add(
            Dish(
                "Оливье с лососем",
                "357",
                "https://1.downloader.disk.yandex.ua/disk/3b5dfeaa07669e92bdfada69c104cda76b319c96757c3382d2df4516d079a742/606f847a/pvVNPdxkXXJ88uIpOLiGcKo66u88IrlzVGK2npsSWbGK4jG8cYvJjfJfpbc3ZHqEGy_MRDdGiRNN-cqNwWvrFQ%3D%3D?uid=1186320270&filename=sal6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36658&hid=9b86dc5cd319bc2fa83faecb7d92b297&media_type=image&tknv=v2&etag=85231fecb749afb5d12ca3a0494277c8",
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
                "https://1.downloader.disk.yandex.ua/disk/18fa7c51912756114a554c2f6ae5f165d06ae14804af6c317cf0698c7d3fa4e6/606f84b6/pvVNPdxkXXJ88uIpOLiGcBYVjyN3O6IjefONHw2JI2uRce_B81VZ2ulERp9JpPAl57poH90sR1tIbLbdqyfTWw%3D%3D?uid=1186320270&filename=m1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=35055&hid=00d4fb5c19340b3e1a3442c16e4dcc26&media_type=image&tknv=v2&etag=2a5780a1ee1dc2e4a635cb8c3ee37513",
                "Говядина, картофель, морковь, кинза, черри, романо, айсберг",
                "350 г",
                "505 ккал"
            )
        )
        items.add(
            Dish(
                "Домашние котлеты со стручковой фасолью",
                "387",
                "https://2.downloader.disk.yandex.ua/disk/07bab3103af08255f7aa6b7174e4f54f90fbe01f3031eb29211a5a5147e5727f/606f84bc/pvVNPdxkXXJ88uIpOLiGcI1_2HbnYKasewqIH_xaQwGcP9Cb9xX34l7qVLALzfp6gnAfragvvTX-mqxuyR9qFA%3D%3D?uid=1186320270&filename=m2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34062&hid=074b92cb90d459b861b1af9561714d45&media_type=image&tknv=v2&etag=2627c393ff62b8a9d09bf0b144859128",
                "Говядина, репчатый лук, яйцо, стручковая фасоль, свит чили соус, свинина, сливки",
                "250 г",
                "514 ккал"
            )
        )
        items.add(
            Dish(
                "Курина грудка-гриль",
                "397",
                "https://3.downloader.disk.yandex.ua/disk/edda87fa67c28a28c84905979e6dad33ad10bf2eda1a56eec885464f70e26af1/606f84bf/pvVNPdxkXXJ88uIpOLiGcBfKsIEA2Gk9mjeRdYmcUn5SdXVDDStTiQiyoZ7WRz3OvcXUVCbT0qym7WYZvV0XCQ%3D%3D?uid=1186320270&filename=m3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=39867&hid=545989e4ce5eb426cb7595c67ff89b6d&media_type=image&tknv=v2&etag=e9fe4ecf86ae4d27b40c80001c795398",
                "Стручковая фасоль, барбекю, айсберг, курица, черри",
                "270 г",
                "452 ккал"
            )
        )
        items.add(
            Dish(
                "Куриный шницель с брокколи",
                "397",
                "https://4.downloader.disk.yandex.ua/disk/be63ef8bb2b4feef54bc070d724f88f07b32140987b86b12bd2a0cb4b693d7f0/606f84c3/pvVNPdxkXXJ88uIpOLiGcHbtHVwMHBLMKuP_4tFgAwesYc-LMKNJwJA512OJDF5ZKMeH-NixeoeA9cFw2JLD9Q%3D%3D?uid=1186320270&filename=m4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33230&hid=f858b9150a4b62ad0b8c9af1730b8867&media_type=image&tknv=v2&etag=567fef47842beecf50054d8c02632f13",
                "Курица, брокколи, пшеничная мука, яйцо, сухарики, свит чили соус",
                "270 г",
                "716 ккал"
            )
        )
        items.add(
            Dish(
                "Свиные колбаски-гриль с картофельным пюре",
                "357",
                "https://3.downloader.disk.yandex.ua/disk/3037becaff1d7c4b25aa037656c66e571ede7ffc4aa4886a0194be726d9a922a/606f84c8/pvVNPdxkXXJ88uIpOLiGcA7F3__n6MqSDLeUY4RtDYjBqryxGkzoeUyUY2iktIBaeiG_CcMBl1we_VNJEg4JEg%3D%3D?uid=1186320270&filename=m5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=30445&hid=ecbab725253d04a529cc669c57a0adc4&media_type=image&tknv=v2&etag=2e0214677e4628384298cc04b3c4feb3",
                "Свинина, курица, крахмал, молоко, сырный соус, картофель, глюкозный сироп",
                "350 г",
                "1082 ккал"
            )
        )
        items.add(
            Dish(
                "Лосось с зелёной пастой и жареными ананасами",
                "827",
                "https://3.downloader.disk.yandex.ua/disk/3bdb7b3fedea63364249f218c336a7a268a4c723bfe3eaf855e3c1303914af98/606f84cd/pvVNPdxkXXJ88uIpOLiGcAAbJDGsvEBsLn7Ae8Sa-Vr3Ie2eJthHx1W5KpKBj7MN6uGM8Uo328XOa-cQO5fywA%3D%3D?uid=1186320270&filename=m6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37654&hid=15754d10e0ca6f80406b3d1067ebc3c1&media_type=image&tknv=v2&etag=7b47171413dd41e7ac1b8d69683a6575",
                "Лосось, спагетти, базилик, кедровый орех, арахис, мёд, ананас, пармезан, оливковое масло",
                "290 г",
                "800 ккал"
            )
        )
        items.add(
            Dish(
                "Рулька с картофельным пюре",
                "745",
                "https://2.downloader.disk.yandex.ua/disk/f952cbe86d65d3fdeb147889e312c75d3649fef6f15efae1b902d5518f76a5c4/606f84d1/pvVNPdxkXXJ88uIpOLiGcJDMoAyO7nc-wCzpNG4p8gKOomC3kxxMDL7RFdpjkfd9sLjY2w985qnD_6aKcH7P7Q%3D%3D?uid=1186320270&filename=m7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=28697&hid=0b52583b535083b1efbac67eecfff423&media_type=image&tknv=v2&etag=af73909eed0b2b6ea06feb26f3c7c741",
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
                "https://1.downloader.disk.yandex.ua/disk/6306f78a57a3d639ab7da2b8a04a835f2eef3a2ff684fa79cd837110d24118f3/606f8513/pvVNPdxkXXJ88uIpOLiGcLV1eH2CYPrdYbdna1KgLX1IcMO7I1ILrKtHYFxVM5db78IPQavEKTV-nrdUoB8DtQ%3D%3D?uid=1186320270&filename=s1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=33974&hid=3ccfc6753a68f3932c8b680486f07c24&media_type=image&tknv=v2&etag=94943dab1877f40e52160d3b0ca3033a",
                "Рис, болгарский перец, кабачок, баклажан, гаспачо",
                "230 г",
                "375 ккал"
            )
        )
        items.add(
            Dish(
                "Удон с говядиной",
                "397",
                "https://1.downloader.disk.yandex.ua/disk/14e854e33b04096433ba1badf503d9b7d3b400ad73384e6f2824cefeadf87c0e/606f8517/pvVNPdxkXXJ88uIpOLiGcIDJ9v4AzV3ALs5F51ScOwUBmZNbnJlfxBmU5a4ugh3Ab4PydidPQ7FyX8U3ymEaIQ%3D%3D?uid=1186320270&filename=s2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37035&hid=911eceabf0d09bcb1bc7c8b5b443909e&media_type=image&tknv=v2&etag=68fd2e9ebf1c7bce252d3ef718f3818c",
                "Говядина, морковь, брокколи, удон, красный лук, кунжут, соль",
                "280 г",
                " 567 ккал"
            )
        )
        items.add(
            Dish(
                "Пенне с брокколи и лососем",
                "497",
                "https://3.downloader.disk.yandex.ua/disk/d3d3f853e61a23fac937d584fc2182fe6b1147463c83686cc5d78c205c0c2c7b/606f851c/pvVNPdxkXXJ88uIpOLiGcOZ7OGiKvdsK7WViQtvtzFxiSugChep75P3WhzbImF1O5ezguq7AU5G68JA9xKH7mg%3D%3D?uid=1186320270&filename=s3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=36527&hid=ce403d9c4e2486cfc08c1ccb786d81ec&media_type=image&tknv=v2&etag=56170e0a71df15e1e0381f80d5e3a9c4",
                "Лосось, брокколи, пенне, пармезан, сливки, соль",
                "270 г",
                "633 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти карбонара",
                "297",
                "https://4.downloader.disk.yandex.ua/disk/4739609256f71cee34b55b24cff30eac4d94c422d0d6cad9b21d453715cd8bdb/606f8520/pvVNPdxkXXJ88uIpOLiGcOTeqSJBz-IYYzkIhs03owBug1KOYzRVPGtq9w2cwZFlSRkt6Hho1jmtJcNb9IxJQw%3D%3D?uid=1186320270&filename=s4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=32962&hid=4f24264e2c6050ef9b47a9cbf8d196ff&media_type=image&tknv=v2&etag=0e7851f39cf765a610d75e880211f3fd",
                "Бекон, спагетти, сливки, чеснок, соль, яйцо",
                "270 г",
                "913 ккал"
            )
        )
        items.add(
            Dish(
                "Спагетти с куриной грудкой, шпинатом и сливками",
                "547",
                "https://2.downloader.disk.yandex.ua/disk/476c87891ef4c6fb22d53d7a1c6c06253e6ccdf59d273ed95aec3e945080f456/606f8525/pvVNPdxkXXJ88uIpOLiGcOxneorYrlwulvpT8hI4uAkC9pZklda4NHC8va7j6sxA0yTF5hEL9-iA90h1kj5MqA%3D%3D?uid=1186320270&filename=s5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=37062&hid=69075a6f4cc3907aa683a71670e320f8&media_type=image&tknv=v2&etag=291f6c9b9be8c80049b26688c03c58fe",
                "Спагетти, шпинат, курица, паприка, базилик, кедровый орех, пармезан",
                "280 г",
                "630 ккал"
            )
        )
        items.add(
            Dish(
                "Сливочные гребешки с вешенками",
                "767",
                "https://3.downloader.disk.yandex.ua/disk/b05ebbcc16cd255c1adba8b5560c069605df70142ffda6bfdbcc452a3549a507/606f852b/pvVNPdxkXXJ88uIpOLiGcMq8Jo6HX-XE3jEHZ3_sypjdn_98MIPav9tnIezGm6NZYVKDn9K332iPAhVvdOd8eA%3D%3D?uid=1186320270&filename=s6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34116&hid=5b7eaf5c3d1271a6d2af2d13a2193327&media_type=image&tknv=v2&etag=13248891c3bde34d5eb27acd34fd77ac",
                "Гребешки, вешенки, репчатый лук, сливочное масло, лук зелёный",
                "230 г",
                "624 ккал"
            )
        )
        items.add(
            Dish(
                "Азу из говядины с картофельным пюре",
                "397",
                "https://2.downloader.disk.yandex.ua/disk/0f6a711ca0919ea057f92d62deebf7d64ecbad049a11c84ff0a1d98c92a41bf5/606f8530/pvVNPdxkXXJ88uIpOLiGcDTFclTWA6Dkz7rgg7uI-JYKA2LmFVanqq2qKWfsUlV7zpuy3ePn7wvzz6JvLbIwXQ%3D%3D?uid=1186320270&filename=s7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=34625&hid=9379f51f20addd42a4aba367d38c2e0b&media_type=image&tknv=v2&etag=daefc23f963d71920f57542dcbdcae76",
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
                "https://3.downloader.disk.yandex.ua/disk/372074f2d796732106c0845f2292fcb3978068248767aba59506bdceafe901e7/606f856d/pvVNPdxkXXJ88uIpOLiGcIelIJjtyHVH5s8dm6Gz5K8QQdygi8CgEQzLG2tlfWkNQs8EG2wu7_Df-8LvJcdekg%3D%3D?uid=1186320270&filename=d1.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=25404&hid=8cf24c06cc075ff502cbbd17ffccf8af&media_type=image&tknv=v2&etag=d026f8b4b4ff66b2a10bfe9b562190c0",
                "Голубика, фундук, какао, кокосовое молоко, финики, соль",
                "140 г",
                "381 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный брауни",
                "267",
                "https://1.downloader.disk.yandex.ua/disk/a1fff7a6968fd066a092898f96f374d0457375987d04be1b92e51ee620020268/606f8573/pvVNPdxkXXJ88uIpOLiGcAQb-_WDbuKwNgFqrzhGUjDLhZUww1_2L7-uWzf8GrhZpI3DwawmUFMrFM_0oo-83Q%3D%3D?uid=1186320270&filename=d2.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22817&hid=4a2a621c7ff719f3e125cf44cc9250db&media_type=image&tknv=v2&etag=16ce7000bda5b01f580109369050b0f1",
                "Сахар, яйцо, шоколад, пшеничная мука, фундук, сливочное масло, тёмный шоколад",
                "180 г",
                "470 ккал"
            )
        )
        items.add(
            Dish(
                "Шоколадный кекс",
                "257",
                "https://3.downloader.disk.yandex.ua/disk/179637319c3114bf2947c36318565bc629eedb6770a9abf8a48c1311df0adfd8/606f8577/pvVNPdxkXXJ88uIpOLiGcOEFUHoENBgJppVqihQxkS7_2tchruTXIpbafQ9OiJsjosqHVd3k6tsAjPU0g3SCHg%3D%3D?uid=1186320270&filename=d3.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=21505&hid=f7a92abf66427efc68b80a835eb61ffe&media_type=image&tknv=v2&etag=a78438abee840d857614da2c08e9b7ca",
                "Шоколад, мука, сахар, яйцо, сливки, молоко, ванилин, сливочное масло",
                "150 г",
                "355 ккал"
            )
        )
        items.add(
            Dish(
                "Наполеон",
                "137",
                "https://4.downloader.disk.yandex.ua/disk/4d614580fcc25f3c2ad88232102daf2347a156c59894c91e7737c0e868900088/606f857b/pvVNPdxkXXJ88uIpOLiGcCeGIZlV_PaQlxNXDVg53ryapBlgIGBl_Q2ff98MJqT2J-OkqMWjGiOFD2uWVQ8Iqg%3D%3D?uid=1186320270&filename=d4.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=26582&hid=e06ea8a5711ab31cfd2ad9c05572f973&media_type=image&tknv=v2&etag=22300da6cd204dbdcc01706da6c785e8",
                "Пшеничная мука, сливочное масло, молоко, яйцо, сгущёнка, крахмал кукурузный, вода",
                "115 г",
                "641 ккал"
            )
        )
        items.add(
            Dish(
                "Тарталетка солёная карамель с фундуком",
                "157",
                "https://2.downloader.disk.yandex.ua/disk/8df28417bffd177ee2b741184ee4aaed26d9cc4139b6ddc93ef957d999e622ee/606f857f/pvVNPdxkXXJ88uIpOLiGcPMPVv8jtgHkZZvrjVf4ivNerhF9EuInZZjT3j9J1Z4fbEkq9pmUD8vFnK62qenoNw%3D%3D?uid=1186320270&filename=d5.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=22386&hid=76dfaeba0effbb02ff18f53d523b0952&media_type=image&tknv=v2&etag=8b9ce34f856e4d403f6c0280a026d57b",
                "Пшеничная мука, сливочное масло, мёд, сливки, фундук, яйцо, какао, сахар",
                "90 г",
                "400 ккал"
            )
        )
        items.add(
            Dish(
                "Завтрак с творожным сыром и лососем",
                "297",
                "https://3.downloader.disk.yandex.ua/disk/ca384538278410722dd2218ef57ef1e78b72073963d2691a32b786f5bfa270c2/606f8583/pvVNPdxkXXJ88uIpOLiGcHS11fiUpWw4oeXaK7zIZncNGxdV6cg-yvqOw5ZxAZwekJJBUNqJ75v_Ok4aDMAlgA%3D%3D?uid=1186320270&filename=d6.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=19647&hid=9e8da6a6e31d1f0363ffeb1b3ae6c9e1&media_type=image&tknv=v2&etag=9b0e6c34ffff4745e03ba8cd56c91bfd",
                "Мука, молоко, яйцо, сахар, творожный сыр, слабосолёный лосось, сметана",
                "210 г",
                "513 ккал"
            )
        )
        items.add(
            Dish(
                "Творожная запеканка с вишнёвым вареньем",
                "267",
                "https://2.downloader.disk.yandex.ua/disk/1b856e5f073bd4204d1ef29b24c68531ce0b87ed6f76867a54de67865cf95e94/606f8588/pvVNPdxkXXJ88uIpOLiGcDKaAsPP-JhiRqqsCHDBCUK9LkDO3zLpYjO_RETLrXS65EB5ya-pYlQT5Ur8gw4eEQ%3D%3D?uid=1186320270&filename=d7.jpg&disposition=inline&hash=&limit=0&content_type=image%2Fjpeg&owner_uid=1186320270&fsize=23149&hid=d4d74df0468941dcb3fcd0404f7995b8&media_type=image&tknv=v2&etag=32042986794d2b7ac54fc4a092a6c611",
                "Творог, яйцо, мука, сметана, вишня, сахар, ванилин",
                "310 г",
                "745 ккал"
            )
        )
        return items
    }
}