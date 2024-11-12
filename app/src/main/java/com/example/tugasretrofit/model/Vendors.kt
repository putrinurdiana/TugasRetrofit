package com.example.tugasretrofit.model

import com.google.gson.annotations.SerializedName

data class Vendors(
    @SerializedName("date")
    val date: String,
    @SerializedName("tittle")
    val tittle: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("description")
    val description: String

)
