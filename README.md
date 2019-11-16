# OrdersAnalyzer

Calculate the total ordered quantity for every weekday:

1.Implement OrdersAnalyzer#totalDailySales method that returns a map with a DayOfWeek as a key and the sum of ordered quantity for all products, as a value.<br/>
2.The method should always return a map. If there are no orders for some weekdays, then skip this day entry in the map.

## Example output
Your implementation should return the following output for example data:
{
  "DayOfWeek.MONDAY" : 17,
  "DayOfWeek.SATURDAY" : 6,
  "DayOfWeek.SUNDAY" : 9 
}<br/>
In the example above, there are three orders placed on Saturday: first with a quantity equal to 3 and second with quantity equal to 2, and third with a quantity equal to 1 so the sum of quantities is 6. For Monday the total quantity is equal to 17, and for Sunday it's 9.

## Example input
Orders collection:
[
    {
        orderId: 554,
        creationDate: "2017-03-25T10:35:20", // Saturday
        orderLines: [
            {productId: 9872, name: 'Pencil', quantity: 3, unitPrice: 3.00}
        ]
    },
    {
        orderId: 555,
        creationDate: "2017-03-25T11:24:20", // Saturday
        orderLines: [
            {productId: 9872, name: 'Pencil', quantity: 2, unitPrice: 3.00},
            {productId: 1746, name: 'Eraser', quantity: 1, unitPrice: 1.00}
        ]
    },
    {
        orderId: 453,
        creationDate: "2017-03-27T14:53:12", // Monday
        orderLines: [
            {productId: 5723, name: 'Pen', quantity: 4, unitPrice: 4.22},
            {productId: 9872, name: 'Pencil', quantity: 3, unitPrice: 3.12},
            {productId: 3433, name: 'Erasers Set', quantity: 1, unitPrice: 6.15}
        ]
    },
    {
        orderId: 431,
        creationDate: "2017-03-20T12:15:02", // Monday
        orderLines: [
            {productId: 5723, name: 'Pen', quantity: 7, unitPrice: 4.22},
            {productId: 3433, name: 'Erasers Set', quantity: 2, unitPrice: 6.15}
        ]
    },
    {
        orderId: 690,
        creationDate: "2017-03-26T11:14:00", // Sunday
        orderLines: [
            {productId: 9872, name: 'Pencil', quantity: 4, unitPrice: 3.12},
            {productId: 4098, name: 'Marker', quantity: 5, unitPrice: 4.50}
        ]
    }
];
