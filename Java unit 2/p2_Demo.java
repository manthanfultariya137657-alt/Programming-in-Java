interface A
{
    void show();
}
interface B extends A
{
    void display();
}
class p2_Demo implements B
{
    public void show()
    {
        System.out.println("This is Show method");
    }

    public void display()
    {
        System.out.println("This is Display method");
    }

    public static void main(String args[])
    {
        p2_Demo d = new p2_Demo();

        d.show();
        d.display();
    }
}