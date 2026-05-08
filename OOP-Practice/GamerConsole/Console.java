class Console
{
    String consoleName;
    int storageCapacity;
    Console(String c,int s)
    {
        consoleName=c;
        storageCapacity=s;
    }
    void display()
    {
        System.out.println("Console Name : "+consoleName);
        System.out.println("Storage Capacity : "+storageCapacity);
    }
    void start()
    {
        System.out.println("Game Starting.......");
    }
}
