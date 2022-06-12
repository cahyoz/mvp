package com.example.mvp

class MainPresenter(private val mainView: MainActivity) {
    fun hitungLuasPersegiPanjang(panjang : Float, lebar : Float){
        if (panjang == 0F) { mainView.showError("panjang gaboleh nol")
            return }

        if (lebar == 0F) { val luasPersegi = panjang * 2
            mainView.updateLuas(luasPersegi)
            return }


        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        if (panjang == 0F) { mainView.showError("panjang gaboleh nol")
            return }

        if (lebar == 0F) { val kelilingPersegi = panjang * 4
            mainView.updateLuas(kelilingPersegi)
            return }

        val keliling = (2*panjang) + (2*lebar)
        mainView
    }

}