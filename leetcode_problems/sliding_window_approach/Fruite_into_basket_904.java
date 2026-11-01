import java.util.*;

public class Fruite_into_basket_904 {

    
   
// Bruite froce approach on2
   /* public static int akil(int[] arr){
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            int count=0;
            for(int j=i;j<n;j++){
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
                if(map.size()>2) break;
                count++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }*/

    public static int akil(int[] arr){
        int n=arr.length;
        int ans=0;
        int left=0;
        int right=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(right=0;right<n;right++){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1 );
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,2,2};
        int res=akil(arr);
        System.out.print(res);
    }
}

