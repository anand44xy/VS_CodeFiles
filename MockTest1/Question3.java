/*
Q.3 Create a class called Person with private properties like name, age, and address. Provide public getter and 
setter methods for these properties. Write a program that creates an instance of the Person class, sets values 
for its properties using the setter methods, and displays the values using the getter methods.
 Ans. 
 */

// package MockTest1;

class Person{
    private String name;
    private int age;
    private String address;
        
    // getters for Person
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    // setters for Person
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setAddress(String address){
        this.address=address;
    }
}

public class Question3 {
    public static void main(String[] args) {
       Person person=new Person();
    // set values by setter 
    person.setName("Anand Kumar Saini");
    person.setAge(22);
    person.setAddress("Bansur, Alwar, Rajathan 301402");

    System.out.println("Name: "+ person.getName());
     System.out.println("Age: "+ person.getAge());
      System.out.println("Address : "+ person.getAddress());

    }
}
