public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(removeVowels("Alfredo"));
    }

    public static String removeVowels(String s){
        s = s.replaceAll("[aeiouAEIOU]", ""); 
        return s; 
    }
}

