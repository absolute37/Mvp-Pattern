package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BaseMvpPresenter

class CustomActivityPresenter : BaseMvpPresenter<CustomContractor.View>, CustomContractor.Presenter {

    fun create(): CustomContractor.Presenter {
        return CustomActivityPresenter()
    }
}

