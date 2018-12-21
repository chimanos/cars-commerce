package money.service.impl

import com.google.gson.Gson
import money.entity.MoneyBody
import money.entity.MoneyResponse
import money.service.manager.MoneyConverterService
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.logging.HttpLoggingInterceptor
import java.io.IOException
import javax.ejb.Stateless

@Stateless
open class MoneyConverterServiceImpl : MoneyConverterService {

    private val okHttpClient: OkHttpClient
    private val gson: Gson

    private val moneyRate: Double

    companion object {
        val MEDIA_JSON = MediaType.parse("application/json; charset=utf-8")
    }

    init {
        val builder = OkHttpClient.Builder()
        val httpLoggingInterceptor = HttpLoggingInterceptor()

        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.networkInterceptors().add(httpLoggingInterceptor)

        okHttpClient = builder.build()

        gson = Gson()

        moneyRate = getRateFromAmazonLambda().rate
    }


    @Throws(IOException::class)
    override fun convertEuroToDollars(euro: String): String {
        return "${(Integer.parseInt(euro) * moneyRate).toInt()}"
    }

    /**
     * curl -X POST -H "Content-Type:application/json" -H "token:Y8qBV2pLZm5Ho4grdHFXE1rhCaqmtXbJ26q4JBLY" --data '{"base":"USD", "target":"EUR"}' https://pvfsds8nk9.execute-api.eu-west-3.amazonaws.com/prod
     */
    private fun getRateFromAmazonLambda(): MoneyResponse {
        val money = MoneyBody(MoneyBody.MoneyType.EUR.name, MoneyBody.MoneyType.USD.name)
        val body = RequestBody.create(MEDIA_JSON, gson.toJson(money))
        val request = getBaseRequest().post(body).build()
        val response = okHttpClient.newCall(request).execute()

        if (!response.isSuccessful) throw IOException("Unexpected code $response")

        return gson.fromJson(response.body()!!.string(), MoneyResponse::class.java)
    }

    private fun getBaseRequest(): Request.Builder {
        return Request.Builder()
                .addHeader("Accept", "application/json; q=0.5")
                .header("token", "Y8qBV2pLZm5Ho4grdHFXE1rhCaqmtXbJ26q4JBLY")
                .url("https://pvfsds8nk9.execute-api.eu-west-3.amazonaws.com/prod")
    }
}