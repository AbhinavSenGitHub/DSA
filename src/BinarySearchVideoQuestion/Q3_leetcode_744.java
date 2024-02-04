package BinarySearchVideoQuestion;

public class Q3_leetcode_744 {
    public static void main(String[] args) {
        char[] ch = {'c','f','j'};
        char target = 'a';
        System.out.println(nextGreatestLetter(ch, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        int add = end + (start-end);
        return letters[add % letters.length];
    }
}
