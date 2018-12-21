package money.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MoneyResponse(@SerializedName("rate:") var rate: Double)