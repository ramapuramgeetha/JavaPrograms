class CountNumber
{
	public static void main (String args[])
	{
		String testString = args[0];
		char alpha = args[1].charAt(0);
		int charCount = 0;
		for (int i=0; i<testString.length() ; i++)
		{
			//System.out.println (testString.charAt(i));
			if (testString.charAt(i) == alpha) charCount++;
		}
		System.out.println ("The number of "+ alpha+" in "+testString+" is: " + charCount);
	}
}
				