import java.util.HashSet;

public class Main{
    
    public static boolean containsAllVowels(HashSet<String> str) {
        
        //keep in mind that Java is case-sensitive, meaning that if you have  mig letter vowels, they wont be recognized unnless you implement toLowerCase() function
        if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u")){  
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        HashSet<String> input = new HashSet<String>();
        input.add("The");
        input.add("quick");
        input.add("brown");
        input.add("fox");
        input.add("jumps");
        input.add("over");
        input.add("the");
        input.add("lazy");
        input.add("dog");
        //System.out.println(input);

        boolean result =  containsAllVowels(input);
        System.out.println(result);
    }

}