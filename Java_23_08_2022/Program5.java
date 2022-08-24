//Narrowing

class Program5
{
	public static void main(String[] args)
	{
		int i = (short) 4.55d;
		System.out.println("\ndouble (4.55) to short to int: "+i);

		i = (int)(short)(int)(float)(long)5.88d;
		System.out.println("\ndouble (4.55) to long to float to int to short to int: "+i);
	
		i = (int) 1234567890123l;
		System.out.println("\nlong (1234567890123) to int: "+i);

		byte b = (byte) 130;
		System.out.println("\nint (130) to byte: "+b);


	}	
}
