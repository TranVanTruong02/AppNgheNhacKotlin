package com.example.zing.Service

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Protocol
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class APIRetrofitClient {
    companion object { // Companion object là một cách để tạo ra các thành phần (phương thức, thuộc tính) của lớp mà không cần tạo một phiên bản của lớp đó.
        private var retrofit: Retrofit? = null

        fun getClient(base_url: String): Retrofit {
            if (retrofit == null) {
                val okHttpClient = OkHttpClient.Builder()
                    .readTimeout(10000, TimeUnit.MILLISECONDS)
                    .writeTimeout(10000, TimeUnit.MILLISECONDS)
                    .connectTimeout(10000, TimeUnit.MILLISECONDS)
                    .retryOnConnectionFailure(true)
                    .protocols(listOf(Protocol.HTTP_1_1))
                    .build()

                val gson = GsonBuilder().setLenient().create()

                retrofit = Retrofit.Builder()
                    .baseUrl(base_url)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit!! // sử dụng !! để khẳng định rằng retrofit không bao giờ bằng null
        }
    }

    // Lý thuyết
/*
    Một class là một khuôn mẫu (template) để tạo ra các đối tượng (objects) cụ thể.
    Bạn có thể tạo nhiều đối tượng từ một lớp và mỗi đối tượng có trạng thái và hành vi riêng của nó.

    object là từ khóa để tạo ra một đối tượng duy nhất (singleton) trong Kotlin.
    Đối tượng duy nhất chỉ có một phiên bản duy nhất trong toàn bộ chương trình và bạn có thể truy cập đến nó từ bất kỳ đâu
*/
}
