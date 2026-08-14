interface A
{
    void show();
}

interface B
{
    void display();
}

class p7_C implements A, B
{
    public void show()
    {
        System.out.println("This is Interface A");
    }

    public void display()
    {
        System.out.println("This is Interface B");
    }

    public static void main(String args[])
    {
        p7_C obj = new p7_C();

        obj.show();
        obj.display();
    }
}