//Narrowing

class Fifth
{
	public static void main(String[] args)
	{
		int i = (short) 4.55d;
		System.out.println("\ndouble (4.55) to short to int: "+i);

		i = (int)(short)(int)(float)(long)5.88d;
		System.out.println("\ndouble (4.55) to long to float to int to short to int: "+i);

	}	
}