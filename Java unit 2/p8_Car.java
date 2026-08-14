class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}

class p8_Car extends Vehicle
{
    void run()
    {
        System.out.println("Car is running fast");
    }
    public static void main(String args[])
    {
        p8_Car c = new p8_Car();
        c.run();
    }
}