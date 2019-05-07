package com.example.myapplication

abstract class TestContont {
    abstract class TestModel {
        abstract fun requestLogin();
    }

    abstract class TestPresenter {
        abstract fun initMvp(model: TestModel, view: TestView)
        abstract fun requestLogin()

    }

    abstract class TestView {
        abstract fun requestSuccess()
        abstract fun requestError()
    }
}