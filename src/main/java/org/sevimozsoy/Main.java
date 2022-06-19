package org.sevimozsoy;

/**
 * Hello world!
 *
 */
public class Main
{

    public static void main( String[] args )
    {
        OperationFactory operationFactory = new OperationFactory();
        CustomerOperations customerOperations = new CustomerOperations();
        OrderOperations orderOperations = new OrderOperations();

        //Müşteri listesi oluştur
        //Factory Design Pattern Kullanıldı.
        OperationI operationCustomer = operationFactory.getOperation("CUSTOMER");
        operationCustomer.setInitialize();

        //Order Listesi Oluştur
        OperationI operationOrder = operationFactory.getOperation("ORDER");
        operationOrder.setInitialize();

        //Müşteri ekle
        customerOperations.addNewCustomer("Onur", "Soyisim", 10, 2, 2019);

        //Tüm müşterileri listele
        operationCustomer.getAll();

        //İsminde C olan müşteriler
        customerOperations.getCustomerNamesWithC();

        // Kullanıcı ismine göre yeni fatura oluşturma
        orderOperations.createNewOrder(new Order(4,150000),"Sevim");
        orderOperations.createNewOrder(new Order(5,17000),"Burak");
        orderOperations.createNewOrder(new Order(6,1600),"Berkay");

        //Tüm faturaları(n id'lerini) listele
        operationOrder.getAll();

        //Fatura id = Fatura tutarı --> 1500'den büyük olanlar
        System.out.println(orderOperations.listExpensiveOrders());

        //Fatura tutarı 1500'den fazla olanların ortalamaları
        orderOperations.averageExpensiveOrders();

        System.out.println(customerOperations.juneCustomers());
    }
}
