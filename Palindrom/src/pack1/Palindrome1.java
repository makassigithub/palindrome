package pack1;

public class Palindrome1 {

	//Test the push to the remote
	public static void main(String[] args) {
		
		Palindrome1 pd = new Palindrome1();
		System.out.println(pd.isPalindrome("mama"));

	}

	
	boolean isPalindrome(String theWord){
		
		char [] rightToLeft = theWord.toCharArray();
		StringBuilder leftToRight = new StringBuilder();
		leftToRight.append(theWord);
		leftToRight.reverse();
		
		for (int i = theWord.length()-1; i>=0;){
			
			if (rightToLeft[i] == leftToRight.charAt(i)){
				return true;
			}else{
				return false;
			}
		}
		
		return false;
	}
	

}
