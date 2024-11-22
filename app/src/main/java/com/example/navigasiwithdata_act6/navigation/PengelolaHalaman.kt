package com.example.navigasiwithdata_act6.navigation

import androidx.compose.runtime.Composable
import com.example.navigasiwithdata_act6.ui.view.viewmodel.MahasiswaViewModel
import com.example.navigasiwithdata_act6.ui.view.viewmodel.RencanaStudyViewModel
import java.lang.reflect.Modifier

enum class Halaman {
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    krsViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
)
{

}