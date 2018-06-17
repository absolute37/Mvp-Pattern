package com.example.tor.ux

import com.example.tor.ux.base.BaseMvpContractor

class MainContractor {

    interface View : BaseMvpContractor.View {
        fun getName()

    }

    interface Presenter : BaseMvpContractor.Presenter<MainContractor.View> {
        fun setData()
    }

}