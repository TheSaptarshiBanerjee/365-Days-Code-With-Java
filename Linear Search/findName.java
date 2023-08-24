/**
 * Find Desired Name from the Array
 */
import java.util.*;
public class findName {
    public static int find(String name[], String key)
    {
        for (int i = 0; i < name.length; i++) {
            if (name[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String name[] = {"Saptarshi","Rick","Rintu","Shubhajit"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your desire searching name :");

        String key = sc.nextLine();

        sc.close();
        int index = find(name, key);
        if (index == -1) {
            System.out.println("Not found");
        }else
        {
            System.out.println("Name found at index : "+ index);
        }
        
       
    }
}
