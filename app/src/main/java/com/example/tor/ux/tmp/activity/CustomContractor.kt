package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BaseContractor

class CustomContractor {
    internal interface View {

        fun showMessage(message: String)

        fun showTitle(title: String)

    }

    internal interface Presenter {
        fun getData()
    }
}