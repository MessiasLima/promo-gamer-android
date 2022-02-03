package com.messiaslima.promogamer.core.network.store

import com.messiaslima.promogamer.core.network.CheapSharkService
import com.messiaslima.promogamer.core.network.PromoGamerNetworkException
import javax.inject.Inject

class StoreServiceImpl @Inject constructor(
    private val cheapSharkService: CheapSharkService,
) : StoreService {
    override suspend fun getStores(): List<StoreResponse> {
        val storesResponse = cheapSharkService.getStores()

        return if (storesResponse.isSuccessful) {
            storesResponse.body().orEmpty()
        } else {
            throw PromoGamerNetworkException(storesResponse.message())
        }
    }
}
