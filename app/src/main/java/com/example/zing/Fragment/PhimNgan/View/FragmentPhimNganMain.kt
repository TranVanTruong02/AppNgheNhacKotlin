package com.example.zing.Fragment.PhimNgan.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.zing.R

class FragmentPhimNganMain : Fragment() {

    private lateinit var view: View

    // Fragment được sử dụng để tạo và khởi tạo giao diện của Fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = inflater.inflate(R.layout.fragment_phimngan_main, container, false)
        return view;
    }

    // onViewCreated() cho phép bạn thực hiện các hoạt động liên quan đến giao diện sau khi nó đã được khởi tạo hoàn toàn,
    // đảm bảo rằng các View đã sẵn sàng để tương tác và xử lý
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}