package com.example.flixter_2

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Movie : Serializable {

    @SerializedName("poster_path")
    var posterPath: String? = null

    @SerializedName("backdrop_path")
    var backdropPath: String? = null

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @SerializedName("release_date")
    var date: String? = null

    @SerializedName("popularity")
    var popularity: String? = null

    @SerializedName("overview")
    var description: String? = null

    @SerializedName("id")
    var id: Int? = null

}

