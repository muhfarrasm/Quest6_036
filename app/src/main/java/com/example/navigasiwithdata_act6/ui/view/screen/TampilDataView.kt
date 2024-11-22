package com.example.navigasiwithdata_act6.ui.view.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.unit.dp
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
    Column (
        modifier = modifier.fillMaxSize() .padding(16.dp)
    ){
        listDataMhs.forEach { data->
            DetailMhs(judul = data.first,
                isi = data.second)
        }

        Button(onClick = {onBackButtonClicked()}) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailMhs(judul: String, isi: String)
{
    Row (
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)

    ){
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = isi,
            modifier = Modifier.weight(2f))
    }

}
