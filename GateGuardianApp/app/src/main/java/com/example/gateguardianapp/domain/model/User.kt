package com.example.gateguardianapp.domain.model

import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject

data class User(
    val name: String ="",
    val email: String = "",
    val category: String = "",
    val society: String =""
) {
    fun toRequestBody(): RequestBody {

        val jsonObject = JSONObject()
        jsonObject.put("name", name)
        jsonObject.put("email", email)
        jsonObject.put("category", category)

        return jsonObject.toString().toRequestBody("application/json".toMediaTypeOrNull())
    }
}