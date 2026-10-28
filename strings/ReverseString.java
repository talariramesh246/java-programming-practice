class ReverseString{
    public static void main(String[]args){

        // ****1.Methond - using String class****
        //Strings are immutable in nature
        String course="Selenium";
        
        int length=course.length();
        
        String reverse="";
        
        for(int i=length-1;i>=0;i--){
            char ch=course.charAt(i);
            reverse=reverse+ch;
        }
        
        System.out.println(course+" : "+reverse);


        //****2. Using String Buffer class**** 
        //String buffer class is mutable in nature
        // String buffer has inbuilt method - reverse() 
        String name="API Testing";
        StringBuffer sb=new StringBuffer(name);
        sb.reverse();
        System.out.println(sb);
    }
}
