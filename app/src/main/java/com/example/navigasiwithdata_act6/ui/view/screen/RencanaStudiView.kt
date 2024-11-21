package com.example.navigasiwithdata_act6.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.navigasiwithdata_act6.R
import com.example.navigasiwithdata_act6.model.Mahasiswa
import com.example.navigasiwithdata_act6.model.RencanaStudi

@Composable
fun RencanaStudi(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) ->Unit,
    onBackButtonClicked: ()->Unit
){
    var chosenDropDown by remember {
        mutableStateOf( "")
    }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember {
        mutableStateOf( "")
    }
    var listData: MutableList<String> = mutableListOf(chosenDropDown, pilihanKelas)
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary))
    )
    {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), verticalAlignment = Alignment.CenterVertically
        ){

        }


    }



}