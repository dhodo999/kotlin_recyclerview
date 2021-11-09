package com.example.recyclerview_afridho_02

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class VTubers(
    val imgVtubers: Int,
    val nameVtubers: String,
    val descVtubers: String

) : Parcelable
