class Gamer
{
    String gamerName;
    Console c;
    Gamer(String g,Console x)
    {
        gamerName=g;
        c=x;
    }
    void playGame()
    {
        c.start();
        c.display();
    }
    public static void main(String Args[])
    {
        Console c1=new Console("ps5",16);
        Gamer g1=new Gamer("Manan",c1);
        g1.playGame();
    }
}
