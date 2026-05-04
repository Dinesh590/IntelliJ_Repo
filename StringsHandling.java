public class StringsHandling {

   public static void main(String[] args) {

       //payment $100 paid
       //

       String str = "Payment $100 paid";
       System.out.println(str.charAt(8));
      //singular
       String str1 = "Payments $100 paid";
       System.out.println(str.indexOf("$"));
       System.out.println(str.substring(8));

    }


}
