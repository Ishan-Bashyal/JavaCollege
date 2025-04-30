public class DiffMethods{
    static int add(int a,int b){ //return + parameter
        return a+b;
    }

    static int subtract(){ //return + no parameter
        int a=4;
        int b=2;
        return a-b;
    }


    static void multiply(int a,int b){ //no return + parameter
        System.out.println(a*b);
    }


    static void division(){ //no return + no parameter
        int a=6;
        int b=3;
        System.out.println(a/b);
    }


    public static void main(String[] args) {
        int sum=add(3, 2);
        System.out.println(sum);

        System.out.println(subtract());  

        multiply(2, 3);

        division();


    }

}