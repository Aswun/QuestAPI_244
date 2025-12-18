package com.example.prak12.repo

import com.example.prak12.apiservice.ServiceApiSiswa
import com.example.prak12.modeldata.DataSiswa

interface RepoDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void>
    suspend fun getSatuSiswa(id: Int): DataSiswa
    suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): retrofit2.Response<Void>
    suspend fun hapusSatuSiswa(id: Int): retrofit2.Response<Void>
}

class JaringanRepoDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
) : RepoDataSiswa {
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
    override suspend fun getSatuSiswa(id: Int): DataSiswa = serviceApiSiswa.getSatuSiswa()
    override suspend fun editSatuSiswa(id: Int, dataSiswa: DataSiswa): retrofit2.Response<Void> = serviceApiSiswa.editSatuSiswa(id, dataSiswa)
    override suspend fun hapusSatuSiswa(id: Int): retrofit2.Response<Void> = serviceApiSiswa.hapusSatuSiswa(id)
}