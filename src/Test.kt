import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.Calendar

fun main() {
    println("${Calendar.getInstance().get(Calendar.MONTH) + 1}/${Calendar.getInstance().get(Calendar.DAY_OF_MONTH)} ${Calendar.getInstance().get(Calendar.HOUR_OF_DAY)}:${Calendar.getInstance().get(Calendar.MINUTE)}")

    val a = "cibai"
    println(a.substring(a.length - 2))
}