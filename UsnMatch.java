import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class UsnMatch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter USN:");
            Pattern pattern = Pattern.compile("[1-4][A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("Valid USN: "+matcher.group());
                found = true;
            }
            if(!found){
                System.out.println("Invalid USN.");
            }
        }
    }
}