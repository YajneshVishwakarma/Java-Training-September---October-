package Java_23_08_2022;//Widening

class Fourth
{
	public static void main(String[] args)
	{
		double num1 = (double) 10;
		float num2 = 30;
		System.out.println("\nint to double: "+num1+"\nint to float: "+num2);

		int num3 = (int)'a';
		System.out.println("\nchar 'a' to int: "+num3);

	}
}