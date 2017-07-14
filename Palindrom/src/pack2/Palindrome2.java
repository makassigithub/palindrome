package pack2;

public class Palindrome2 {
	
	
 static boolean isPalindrome(String word){
	 if(word.length()==0 || word==null){
		 return false;
	 }
	 return word.equals(new StringBuilder(word).reverse().toString());
 }
 
 public static void main(String ...args){
	 System.out.println(isPalindrome("ama"));//true
	 System.out.println(isPalindrome("mama"));//false
	 System.out.println(isPalindrome(""));//false
 }
}
