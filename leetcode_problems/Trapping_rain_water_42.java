class Trapping_rain_water_42{
    public int akil(int[] arr){
        int n=arr.length;
        int left=0,right=n-1;
        int left_max=arr[left],right_max=arr[right];
        int water=0;
        while(left<right){
            if(left_max<right_max){
                left++;
                left_max=Math.max(left_max,arr[left]);
                water=water+left_max-arr[left];
            }
            else{
                right--;
                right_max=Math.max(right_max,arr[right]);
                water=water+right_max-arr[right];
            }
        }
        return water;
    }
    public static void main(String[] args){
        int[] arr={0,1,0,2,1,0,1,3,2,1,2,1};
        Trapping_rain_water_42 sol=new Trapping_rain_water_42();
        int a=sol.akil(arr);
        System.out.print(a);
    }
}