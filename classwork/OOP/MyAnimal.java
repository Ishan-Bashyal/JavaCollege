public class MyAnimal {
    //parent class or super class
    public MyAnimal(){
        System.out.println("Animal constructor non parameterized");
    }
    public MyAnimal(int age){
        System.out.println("Animal constructor parameterized");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("Animal might walk");
    }
}

class Human extends MyAnimal{
    public Human(){
        System.out.println("Human constructor");
    }
    //Child class or subclass
    public void talk(){
        System.out.println("Human talks");
    }
    // when parent and child have same method, the method form child is called
    public void walk(){
        // super refers to the attributes and methods of immediate parent
        super.walk();
        System.out.println("Human walks");
    }
}

class Snake extends MyAnimal{
    public void hiss(){
        System.out.println("Snake hisses");
    }
    public void walk(){
        System.out.println("Snake crawls");
    }
}
// hierarchial inheritance -- inheritances in levels
// MyAnimal is the parent of Snake. Snake is the parent of Cobra.
class Cobra extends Snake{
    public void isDangerous(){
        System.out.println("Cobra is dangerous");
    }
}


class InheritanceExample {
    public static void main(String[] args) {
        Human human1= new Human();
        human1.talk();
        human1.eat();
        human1.walk();
        // MyAnimal animal1 = new MyAnimal();
        // animal1.eat();
        // animal1.walk();
        // animal1.talk(); not possible-- parent class cannot use child class methods

    }
}

