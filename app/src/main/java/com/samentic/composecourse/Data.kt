package com.samentic.composecourse

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

object Data {
    private val moshi = Moshi.Builder().build()

    fun getCrypto(): List<CryptoCurrency> {
        val data = """
             [{
    "id": 303296,
    "name": "3QT",
    "symbol": "3QT",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000025",
    "chg24h": 1.135929917188,
    "mrktCap": "0",
    "vol24h": "10069.043984698708",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1.245549",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21491.png"
  },
  {
    "id": 303295,
    "name": "dexSHARE",
    "symbol": "DEXSHARE",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.051012",
    "chg24h": -17.745509568912,
    "mrktCap": "0",
    "vol24h": "135.63121482198423",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "2494.471388",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20282.png"
  },
  {
    "id": 303293,
    "name": "DeFi Kingdoms Crystal",
    "symbol": "CRYSTAL",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.015301",
    "chg24h": -2.479156636672,
    "mrktCap": "0",
    "vol24h": "29004.464011071446",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "748.231028",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19397.png"
  },
  {
    "id": 303290,
    "name": "WhiteBIT Token",
    "symbol": "WBT",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "5.57",
    "chg24h": 0.945788112485,
    "mrktCap": "0",
    "vol24h": "12151288.02493697",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "272338.950775",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21353.png"
  },
  {
    "id": 303289,
    "name": "Nodle",
    "symbol": "NODL",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.002242",
    "chg24h": -3.263685213023,
    "mrktCap": "0",
    "vol24h": "83232.70553990503",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "109.658205",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/6837.png"
  },
  {
    "id": 303287,
    "name": "Sports 2K75",
    "symbol": "S2K",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0",
    "chg24h": 2.179444386509,
    "mrktCap": "0",
    "vol24h": "3096.3709889263046",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "0.000117",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20389.png"
  },
  {
    "id": 303286,
    "name": "Trivians",
    "symbol": "TRIVIA",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.001129",
    "chg24h": -1.0445120181,
    "mrktCap": "0",
    "vol24h": "129112.25016137798",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "55.196083",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20850.png"
  },
  {
    "id": 303285,
    "name": "Shush Club",
    "symbol": "SHUSH",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000034",
    "chg24h": -1.702847078048,
    "mrktCap": "0",
    "vol24h": "262.14308279926337",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1.662521",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21435.png"
  },
  {
    "id": 303284,
    "name": "Best Fintech Investment Coin",
    "symbol": "BFIC",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "24.4",
    "chg24h": 17.297473372814,
    "mrktCap": "0",
    "vol24h": "1979573.6997528272",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1192967.521059",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/18736.png"
  },
  {
    "id": 303283,
    "name": "KlayUniverse",
    "symbol": "KUT",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.056433",
    "chg24h": -23.960649638434,
    "mrktCap": "0",
    "vol24h": "4355.254042242486",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "2759.573759",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20703.png"
  },
  {
    "id": 303282,
    "name": "EdgeSwap",
    "symbol": "EGS",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.00102",
    "chg24h": -0.662160824525,
    "mrktCap": "0",
    "vol24h": "35556.073290122724",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "49.898616",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19422.png"
  },
  {
    "id": 303281,
    "name": "Globiance Exchange Token",
    "symbol": "GBEX",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0",
    "chg24h": -0.105730735068,
    "mrktCap": "0",
    "vol24h": "78063.80120243302",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "0.004759",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19699.png"
  },
  {
    "id": 303279,
    "name": "Atlantis Loans",
    "symbol": "ATL",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.035982",
    "chg24h": 0,
    "mrktCap": "0",
    "vol24h": "0",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1759.53231",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/13121.png"
  },
  {
    "id": 303278,
    "name": "ULTRON",
    "symbol": "ULX",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.09171",
    "chg24h": 1.499283784495,
    "mrktCap": "0",
    "vol24h": "622684.6835022507",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "4484.605975",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21524.png"
  },
  {
    "id": 303275,
    "name": "CODE",
    "symbol": "CODE",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.116156",
    "chg24h": 0,
    "mrktCap": "0",
    "vol24h": "0",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "5680.038951",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21522.png"
  },
  {
    "id": 303274,
    "name": "handleFOREX",
    "symbol": "FOREX",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.006062",
    "chg24h": -1.267101384379,
    "mrktCap": "0",
    "vol24h": "18681.82638834919",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "296.43836",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/11794.png"
  },
  {
    "id": 303270,
    "name": "ShibaDoge",
    "symbol": "SHIBDOGE",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0",
    "chg24h": -0.741982178216,
    "mrktCap": "0",
    "vol24h": "106617.96875709831",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "0",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/16500.png"
  },
  {
    "id": 303269,
    "name": "Fusotao Protocol",
    "symbol": "TAO",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.014931",
    "chg24h": -17.524520290103,
    "mrktCap": "0",
    "vol24h": "74780.80332231964",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "730.112871",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20203.png"
  },
  {
    "id": 303268,
    "name": "RadioShack",
    "symbol": "RADIO",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.000497",
    "chg24h": 12.158031634283,
    "mrktCap": "0",
    "vol24h": "16339.326155955292",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "24.29608",
    "subCategory": [
      "defi",
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19006.png"
  },
  {
    "id": 303267,
    "name": "PlutusDAO",
    "symbol": "PLS",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.251022",
    "chg24h": -3.281812798741,
    "mrktCap": "0",
    "vol24h": "98389.46313411513",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "12274.978732",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19964.png"
  },
  {
    "id": 303266,
    "name": "Qlindo",
    "symbol": "QLINDO",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.042549",
    "chg24h": -0.261044452967,
    "mrktCap": "0",
    "vol24h": "403074.6622433553",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "2080.624656",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21315.png"
  },
  {
    "id": 303264,
    "name": "Destablecoin HAY",
    "symbol": "HAY",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "1",
    "chg24h": -0.015643763803,
    "mrktCap": "0",
    "vol24h": "395215.5387888745",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "48916.171227",
    "subCategory": [
      "defi",
      "stablecoin",
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21330.png"
  },
  {
    "id": 303263,
    "name": "Phaeton",
    "symbol": "PHAE",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.019901",
    "chg24h": -0.015598142332,
    "mrktCap": "0",
    "vol24h": "0",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "973.161754",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/16350.png"
  },
  {
    "id": 303262,
    "name": "Generation",
    "symbol": "GEN",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.0024",
    "chg24h": -0.015598142332,
    "mrktCap": "0",
    "vol24h": "33.64051099094165",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "117.366242",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20096.png"
  },
  {
    "id": 303261,
    "name": "MM Optimizer (Polygon)",
    "symbol": "MMO",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.101078",
    "chg24h": -1.732871340198,
    "mrktCap": "0",
    "vol24h": "17401.19014433877",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "4942.720085",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21545.png"
  },
  {
    "id": 303259,
    "name": "Powabit",
    "symbol": "POWA",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000039",
    "chg24h": 0,
    "mrktCap": "0",
    "vol24h": "0",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1.912942",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21550.png"
  },
  {
    "id": 303257,
    "name": "Coinbase Wrapped Staked ETH",
    "symbol": "CBETH",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "1955",
    "chg24h": -0.069714966598,
    "mrktCap": "0",
    "vol24h": "2567409.0266069286",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "95615330.852512",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21535.png"
  },
  {
    "id": 303256,
    "name": "ThetaDrop",
    "symbol": "TDROP",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.001396",
    "chg24h": -6.462446829662,
    "mrktCap": "0",
    "vol24h": "224481.35027533685",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "68.278688",
    "subCategory": [
      "collectiblesNfts",
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/17806.png"
  },
  {
    "id": 303255,
    "name": "Wrapped KardiaChain",
    "symbol": "WKAI",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.005438",
    "chg24h": -0.494506277587,
    "mrktCap": "0",
    "vol24h": "4.806366110158146",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "265.919633",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19080.png"
  },
  {
    "id": 303254,
    "name": "Lido Staked Matic",
    "symbol": "stMATIC",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.803007",
    "chg24h": -0.927704391667,
    "mrktCap": "0",
    "vol24h": "260707.6520992549",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "39267.050999",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/18688.png"
  },
  {
    "id": 303252,
    "name": "IX Swap",
    "symbol": "IXS",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.022188",
    "chg24h": -1.401548378901,
    "mrktCap": "0",
    "vol24h": "251133.67861339348",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1084.997881",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/11620.png"
  },
  {
    "id": 303251,
    "name": "Decentralized Eternal Virtual Traveller",
    "symbol": "DEVT",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.001457",
    "chg24h": 5.041805038185,
    "mrktCap": "0",
    "vol24h": "390382.1814351861",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "71.240909",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/15659.png"
  },
  {
    "id": 303249,
    "name": "PoodleFi",
    "symbol": "PFI",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000001",
    "chg24h": -0.859058431524,
    "mrktCap": "0",
    "vol24h": "6791.288644404054",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "0.050782",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21525.png"
  },
  {
    "id": 303248,
    "name": "Seek Tiger",
    "symbol": "STI",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000294",
    "chg24h": 3.910992776404,
    "mrktCap": "0",
    "vol24h": "34533.42132093769",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "14.362956",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19130.png"
  },
  {
    "id": 303246,
    "name": "StepWatch",
    "symbol": "SWP",
    "jDate": "14020502",
    "time": "11:51:56",
    "close": "0.000729",
    "chg24h": -2.00462658583,
    "mrktCap": "0",
    "vol24h": "40582.3934344133",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "35.652053",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20973.png"
  },
  {
    "id": 303244,
    "name": "Keys Token",
    "symbol": "KEYS",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.001581",
    "chg24h": -0.921490693012,
    "mrktCap": "0",
    "vol24h": "1269.8358060000464",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "77.333357",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/15035.png"
  },
  {
    "id": 303243,
    "name": "Fame MMA",
    "symbol": "FAME",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.000808",
    "chg24h": 2.069294662836,
    "mrktCap": "0",
    "vol24h": "9039.238007104681",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "39.531542",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/19886.png"
  },
  {
    "id": 303242,
    "name": "ASSAPLAY",
    "symbol": "ASSA",
    "jDate": "14020502",
    "time": "11:51:58",
    "close": "0.006906",
    "chg24h": -0.059012993334,
    "mrktCap": "0",
    "vol24h": "119268.14273954694",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "337.721361",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/20112.png"
  },
  {
    "id": 303239,
    "name": "UvToken",
    "symbol": "UVT",
    "jDate": "14020502",
    "time": "11:51:57",
    "close": "0.020477",
    "chg24h": 13.162336514432,
    "mrktCap": "0",
    "vol24h": "270241.1937854638",
    "icon": "public/cryptoIcon/digital_currency_other.png",
    "toomanPrice": "1001.317765",
    "subCategory": [
      "cryptoCurrency"
    ],
    "iconUrl": "https://s2.coinmarketcap.com/static/img/coins/64x64/21394.png"
  }]
        """

        val adapter = moshi.adapter<List<CryptoCurrency>>(
            Types.newParameterizedType(List::class.java, CryptoCurrency::class.java)
        )

        return adapter.fromJson(data).orEmpty()
    }
}