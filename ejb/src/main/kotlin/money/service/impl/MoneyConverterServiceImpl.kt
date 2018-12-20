package money.service.impl

import money.service.manager.MoneyConverterService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.ejb.Stateless
import javax.transaction.Transactional

@Stateless
@Transactional
class MoneyConverterServiceImpl: MoneyConverterService {

    private val okHttpClient: OkHttpClient

    init {
        val builder = OkHttpClient.Builder()
        val httpLoggingInterceptor = HttpLoggingInterceptor()

        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.networkInterceptors().add(httpLoggingInterceptor)

        okHttpClient = builder.build()
    }

//    override fun convertEuroToDollars(euro: String): String {
//        /*
//        curl -X POST -H "Content-Type:application/json" -H "token:Y8qBV2pLZm5Ho4grdHFXE1rhCaqmtXbJ26q4JBLY" --data '{"base":"USD", "target":"EUR"}' https://pvfsds8nk9.execute-api.eu-west-3.amazonaws.com/prod
//         */
//
//
//    }
}