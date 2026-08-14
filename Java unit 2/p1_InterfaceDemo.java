interface Animal
{
    void sound();   // Abstract method
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

public class p1_InterfaceDemo
{
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.sound();
    }
}