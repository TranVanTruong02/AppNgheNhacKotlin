package com.example.zing.Fragment.BaiDang.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zing.R

class FragmentBaiDangMain : Fragment() {

    private lateinit var view: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        view = inflater.inflate(R.layout.fragment_baidang_main, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Gọi các phương thức khởi tạo giao diện tại đây (nếu có) - Sự kiện click, ...
    }

    /*
        Lý thuyết:
            companion object là một khối mã được sử dụng trong Kotlin để định nghĩa các thành phần tĩnh (static) của một lớp.
     */
}