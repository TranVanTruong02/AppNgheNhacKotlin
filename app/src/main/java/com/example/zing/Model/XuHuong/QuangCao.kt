package com.example.zing.Model.XuHuong

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class QuangCao(
    @SerializedName("id_baihat")
    @Expose
    var idBaihat: String?,
    @SerializedName("ten_baihat")
    @Expose
    var tenBaihat: String?,
    @SerializedName("anh_baihat")
    @Expose
    var anhBaihat: String?,
    @SerializedName("anh_casi")
    @Expose
    var anhCasi: String?,
    @SerializedName("noidung_quangcao")
    @Expose
    var noidungQuangcao: String?
) : Parcelable