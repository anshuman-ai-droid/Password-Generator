import java.util.*;
public class PasswordGenerator 
{
    // Define character sets
    static String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String DIGITS = "0123456789";
    static final String SPECIAL = "!@#$%^&*()-_=+<>?";
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Inputting the length of the password
        System.out.print("Enter password length : ");
        int length = sc.nextInt();
        String allChars = UPPER + LOWER + DIGITS + SPECIAL+" ";
        String password="";
        for (int i = 0; i < length; i++)
        {
            int index = (int)(Math.random() * allChars.length());
            password = password + allChars.charAt(index);
        }
        //Printing the desired Password
        System.out.println("Generated Password : " + password.toString());
    }
}