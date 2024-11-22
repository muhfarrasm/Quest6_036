package com.example.navigasiwithdata_act6.ui.view.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.lifecycle.ViewModel
import com.example.navigasiwithdata_act6.model.RencanaStudi
import com.example.navigasiwithdata_act6.ui.view.screen.RencanaStudi

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class RencanaStudyViewModel : ViewModel() {
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUI: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update { stateMK -> stateMK.copy(namaMK = mkPilihan)}

    }

    fun setKelas(kelasPilihan: String) {
        _krsState.update { statekelas -> statekelas.copy(kelas = kelasPilihan)}

    }

    fun saveDataKRS(ls: MutableList<String>)
    {
        _krsState.update { status -> status.copy(
            namaMK = ls[0],
            kelas = ls[1]

        ) }
    }


}

