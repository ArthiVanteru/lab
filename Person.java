interface Person
{
    void speak();
}

// create the student class implementing the person interface
class Student implements Person
{
    @Override
    public void speak()
    {
        System.out.println("I am a student.");
    }
}

// create the teacher class implementing the person interface
class Teacher implements Person
{
    @Override
    public void speak()
    {
        System.out.println("I am a teacher i will teach maths subject.");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // Create an objects of Student class and teacher class
        Student s = new Student();
        Teacher t = new Teacher();
        //calling speak method
        s.speak();
        t.speak();
   }
}
