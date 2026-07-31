class Minimum_Number_of_Pushes_to_Type_Word_II_3016{

    public int akil(String word){
        int [] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        int push=0;
        int count=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0) break;
            int press=(count/8)+1;
            push=push+freq[i]*press;
            count++;
        }
        return push;

    }
    public static void main(String[] args) {
        String word="xyzxyzxyz";
        Minimum_Number_of_Pushes_to_Type_Word_II_3016 sol=new Minimum_Number_of_Pushes_to_Type_Word_II_3016();
        int a=sol.akil(word);
        System.out.print(a);
    }
}