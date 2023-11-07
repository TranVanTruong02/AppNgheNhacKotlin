package com.example.zing.Model.XuHuong

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LichSuNghe(
    @SerializedName("id_khachhang")
    @Expose
    var idKhachhang: String?,
    @SerializedName("id_baihat")
    @Expose
    var idBaihat: String?,
    @SerializedName("ten_baihat")
    @Expose
    var tenBaihat: String?,
    @SerializedName("anh_baihat")
    @Expose
    var anhBaihat: String?,
    @SerializedName("ten_casi")
    @Expose
    var tenCasi: String?
) : Parcelable