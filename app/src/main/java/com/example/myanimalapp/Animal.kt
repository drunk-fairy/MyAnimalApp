package com.example.myanimalapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Animal(
    val name: String,
    val imageResId: Int,
    val description: String): Parcelable
