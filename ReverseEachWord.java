public class ReverseEachWord
{
	static String reverseEachWordOfString(String inputString)
	{
		String[] words = inputString.split(" ");
		
		String reverseString = "";
		
		int ct;
		
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i];
			
			ct = 0;
			
			String reverseWord = "";
			
			
			for (int j = word.length()-1; j >= 0; j--) 
			{
			    if (word.charAt(j) == 't' || word.charAt(j) == 'T')
			       ct++;
			}
			
			if (ct == 1 || ct == 3)
			{
			    for (int j = word.length()-1; j >= 0; j--) 
			    {
				    reverseWord = reverseWord + word.charAt(j);
			    }
			}
			
			reverseString = reverseString + reverseWord + "\n";
		}
		
	    return reverseString;
	}
	
    public static void main(String[] args) 
    {
		String result = reverseEachWordOfString("Indian Institute of Technology");
		System.out.println(result);
	}
}
