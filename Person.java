public class Person {
    private String name;
    private int age;

    public static void anzahlPersonen(){
        anzahlPersonen++;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
    return name;
}

public void setAge(int age){
    this.age = age;
}

public int getAge(){
    return age;
}
public static void main(String[] args){
    Person student = new Person ("Murtaza Hassani", 24);
    Person student2 = new Person ("Amelie Hübner", 19);
    
}