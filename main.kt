import java.math.BigDecimal
import java.time.LocalDateTime

fun main(args: Array<String>) {

    val ordersAnalyzer = OrdersAnalyzer()
    val order1 = OrdersAnalyzer.Order(554, LocalDateTime.parse("2017-03-25T10:35:20"),
            listOf(OrdersAnalyzer.OrderLine(1,"a",3, BigDecimal(3.00)),
                    OrdersAnalyzer.OrderLine(2,"b",2, BigDecimal(2.00))))
    val order2 = OrdersAnalyzer.Order(555, LocalDateTime.parse("2017-03-25T11:24:20"),
            listOf(OrdersAnalyzer.OrderLine(1,"a",1, BigDecimal(1.00)),
                    OrdersAnalyzer.OrderLine(2,"b",2, BigDecimal(2.00))))
    val order3 = OrdersAnalyzer.Order(455, LocalDateTime.parse("2017-03-20T12:15:02"),
            listOf(OrdersAnalyzer.OrderLine(1,"a",7, BigDecimal(7.00)),
                    OrdersAnalyzer.OrderLine(2,"b",2, BigDecimal(2.00))))
    val orderList =  listOf(order1,order2,order3)
    print(ordersAnalyzer.totalDailySales(orderList))
    //ordersAnalyzer.printTotalDailySales(ordersAnalyzer.totalDailySales(orderList))
}