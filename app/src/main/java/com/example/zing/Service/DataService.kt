package com.example.zing.Service

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface DataService {
/*
    @GET("quangcao_zing.php")
    fun getDataBanner(): Call<List<XuHuong_QuangCao>>

    @FormUrlEncoded
    @POST("demtongsoluong.php")
    fun getSoBaiHatCuaLichSuNgheTheoKhachHang(@Field("idkhachhang_lichsunghe") idkhachhang_lichsunghe: String): Call<String>

    @FormUrlEncoded
    @POST("demtongsoluong.php")
    fun getSoBaiHatCuaYeuThichTheoKhachHang(@Field("idkhachhang_baihatyeuthich") idkhachhang_baihatyeuthich: String): Call<String>

    @FormUrlEncoded
    @POST("demtongsoluong.php")
    fun getSoBaiHatTheoRandomPlaylist(@Field("idplaylist_randomplaylist") idplaylist_randomplaylist: String): Call<String>

    @FormUrlEncoded
    @POST("lichsunghe.php")
    fun getDataLichSuNgheTheoKhachHang(@Field("idkhachhang_lichsunghe") idkhachhang_lichsunghe: String, @Field("page") page: String, @Field("quantity") quantity: String): Call<List<Xuhuong_LichSuNghe>>

    @FormUrlEncoded
    @POST("lichsunghe.php")
    fun getDataBaiHatYeuThichTheoKhachHang(@Field("idkhachhang_luotthich") idkhachhang_luotthich: String, @Field("page") page: String, @Field("quantity") quantity: String): Call<List<Xuhuong_LichSuNghe>>

    @FormUrlEncoded
    @POST ("playlistrandomday_zing.php")
    fun getDataRandomPlaylist(@Field("id_playlist") id_playlist: String): Call<List<XuHuong_Playlist>>

    @GET ("chudevatheloaitheongay.php")
    fun getDataChuDeTheLoaiTheoNgay(): Call<XuHuong_ChuDeTheLoaiTheoNgay>

    @GET ("abumhot.php")
    fun getDataAlbumHot(): Call<List<XuHuong_Album>>

    @GET ("baihatyeuthich.php")
    fun getDataBaiHatYeuThich(): Call<List<XuHuong_BaiHat>>

    @FormUrlEncoded
    @POST("danhsachphatnhac.php")
    fun getDataDanhSachBaiHatTheoQuangCao(@Field("idqcbaihat") idqcbaihat: String): Call<List<XuHuong_BaiHat>>

    @FormUrlEncoded
    @POST("danhsachbaihat.php")
    fun getDataDanhSachBaiHatTheoPlaylist(@Field("id_playlist") id_playlist: String, @Field("page") page: String, @Field("quantity") quantity: String): Call<List<XuHuong_DanhSachBaiHat>>

    @FormUrlEncoded
    @POST("danhsachphatnhac.php")
    fun getDataDanhSachCacTheLoai(@Field("idtheloai") idtheloai: String): Call<List<XuHuong_BaiHat>>

    @GET ("danhsachtatcaplaylist.php")
    fun getDataTatCaPlayList(): Call<List<XuHuong_Playlist>>

    @GET ("danhsachtatcachude.php")
    fun getDataTatCaChuDe(): Call<List<XuHuong_ChuDe>>

    @FormUrlEncoded
    @POST("danhsachtatcatheloaitheochude.php")
    fun getDataDanhTatCaTheLoaiTheoChuDe(@Field("idtheloaitheochude") idtheloaitheochude: String): Call<List<XuHuong_TheLoai>>

    @GET ("danhsachtatcachude.php")
    fun getDataTatCaAlbum(): Call<List<XuHuong_Album>>

    @FormUrlEncoded
    @POST("capnhatluotthichbaihat.php")
    fun capNhatLuotThichBaiHat(@Field("idbaihatluotthich") idbaihatluotthich: String, @Field("luotthich") luotthich: String): Call<String>

    @FormUrlEncoded
    @POST("binhluan.php")
    fun binhLuan(@Field("idbinhluan") idbinhluan: String): Call<String>
*/
    /*
        Lý thuyết:
        Trong Kotlin, mặc định là không cần khai báo từ khóa public khi định nghĩa một thành phần (phương thức, thuộc tính, lớp, v.v.).
        Tất cả các thành phần trong một lớp Kotlin sẽ mặc định có phạm vi truy cập là public.
     */
}