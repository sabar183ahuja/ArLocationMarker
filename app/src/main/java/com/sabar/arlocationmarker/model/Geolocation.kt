package com.sabar.arlocationmarker.model

class Geolocation(
    val latitude: String?,
    val longitude: String?
) {
    companion object {
        val EMPTY_GEOLOCATION = Geolocation(null, null)
    }
}
