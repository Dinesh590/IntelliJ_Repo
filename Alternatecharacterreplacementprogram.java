public class Alternatecharacterreplacementprogram {

    public static void main(String[] args) {
        String input = "Dinesh";
        char ch = 'a';



        for (int i =0; i<input.length();i++){
            if (i % 2 ==0){
                //keep original character
                System.out.print(input.charAt(i));
            }else {
                //replace with a,b,c
                System.out.print(ch++);
            }
        }

    }
}
