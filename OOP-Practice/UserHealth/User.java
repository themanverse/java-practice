class User
{
    String userName;
    int health;
    User(String u,int h)
    {
        userName=u;
        health=h;
    }
    void display()
    {
        System.out.println("Player Name : "+userName);
        System.out.println("Health : "+health);
    }
    void increaseHealth(int h)
    {
        health=health+h;
    }
}
