package com.fatihhernn.mmvm.data.entity.register

import com.fatihhernn.mmvm.data.entity.common.Data
import com.google.gson.annotations.SerializedName

data class RegisterResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("token")
    val token: String
) {
}