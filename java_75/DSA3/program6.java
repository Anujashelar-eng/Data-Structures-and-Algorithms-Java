package DSA3;
//Duck number or not
class program6{
    public static void main(String[] args){
       int num=123;
       int temp=num;
       boolean flag=false;
       while(temp!=0){
        int digit=temp%10;
        if(digit==0){
          flag=true;
          break;
        }

        temp=temp/10;
       }


       if(flag){
        System.out.println(num+" is a Duck number");
       }else{
        System.out.println("Not a Duck number");
       }

    }
}
