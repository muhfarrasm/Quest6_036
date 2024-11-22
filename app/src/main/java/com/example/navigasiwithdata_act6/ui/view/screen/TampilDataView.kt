package com.example.navigasiwithdata_act6.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.navigasiwithdata_act6.model.Mahasiswa
import com.example.navigasiwithdata_act6.model.RencanaStudi


@Composable
fun TampilDataView(
    dataMhs: Mahasiswa,
    dataKrs: RencanaStudi,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
)
{
    val listDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("NIM", dataMhs.nim),
        Pair("Email", dataMhs.email),
        Pair("Mata Kuliah", dataKrs.namaMK),
        Pair("Kelas", dataKrs.kelas)
    )


}