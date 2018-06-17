package com.example.tor.ux

import com.example.tor.ux.base.BaseMvpPresenter

class MainPresenter : BaseMvpPresenter<MainContractor.View>(), MainContractor.Presenter {

    fun create(): MainContractor.Presenter {
        return MainPresenter()
    }

    override fun setData() {

    }

}