import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegexExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();
        System.out.println("Enter the regex pattern:");
        String regex = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean found = false;
        while (matcher.find()) {
            System.out.println("I found the text "+matcher.group()+" starting at index "+
            matcher.start()+" and ending at index "+matcher.end());
            found = true;
        }
        if(!found){
            System.out.println("No match found.");
        }
    }
}