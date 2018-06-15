package com.example.tor.ux.customlayout

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView

import com.example.tor.ux.R

class Toolbar : FrameLayout {
    private var imgBtnBack: ImageView? = null


    constructor(context: Context) : super(context) {
        setUpView(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setUpView(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        setUpView(attrs)

    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) : super(context, attrs, defStyleAttr, defStyleRes) {
        setUpView(attrs)
    }

    private fun setUpView(attributeSet: AttributeSet?) {
        View.inflate(context, R.layout.custom_toolbar, this)
        bindView()

    }

    private fun bindView() {
        imgBtnBack = findViewById(R.id.button_click_back)

    }

}
