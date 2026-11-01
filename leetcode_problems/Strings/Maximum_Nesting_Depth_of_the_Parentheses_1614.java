class Maximum_Nesting_Depth_of_the_Parentheses_1614 {
    public static int akil(String s){
        int n=s.length();
        int curr=0;
        int res=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                curr++;
                res=Math.max(res,curr);
            }
            if(i==')'){
                curr--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int res = akil(s);
        System.out.print(res);
    }
}