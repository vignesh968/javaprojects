import java.util.Scanner;

public class test{
    private static Object elseif;

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter your password and then hit enter");
        String a=s.nextLine();
        int caps=0;
        int small=0;
        int num=0;
        int sp_char=0;
        if(a.length()<8)
        {
             System.out.println("your password must have atleast 8 character");
        }
        else if(a.length()>=8)
        {
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(0)>='A'&& a.charAt(0)<='Z')
                {
                    caps++;
                }
                else{
                    System.out.println("first character must have upper case");
           
                }
                if(a.charAt(i)>='A'&&a.charAt(i)<='Z')
                {
                    caps++;
                }
                else if(a.charAt(i)>='a'&&a.charAt(i)<='z')
                {
                    small++;
                }
                else if(a.charAt(i)>='0'&&a.charAt(i)<='9')
                {
                    num++;
                }
                else{
                    sp_char++;
                }
            }
            if(small>=1&&caps>=1&&sp_char>=1&&num>=1)
            {
                System.out.println("-----------------good-------------------");
                System.out.println("your password is Strong");
                System.out.println("password accepted");
            }
            else
            {
                System.out.println("check your password it should have 1 small char & 1 big char & 1 number & 1 special char");
            }
        }
    }
}