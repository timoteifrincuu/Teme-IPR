

//Testing David Batkay's solution

// import java.util.HashSet;
// import java.util.Scanner;

// public class DavidSolution {
    
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         String str = input.nextLine();
//         str = str.toLowerCase();
//         System.out.println(containsAllVowels(str));
//         input.close();
//     }

//     public static boolean containsAllVowels(String str){
//         HashSet<Character> hSet = new HashSet<Character>();
//         hSet.add("a");
//         hSet.add("e");
//         hSet.add("o");
//         hSet.add("i");
//         hSet.add("u");
//         for(char ch : str.toCharArray()){
//             if(hSet.contains(ch)){
//                 hSet.remove(ch);
//             }
//         }
//         return hSet.isEmpty(); 
//     }
// }
