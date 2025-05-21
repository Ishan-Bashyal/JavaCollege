public class MethodsMulti{
    static void multiply(int a,int b){
        System.out.println(a*b);
    }

    void add1(int a,int b){
        System.out.println(a+b);
    }

    static void Greet() {
        System.out.println("Hello");   
    }

    public static void main(String[] args) {
        multiply(3, 2);
        //Classname variablename= new Classname();
        MethodsMulti newclass = new MethodsMulti();
        newclass.add1(1, 2);
        Greet();
    }

    

    

}
