import java.net.Inet4Address;
import java.sql.SQLOutput;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        int [] nums ={3, 1, 4, 1, 5};
        int result=findPairs(nums,2);
        System.out.println(result);
    }
    static public int findPairs(int[] nums, int k) {
        int length=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<Integer, Integer>();
        int m=0;
        for(int i =0;i<length-1;i++){
            for(int j=i+1;j<length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    int first=Math.min(nums[i],nums[j]);
                    int second=Math.max(nums[i],nums[j]);
                    if(hm.containsKey(first)){
                        if(hm.get(first)!=second){
                            hm.put(first,second);
                        }
                    }
                    else{
                        hm.put(first,second);
                    }
                }
            }
        }
        return hm.size();
    }
}
