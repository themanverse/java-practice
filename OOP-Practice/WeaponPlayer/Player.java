class Player
{
    String playerName;
    Weapon w;
    Player(String p,Weapon x)
    {
        playerName=p;
        w=x;
    }
    void fight()
    {
        System.out.println(playerName+" is fighting!");
        w.attack();
        w.showWeapon();
    }
    public static void main(String Args[])
    {
        Weapon w1=new Weapon("Sword",50);
        Player p1=new Player("Manan",w1);
        p1.fight();
    }
}
