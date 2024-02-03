class person
{
    String Firstname;
    String Lastname;
    int age;
    person(String Fname,String Lname,int a)
    {
        Firstname = Fname;
        Lastname = Lname;
        age = a;
    }
    String getfullname (){
    
        return Firstname+ " " + Lastname;
}
}
    class Person{
    public static void main(String args[])
    {
        person a1 = new person("Jhon","doe",30);
        person a2 = new person("Alice","Smith",25);
        System.out.println("person 1:" + a1.getfullname());
        System.out.println("person 2:" + a2.getfullname());//
        double average = ((a1.age + a2.age)/2.0);
        System.out.println("Average :" + average);
        
    }//
}
