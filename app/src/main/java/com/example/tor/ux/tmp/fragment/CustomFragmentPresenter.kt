package com.example.tor.ux.tmp.fragment

import com.example.tor.ux.base.BaseMvpPresenter

class CustomFragmentPresenter : BaseMvpPresenter<CustomFragmentContractor.View>,CustomFragmentContractor.Presenter {

    fun create(): CustomFragmentContractor.Presenter {
        return CustomFragmentPresenter()
    }

}