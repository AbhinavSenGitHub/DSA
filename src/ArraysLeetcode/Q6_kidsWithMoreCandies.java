package ArraysLeetcode;
import java.util.ArrayList;
import java.util.List;
public class Q6_kidsWithMoreCandies {
    public static void main(String[] args) {
        int[]  arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        int max = -1;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(candies[i], max);
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            list.add(candies[i] + extraCandies >= max);
        }
        return list;
    }
}
