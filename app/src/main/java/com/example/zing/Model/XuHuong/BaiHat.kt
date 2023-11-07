package com.example.zing.Model.XuHuong

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class BaiHat(
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
    @SerializedName("link_baihat")
    @Expose
    var linkBaihat: String?,
    @SerializedName("ngaylap_baihat")
    @Expose
    var ngaylapBaihat: String?,
    @SerializedName("ten_casi")
    @Expose
    var tenCasi: String?,
    @SerializedName("anh_casi")
    @Expose
    var anhCasi: String?,
    @SerializedName("luottheodoi_casi")
    @Expose
    var luottheodoiCasi: String?,
    @SerializedName("ten_theloai")
    @Expose
    var tenTheloai: String?,
    @SerializedName("ten_album")
    @Expose
    var tenAlbum: String?,
    @SerializedName("ten_playlist")
    @Expose
    var tenPlaylist: String?,
    @SerializedName("id_khachhang")
    @Expose
    var idKhachhang: String?
) : Parcelable
/*
    Lý thuyết:
    var: Được sử dụng để khai báo một biến có thể thay đổi giá trị (mutable). Khi bạn sử dụng từ khóa var,
    bạn có thể gán lại giá trị mới cho biến sau khi nó đã được khai báo.

    val: Được sử dụng để khai báo một biến chỉ đọc (immutable). Khi bạn sử dụng từ khóa val, giá trị của
    biến không thể thay đổi sau khi nó đã được khởi tạo.
 */