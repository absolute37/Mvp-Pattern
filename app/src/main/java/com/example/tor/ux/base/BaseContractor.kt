package com.example.tor.ux.base

interface BaseContractor {
    interface View {

        fun getPresenter(): Presenter<BaseContractor.View>

    }

    interface Presenter<V : View> {

        fun attachView(mvpView: V)

        fun detachView()

        fun getView(): V

        fun onViewCreate()

        fun onViewDestroy()

        fun onViewStart()

        fun onViewStop()


    }

}
