public class forloop1 {
    public static void main(String[] args) {
        //int i=2, j=2;
        //int sum1= 5+ ++i;
        //int sum2= 5+ j++;
        //System.out.println(sum1);
        //System.out.println(sum2);

        //initialize condition increment
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //MULTIPLICATION TABLE FROM 1 TO 10
        //1*1 =1

        for(int j=1;j<11;j++){
            for(int k=1;k<11;k++){
                System.out.println(j+"x"+k+"="+j*k);
            }
        }
    }
    
}
