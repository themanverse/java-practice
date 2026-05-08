class Driver
{
    Car c;
    String name;
    Driver(String n, Car x)
    {
        name = n;
        c = x;
    }
    void Drive()
    {
        c.start();
        c.showDetails();
    }
    public static void main()
    {
        Car c1=new Car("BMW",150);
        Driver d1=new Driver("Manan",c1);
        d1.Drive();
    }
}
