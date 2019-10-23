package b2512.yeqingnan;

public class Main {

    public static void main(String[] args) {
        String[] letter = new String[] {"flower","flow","flight"};
        String judge = letter[0];
        for (int i = 0; i < letter.length; i++) {
            while (letter[i].indexOf(judge) != 0) {
                judge = judge.substring(0,judge.length()-1);
                if (judge.length() == 0) {
                    System.out.println(" ");
                }
            }
        }
        System.out.println(judge);
    }
}
