class Weapon
{
    String weaponName;
    int damage;
    Weapon(String w,int d)
    {
        weaponName=w;
        damage=d;
    }
    void showWeapon()
    {
        System.out.println("Weapon Name : "+weaponName);
        System.out.println("Damage : "+damage);
    }
    void attack()
    {
        System.out.println(weaponName+" attacking......");
    }
}
