package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BasePresenter

class CustomActivityPresenter : BasePresenter<CustomContractor.View>(), CustomContractor.Presenter {

    companion object {
        fun create(): CustomContractor.Presenter {

            return CustomActivityPresenter()
        }
    }

}

