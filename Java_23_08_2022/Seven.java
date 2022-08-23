package Java_23_08_2022;

class Seven
{
	public static void main(String[] args)
	{
		int a = 10, c = 5;
		a += 30;
		
		System.out.println(a);

		int b = 45;
		b += 40;

		System.out.println(b);

		a += b -= a *= a %= 10;
		System.out.println(a);

		a = 10;
		b = 20;
		
//		a += b -= c *= a %= b /= 10;
		
		a -= += c*= c /= a += 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}