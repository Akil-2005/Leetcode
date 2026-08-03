class move_zeros_283{
    public static int[] akil(int[] arr){
        int n=arr.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,3,12};
        int[] res=akil(arr);
        for(int i:res){
            System.out.print(i+",");
        }
    }
}