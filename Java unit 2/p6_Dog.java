abstract class Animal
{
    abstract void sound();

    void eat()
    {
        System.out.println("Animal eats");
    }
}

class p6_Dog extends Animal
{
    void sound()
    {
        System.out.println("Dog barks");
    }

    public static void main(String args[])
    {
        p6_Dog d = new p6_Dog();

        d.sound();
        d.eat();
    }
}