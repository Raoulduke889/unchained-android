package com.github.livingwithhippos.unchained.base.model.network


import com.github.livingwithhippos.unchained.data.remote.HostsApiHelper
import retrofit2.Response
import javax.inject.Inject

class HostsApiHelperImpl @Inject constructor(private val hostsApi: HostsApi) :
    HostsApiHelper {

    override suspend fun getHostsStatus(token: String): Response<Host> = hostsApi.getStreams(token)
}