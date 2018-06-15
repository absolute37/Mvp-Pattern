package com.example.tor.ux.base

interface BaseMvpContractor {
    interface View {

        fun getPresenter(): Presenter<*>

    }

    interface Presenter<V : BaseMvpContractor.View> {

        fun attachView(view: View)

        fun detachView()

        fun getView(): V

        fun onViewCreate()

        fun onViewDestroy()

        fun onViewStart()

        fun onViewStop()


    }

}
