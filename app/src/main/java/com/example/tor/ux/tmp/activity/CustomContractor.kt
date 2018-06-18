package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BaseMvpContractor

class CustomContractor {
    interface View : BaseMvpContractor.View
    interface Presenter : BaseMvpContractor.Presenter<View>
}