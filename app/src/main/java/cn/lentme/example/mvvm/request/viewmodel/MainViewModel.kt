package cn.lentme.example.mvvm.request.viewmodel

import androidx.lifecycle.MutableLiveData
import cn.lentme.mvvm.base.BaseViewModel

class MainViewModel: BaseViewModel() {
    val hello by lazy { MutableLiveData("hello world") }
}