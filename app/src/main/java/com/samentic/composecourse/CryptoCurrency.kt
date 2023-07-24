package com.samentic.composecourse

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CryptoCurrency(
    val id: String,
    val name: String,
    val iconUrl: String?,
    val time: String?,
    val jDate: String?,
    val price: Double?,
    val chg24h: Double?,
    val symbol: String?
)
