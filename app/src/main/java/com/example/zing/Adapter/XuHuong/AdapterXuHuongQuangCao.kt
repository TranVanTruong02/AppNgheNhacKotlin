package com.example.zing.Adapter.XuHuong
/*
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Response
import java.io.IOException
import java.net.URL
import java.util.concurrent.Executor
import java.util.concurrent.Executors
class Adapter AdapterXuHuongQuangCao(private val context: Context, private val arrayQuangCao: ArrayList<XuHuong_QuangCao>) : PagerAdapter() {
    private var array: ArrayList<XuHuong_BaiHat>? = null
    private var bitmap: Bitmap? = null

    override fun getCount(): Int {
        return arrayQuangCao.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater = LayoutInflater.from(context)
        val view: View = layoutInflater.inflate(R.layout.adapter_xuhuong_quangcao, container, false)

        val imagebackground: ImageView = view.findViewById(R.id.adap_xh_quangcao_image_background)
        val imagepicture: ImageView = view.findViewById(R.id.adap_xh_quangcao_image_pictuer)
        val texttitle: TextView = view.findViewById(R.id.adap_xh_quangcao_textview_title)
        val texttext: TextView = view.findViewById(R.id.adap_xh_quangcao_textview_text)

        if (arrayQuangCao.isNotEmpty()) {
            if (position == 0) {
                setLinearLayoutBackground(arrayQuangCao[position].anhBaihat)
            } else if (position in 1 until arrayQuangCao.size) {
                setLinearLayoutBackground(arrayQuangCao[position - 1].anhBaihat)
            }

            Picasso.get().load(arrayQuangCao[position].anhBaihat)
                .placeholder(R.drawable.gif_loading)
                .error(R.drawable.image_error)
                .into(imagebackground)
            Picasso.get().load(arrayQuangCao[position].anhCasi)
                .placeholder(R.drawable.gif_loading)
                .error(R.drawable.image_error)
                .into(imagepicture)


            texttitle.text = arrayQuangCao[position].tenBaihat
            texttext.text = arrayQuangCao[position].noidungQuangcao
        }

        view.setOnClickListener {
            array?.clear()

            val dataService = APIService.getservice()
            val callbackBaiHatTheoQC: Call<List<XuHuong_BaiHat>> =
                dataService.GetDataDanhSachBaiHatTheoQuangCao(arrayQuangCao[position].idBaihat)
            callbackBaiHatTheoQC.enqueue(object : Callback<List<XuHuong_BaiHat>> {
                override fun onResponse(
                    call: Call<List<XuHuong_BaiHat>>,
                    response: Response<List<XuHuong_BaiHat>>
                ) {
                    array = response.body() as ArrayList<XuHuong_BaiHat>?
                    val bottomSheet_xuHuong_phatNhac_main =
                        BottomSheet_XuHuong_PhatNhac_Main(array, 0)
                    bottomSheet_xuHuong_phatNhac_main.show(
                        (context as AppCompatActivity).supportFragmentManager,
                        bottomSheet_xuHuong_phatNhac_main.tag
                    )
                }

                override fun onFailure(call: Call<List<XuHuong_BaiHat>>, t: Throwable) {

                }
            })

            /*
            val intent = Intent(context, Activity_XuHuong_DanhSachBaiHat::class.java)
            intent.putExtra("idquangcao", arrayQuangCao[position])
            context.startActivity(intent)
             */
        }

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    private fun setLinearLayoutBackground(imageUrl: String) {
        try {
            val url = URL(imageUrl)
            val executor: Executor = Executors.newSingleThreadExecutor()
            executor.execute {
                try {
                    bitmap = BitmapFactory.decodeStream(url.openConnection().getInputStream())
                } catch (e: IOException) {
                    e.printStackTrace()
                }

                (context as AppCompatActivity).runOnUiThread {
                    val bitmapDrawable = BitmapDrawable(context.resources, bitmap)
                    val linearLayout = findViewById<LinearLayout>(R.id.my_linear_layout)
                    linearLayout.background = bitmapDrawable
                }
            }
}

 */