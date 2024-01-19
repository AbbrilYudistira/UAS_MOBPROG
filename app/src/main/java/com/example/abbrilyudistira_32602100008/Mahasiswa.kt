package com.example.abbrilyudistira_32602100008

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mahasiswa (
    val name: String?,
    val nim: String?
) : Parcelable