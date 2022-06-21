import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    int age;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    Human(String n, int a){
        name = n;
        age = a;
    }
    @Override public String toString() {
        return ("Student[ "+"Name:"+this.getName()+ " Age: "+ this.getAge());
    }
}
class Example {
    public static void main(String[] args) {
        List<Human> studentlist = new ArrayList<Human>();
        studentlist.add(new Human("John", 25));
        studentlist.add(new Human("Edward", 75));
        studentlist.add(new Human("Layla", 50));
        studentlist.add(new Human("Josh", 100));
        studentlist.add(new Human("Adama", 125));

        studentlist.forEach((s)->System.out.println(s));
        System.out.println("______________________________________________");

        //Lambda expression for sorting by age
        studentlist.sort((Human s1, Human s2)->s1.getAge()-s2.getAge());
        studentlist.forEach((s)->System.out.println(s));
        System.out.println("______________________________________________");

        //Lambda expression for sorting the list by student name
        studentlist.sort((Human s1, Human s2)->s1.getName().compareTo(s2.getName()));
        studentlist.forEach((s)->System.out.println(s));
    }
}
//Romen Adama Caetano Ramirez