class Restaurant
{
    String restaurantName;
    int foodPrice;
    Restaurant(String r,int f)
    {
        restaurantName=r;
        foodPrice=f;
    }
    void Order(Customer c)
    {
        c.display();
        System.out.println("Order placed at "+restaurantName+" Restaurant");
        c.reduce(foodPrice);
        System.out.println("Payment Successful");
        c.display();
    }
    public static void main(String Args[])
    {
        Customer c1=new Customer("Manan",500);
        Restaurant r1=new Restaurant("Babian",300);
        r1.Order(c1);
    }
}
