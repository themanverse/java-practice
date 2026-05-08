class HealthPotion
{
    int healAmount;
    HealthPotion(int h)
    {
        healAmount=h;
    }
    void use(User u)
    {
        u.display();
        System.out.println("Using Potion.....");
        u.increaseHealth(healAmount);
        u.display();
    }
    public static void main(String Args[])
    {
        User u1=new User("Manan",70);
        HealthPotion h1=new HealthPotion(30);
        h1.use(u1);
    }
}
