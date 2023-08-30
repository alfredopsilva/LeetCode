public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1 => " + merge("abc","pqr"));
        System.out.println("Test 2 => " + merge("ab","pqrs"));
        System.out.println("Test 3 => " + merge("abcd","pq"));
        System.out.println("Test 4 => " + merge("Alfredo","Carolina"));
    }

    public static String merge(String word1, String word2){
        int word1Length = word1.length();
        int word2Length = word2.length();
        StringBuilder result = new StringBuilder();
        StringBuilder remains;

        if(word1Length <= word2Length)
        {
            for(int i = 0; i < word1Length; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            //Get the remain characters and append to the end of the result.
            remains = new StringBuilder(word2);
            result.append(remains.substring(word1Length, word2Length));
        }
        else
        {
            for(int i = 0; i < word2Length; i++){
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            remains = new StringBuilder(word1);
            result.append(remains.substring(word2Length, word1Length));

        }
        return String.valueOf(result);
    }
}