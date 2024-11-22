package com.example.navigasiwithdata_act6.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigasiwithdata_act6.ui.view.screen.MahasiswaFormView
import com.example.navigasiwithdata_act6.ui.view.screen.SplashView
import com.example.navigasiwithdata_act6.ui.view.viewmodel.MahasiswaViewModel
import com.example.navigasiwithdata_act6.ui.view.viewmodel.RencanaStudyViewModel


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
    val mahasiswaUiState = mahasiswaViewModel.mahasiswaStateUi.collectAsState().value
    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = modifier.padding()
    )
    {
        composable(route = Halaman.Splash.name) {
            SplashView(
                onMulaiButton = {
                    navController.navigate(Halaman.Mahasiswa.name)
                }
            )
        }

        composable(route = Halaman.Mahasiswa.name){
            MahasiswaFormView(
                modifier =modifier,
                onSubmitButtonClicked = {
                    mahasiswaViewModel.saveDataMahasiswa(it)
                    navController.navigate(Halaman.Matakuliah.name)
                },
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Halaman.Matakuliah.name) {
            RencanaStudiView(
                mahasiswa = mahasiswaUiState,
                onSubmitButtonClicked = {
                    krsViewModel.saveDataKRS(it)
                    navController.navigate(Halaman.Tampil.name)
                },
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }
        composable(route = Halaman.Tampil.name) {
            TampilDataView(
                dataMhs = mahasiswaUiState,
                dataKrs = krsViewModel.krsStateUi.collectAsState().value,
                onBackButtonClicked = {
                    navController.popBackStack()
                }
            )
        }

    }

}