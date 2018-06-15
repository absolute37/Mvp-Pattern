package com.example.tor.ux.exception

class MvpPresenterNotCreateException : RuntimeException("Please call createPresenter() before"
        + " requesting data to the Presenter")