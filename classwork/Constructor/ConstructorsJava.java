
import java.lang.reflect.Constructor;

public class ConstructorsJava{
    int num;
    // void setNum(int num){
    //     this.num=num;
    // }

    ConstructorsJava() {
        System.out.println("Non Parameterized Constructor");
    }

    ConstructorsJava(int a){
        num=a;
    }

    ConstructorsJava(int num,int b) {
        int sum=num+b;
        this.num = num;
    }
    ConstructorsJava(String val){
        System.out.println("New parameterized with "+val);
    }
    ConstructorsJava(ConstructorsJava obj){
        System.out.println("Copy Constructor");
        num=obj.num;
    }

    void setNum(int num){
        this.num=num;
    }


}

class UsingConstructor{
    public static void main(String[] args) {
        ConstructorsJava obj1= new ConstructorsJava();
        ConstructorsJava obj2= new ConstructorsJava(1);
        ConstructorsJava obj3= new ConstructorsJava(12, 2);
        ConstructorsJava obj4= new ConstructorsJava("Hello");
        ConstructorsJava obj5= new ConstructorsJava(obj2);
    }
}