// process of hidign implementation details and showing only functionality to the users
// 1. Abstract Class : 0 to 100 % abstraction implementaion
// 2. Interface : 100% abstraction implementation
 
// abstract keyword is used to create abstract class and abstract methods
abstract class Furniture{
    // abstract class doesnot hvae object. cannot be instantiated
    void greet(){ // Access Modifier: Default
        System.out.println("Hello");
    }
    abstract void printName();

}

class Closet extends Furniture{
    public Closet(){
        System.out.println("Closed called");
    }

    @Override
    void printName(){
        //TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplementated method 'printName'");
        System.out.println("Closet");
    }
}

//omterface does not support constructor
interface Furniture1{
    //final attributes -- constant
    //abstract methods
    void printLength();
}

interface Box extends Furniture1{
    void printVolume();
}

class MyCloset implements Box{

    @Override
    public void printLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printLength'");
    }

    @Override
    public void printVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printVolume'");
    }

}
 
public class Abstraction {
    public static void main(String[] args) {
        // Furniture furniture = new Furniture(); --error
        Closet closet = new Closet();
        closet.greet();
        closet.printName();
    }
}
 