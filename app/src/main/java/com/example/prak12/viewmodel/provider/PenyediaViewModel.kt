package com.example.prak12.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.prak12.repo.AplikasiDataSiswa
import com.example.prak12.viewmodel.EntryViewModel
import com.example.prak12.viewmodel.HomeViewModel

fun CreationExtras.aplikasiDataSiswa():AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as
                AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container
            .repoDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container
            .repoDataSiswa) }
    }
}