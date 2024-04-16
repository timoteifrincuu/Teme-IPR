import java.util.Scanner;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  
        System.out.println("Enter number of entries: ");
        int nr = in.nextInt() ;  

        HashSet<String> hset = new HashSet<>();
        for (int i = 0; i < nr; i++) {

            System.out.println("Enter a pair: ");
            String a =  in.next(); 
            String b =  in.nextLine();
            String pair = a.concat(b);
            hset.add(pair);
            System.out.println(hset.size());
        }
        
    }
  }