package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BasePresenter

class CustomActivityPresenter : CustomContractor.Presenter {
    private lateinit var getView : CustomContractor.View

    override
    fun getData() {

        getView.showMessage("TEST")
        getView.showTitle("HELLO ~ ")
    }


}

