class GrandParent
{
    void show()
    {
        System.out.println("This is GrandParent class");
    }
}

class Parent extends GrandParent
{
    void display()
    {
        System.out.println("This is Parent class");
    }
}

class p4_Child extends Parent
{
    void print()
    {
        System.out.println("This is Child class");
    }

    public static void main(String args[])
    {
        p4_Child c = new p4_Child();

        c.show();
        c.display();
        c.print();
    }
}