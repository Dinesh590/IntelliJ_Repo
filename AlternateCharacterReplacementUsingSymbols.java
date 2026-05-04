public class AlternateCharacterReplacementUsingSymbols {

    public static void main(String[] args) {
        String input = "Dinesh";
        char[] symbols = {'#','@','$'};



        for (int i=0, j=0;i<input.length();i++){
            if (i% 2 ==0)
            {
                System.out.print(input.charAt(i));
            }else
                System.out.print(symbols[j++]);

        }

    }

}
