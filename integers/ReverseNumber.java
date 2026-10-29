// Reverse integer program
class ReverseNumber{
    public static void main(String[]args)
    {
        int number=456789;

        int reverse=0;
        
        for(int i=number;i!=0;i=i/10){
            int last=i%10;
            reverse=reverse*10+last;
        }
        System.out.println(reverse);
    }
}
