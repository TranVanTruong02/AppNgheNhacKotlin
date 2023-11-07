package com.example.zing.Model.XuHuong

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DanhSachBaiHat(
    @SerializedName("id_baihat")
    @Expose
    var idBaihat: String?,
    @SerializedName("id_album")
    @Expose
    var idAlbum: String?,
    @SerializedName("id_theloai")
    @Expose
    var idTheloai: String?,
    @SerializedName("id_playlist")
    @Expose
    var idPlaylist: String?,
    @SerializedName("id_casi")
    @Expose
    var idCasi: String?,
    @SerializedName("ten_baihat")
    @Expose
    var tenBaihat: String?,
    @SerializedName("anh_baihat")
    @Expose
    var anhBaihat: String?,
    @SerializedName("ten_casi")
    @Expose
    var tenCasi: String?,
    @SerializedName("id_luotthich")
    @Expose
    var idLuotthich: String?,
    @SerializedName("id_khachhang")
    @Expose
    var idKhachhang: String?,
) : Parcelable