class Car
{
    String Brand;
    int speed;
    Car(String b,int s)
    {
        Brand=b;
        speed=s;
    }
    void showDetails()
    {
        System.out.println("Car Brand : "+Brand);
        System.out.println("Car Speed : "+speed);
    }
    void start()
    {
        System.out.println("Car started");
    }
}
