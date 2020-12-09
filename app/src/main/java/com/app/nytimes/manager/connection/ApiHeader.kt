package com.app.nytimes.manager.connection

import com.google.gson.annotations.SerializedName

class ApiHeader//add new comments
    (
    authorization: String = "",
    countryId: Int = 0,
    @SerializedName("device-uuid") var deviceUUID: String = "",
    @SerializedName("device-id") var deviceId: String = "",
    @SerializedName(value = "device-token") var deviceToken: String = "",
    @SerializedName("language-id") var languageId: String = "1",
    @SerializedName("language") var language: String
) {
    @SerializedName("Authorization") var authorization: String =
        String.format("Bearer %s", authorization)
    @SerializedName("country_id") var countryId: Int? = countryId

}