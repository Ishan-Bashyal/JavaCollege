package Basic;
// public class Discount{
//     public static void main(String[] args) {
//         double groceryDiscount=0.05;
//         double groceryPrice=20;
//         double groceryDiscountedPrice=groceryPrice*groceryDiscount;
//         double groceryFinalPrice=groceryPrice-groceryDiscountedPrice;
//     }
// }


public class Discount{
    static double discountCalc(double price, double discount){
        double discountedPrice=price*discount;
        double finalPrice=price-discountedPrice;
        return finalPrice;
    }
    public static void main(String[] args) {
        double groceryDiscount=0.05;
        double groceryPrice=20;
        double groceryFinalPrice= discountCalc(groceryPrice, groceryDiscount);
    }
}