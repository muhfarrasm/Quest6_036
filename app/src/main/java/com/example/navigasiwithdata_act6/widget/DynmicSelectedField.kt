package com.example.navigasiwithdata_act6.widget

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DynamicSelectedField(
    selectedValue: String,
    options: List<String>,
    label: String,
    onValueChangeEvent: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    var expanded by remember {
        mutableStateOf(false)
    }
    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = {expanded = !expanded},
        modifier = Modifier
    )
    {

    }


}