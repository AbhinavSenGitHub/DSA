package Searching;
import java.util.Arrays;
public class LinearSearch_Str {
    public static void main(String[] args) {
        String name = "Abhinav";
        char target = 'n';
        System.out.println(search(name, target));



        // name.toCharArray()  {convert String name into Char Array}
        System.out.println(Arrays.toString(name.toCharArray()));
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }




    static boolean search(String name, char target){
        if (name.length() == 0) {
            System.out.println("length zero");
            return false;
        }
//        for (int i = 0; i < name.length(); i++) {
//            if (target == name.charAt(i)) return true;
//        }

//        foreach
        for(char ch: name.toCharArray()){        // name.toCharArray()  {convert String name into Char Array}
            if(ch == target) return true;
        }
        return false;
    }
}
