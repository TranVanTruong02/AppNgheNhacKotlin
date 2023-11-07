package com.example.zing.Model.XuHuong

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PlayList(
    @SerializedName("id_playlist")
    @Expose
    var idPlaylist: String?,
    @SerializedName("ten_playlist")
    @Expose
    var tenPlaylist: String?,
    @SerializedName("anhnen_playlist")
    @Expose
    var anhnenPlaylist: String?,
    @SerializedName("icon_playlist")
    @Expose
    var iconPlaylist: String?
) : Parcelable