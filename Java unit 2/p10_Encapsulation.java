class Student
{
    private int rollno;
    private String name;

    public void setRollno(int r)
    {
        rollno = r;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getRollno()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
}

class p10_Encapsulation
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.setRollno(101);
        s.setName("Rahul");
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Name: " + s.getName());
    }
}