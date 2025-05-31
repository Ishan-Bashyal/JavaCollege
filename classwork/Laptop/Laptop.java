package Laptop;

import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;

//accessModifier class className{
// Class Body
// }
// private -- only accessible to class: Personal Diary
// default -- only accessible to package: Group Chat
// protected -- only accessible to package and subclass -- family house
// public -- accessible to all: Census Data


public class Laptop {
    private String color;
    private String model;
    private double price;

    // accessModifier returnType methodName(Parameter){
    // }
    // accessModifier ClassName(Parameter){
    // }

    // Parameterized
    public Laptop(String model){
        System.out.println("Constructor with model "+model);
    }
    public Laptop(double price){
        System.out.println("Constructor with price"+price);
    }
    public Laptop(String model, String color, double price){
        this.color=color;
        this.price=price;
        this.model=model;
        System.out.println("All values set by constructor");
    }
    // NonParameterized
       public Laptop(){
    }




    public void setModel(String model){
        this.model=model;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }


    public void openApp(){
        System.out.println(model+" opened app.");
    }
    public void closeApp(){
        System.out.println(model+" closed app.");
    }
    
}

class LaptopDriver{
    public static void main(String[] args) {
        int a;
        Laptop acer= new Laptop();
        Laptop hp= new Laptop("hp");
        Laptop dell= new Laptop(100000.3);
        Laptop asus= new Laptop("Asus","black",80000.2);
        // Laptop lenovo= new Laptop("lenovo","white");
        // error because constructor is not found for given parameters

        // acer.model="Acer";
        // System.out.println(acer.model);
        acer.setModel("Acer");
        String val= acer.getModel();
        System.out.println(val);
        acer.openApp();
    }
}


//identity - name : acer
//properties -- attributes/variables : color,model,price
//behaviours -- method: openApp, closeApp
