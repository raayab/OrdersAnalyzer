import java.math.BigDecimal
import java.time.DayOfWeek
import java.time.LocalDateTime


class OrdersAnalyzer {

    data class Order(val orderId: Int, val creationDate: LocalDateTime, val orderLines: List<OrderLine>)

    data class OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: BigDecimal)

    fun totalDailySales(orders: List<Order>): Map<DayOfWeek, Int> {

        val dailySales = HashMap<DayOfWeek, Int>()
        for (order in orders) {
            val dayOfWeek = order.creationDate.dayOfWeek
            if (!dailySales.containsKey(dayOfWeek))
                dailySales[dayOfWeek] = 0 //start count with 0
            val totalQuantity =  order.orderLines.fold(dailySales[dayOfWeek]!!) {total,next -> total+next.quantity}
            dailySales.replace(dayOfWeek,totalQuantity)
        }
        return dailySales
    }



}
