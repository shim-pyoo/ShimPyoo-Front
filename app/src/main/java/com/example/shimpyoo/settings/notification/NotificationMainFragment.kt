package com.example.shimpyoo.settings.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.shimpyoo.R

class NotificationMainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.notification_main_view, container, false)
        val resettingFragment = NotificationSettingFragment()

        // 레이아웃 설정 후에 settingButton 찾기
        val settingBtn = view.findViewById<Button>(R.id.settingButton)
        settingBtn.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, resettingFragment)
                .addToBackStack(null)
                .commit()
        }
        return view;
    }
}