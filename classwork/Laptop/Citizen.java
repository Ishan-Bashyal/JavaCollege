import org.w3c.dom.NameList;

public class Citizen {
    //private attributes
    private String name;
    private String citizenNumber;
    private int age;
    //public methods
    public Citizen(String name, String citizenNumber, int age){
        this.name=name;
        this.citizenNumber=citizenNumber;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCitizen(String citizenNumber){
        this.citizenNumber=citizenNumber;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getCitizen(){
        return citizenNumber;
    }
    public int getAge(){
        return age;
    }
}

class CitizenImp{
    public static void main(String[] args) {
        Citizen citizen1=
        new Citizen("Nimesh", "N2345678", 20);
        System.out.println(citizen1.getName());
        citizen1.setName("Suresh");
    }
}
