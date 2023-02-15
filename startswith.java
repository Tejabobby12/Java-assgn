public class StartsWith  
{    
public static void main(String args[])  
{    
String s1="java string split method ";    
System.out.println(s1.startsWith("ja"));  // true  
System.out.println(s1.startsWith("java string"));   // true  
System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different   
}  
}    