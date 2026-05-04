public class AlternateCharacterNumberPattern {
     public static void main(String[] args) {



         String input = "DineshPujitha";
         StringBuilder output = new StringBuilder();
         int count = 1;

         //Take character at even positions and add numbers after them
         for (int i=0;i<input.length();i += 2){
            output.append(input.charAt(i));
            output.append(count);
            count++;

         }
         System.out.println(output.toString());
     }
}
