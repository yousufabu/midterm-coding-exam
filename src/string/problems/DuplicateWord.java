package string.problems;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String [] allWord = st.split(" ");
        HashMap<String,Integer> wordC = new HashMap<String,Integer>();
        for(String word : allWord){
            if(wordC.containsKey(word.toLowerCase())){
                wordC.put(word.toLowerCase(),wordC.get(word.toLowerCase())+1);
            }
            else{
                wordC.put(word.toLowerCase(),1);
            }
        }

        Set<String> wordsInString = wordC.keySet();
        for(String word : wordsInString){
            if(wordC.get(word)>1){
                System.out.println(word+" : "+wordC.get(word));
            }
        }



        public class Palindrome {
            public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

                String str = "madam";
                boolean result = isPalindrome(str);
                System.out.println(str + " IsPalindrome = " + result);


            }

            private static boolean isPalindrome(String str) {

                if (str == null) {
                    return false;
                }
                if (str.length() <= 1) {
                    return true;
                }
                String first = str.substring(0, 1);
                String last = str.substring(str.length() - 1, str.length());
                if (!first.equals(last)) {
                    return false;

                } else {
                    return isPalindrome(str.substring(1, str.length() - 1));
                }


                class Permutation {

                    public static void main(String[] args) {

                        /*
                         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
                         * Write Java program to compute all Permutation of a String
                         * */

                        String s = "ABC";
                        int n = s.length();
                        Permutation permutation = new Permutation();
                        permutation.calculate(s, 0, n - 1);


                    }

                    private void calculate(String str, int left, int right) {
                        if (left == right) {
                            System.out.println(str);
                        } else {
                            for (int i = left; i <= right; i++) {
                                String swapped = this.swap(str, left, i);
                                this.calculate(swapped, left + 1, right);
                            }
                        }
                    }

                    private String swap(String str, int i, int j) {
                        char temp;
                        char[] charArray = str.toCharArray();
                        temp = charArray[i];
                        charArray[i] = charArray[i];
                        charArray[j] = temp;
                        return String.valueOf(charArray);

                    }

                }
            }