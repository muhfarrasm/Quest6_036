package com.example.navigasiwithdata_act6.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MahasiswaFormView(
    modifier: Modifier,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
    var nama by remember {
        mutableStateOf("")
    }

    var nim by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    val listData: MutableList<String> =
        mutableListOf(nim, nama, email)
