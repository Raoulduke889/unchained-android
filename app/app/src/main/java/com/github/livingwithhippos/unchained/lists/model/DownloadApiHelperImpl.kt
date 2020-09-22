package com.github.livingwithhippos.unchained.lists.model

import retrofit2.Response
import javax.inject.Inject

class DownloadApiHelperImpl @Inject constructor(private val downloadsApi: DownloadsApi) :
    DownloadApiHelper {

    override suspend fun getDownloads(
        token: String,
        offset: Int?,
        page: Int,
        limit: Int
    ): Response<List<DownloadItem>> =
        downloadsApi.getDownloads(token, offset, page, limit)
}