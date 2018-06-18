package com.example.tor.ux.tmp.activity

import com.example.tor.ux.base.BaseContractor

class CustomContractor {
    interface View : BaseContractor.View

    interface Presenter : BaseContractor.Presenter<CustomContractor.View>
}