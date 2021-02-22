import java.io.*;
class STRINGS
{
public static void main(String[]args)
{
String s1=new String("object oriented programming");
String s2=s1.toUpperCase();
System.out.println("upper case string="+s2);
System.out.println("lower case string="+s2.toLowerCase());
System.out.println("replaced character="+s1.replace('e','*'));
System.out.println("remove white spaces="+s1.trim());
if(s1.equals(s2))
System.out.println("s1 and s2 are equal");
else
System.out.println("s1 not equals to s2");
if(s1.compareTo(s2)>0)
System.out.println("s1 is bigger");
else
if(s1.compareTo(s2)<0)
System.out.println("s1 is smaller");
else
if(s1.compareTo(s2)==0)
System.out.println("s1 equals s2");
System.out.println("length of string="+s1.length());
System.out.println("character at 16th position="+s1.charAt(16));
System.out.println("concatenated string="+s1.concat(s1));
System.out.println("substring="+s1.substring(15));
}
}