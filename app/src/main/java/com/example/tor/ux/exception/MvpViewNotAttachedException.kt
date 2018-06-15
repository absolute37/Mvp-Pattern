package com.example.tor.ux.exception

class MvpViewNotAttachedException : RuntimeException("Please call Presenter.attachView(MvpBaseView) before"
        + " requesting data to the View")