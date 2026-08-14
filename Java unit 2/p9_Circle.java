abstract class Shape
{
    abstract void draw();
}

class p9_Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
    public static void main(String args[])
    {
        p9_Circle c = new p9_Circle();
        c.draw();
    }
}