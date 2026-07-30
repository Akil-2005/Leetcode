/**
 * Container_With_Most_Water_11
 */
public class Container_With_Most_Water_11 {
    public int akil(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int maxx=0;
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int width=right-left;
            int area=height*width;
            maxx=Math.max(maxx,area);
            if(arr[left]<=arr[right]) left++;
            else right--;
        }
        return maxx;
    }
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        Container_With_Most_Water_11 sol=new Container_With_Most_Water_11();
        int a=sol.akil(arr);
        System.out.print(a);
    }
}