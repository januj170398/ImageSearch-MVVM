package com.example.imagesearchunsplashmvvm.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UnsplashPhoto(
    val id : String,
    val description : String?,
    val urls : UnsplashPhotoUrls,
    val user: UnsplashUser
):Parcelable {
    @Parcelize
    data class UnsplashPhotoUrls(
        val raw: String,
        val full:String,
        val regular : String,
        val thumb: String,
        val small: String
    ):Parcelable

    @Parcelize
    data class UnsplashUser(
        val name: String,
        val username: String
    ):Parcelable{
        val attributionUrl get() = "https://unsplash.com/$username?utm_source=ImageSearchUnsplashMVVM&utm_medium=referral"
    }


}