public class GetChars{  
public static void main(String args[]){  
 String str = new String("hello  how r u");  
      char[] ch = new char[10];  
      try{  
         str.getChars(6, 8, ch, 0);  
         System.out.println(ch);  
      }catch(Exception ex){System.out.println(ex);}  
}}  