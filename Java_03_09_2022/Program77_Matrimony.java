package Java_September_October.src.Java_03_09_2022;

public class Program77_Matrimony {
    public static void ageVerification(int age) throws HavePatienceException
    {
        if (age < 21)
        {
            try {
                throw new HavePatienceException();
            }
            catch(HavePatienceException e)
            {
                System.out.println("Get Mature");
            }
        } else if (age >40) {
            try {
                throw new OutOfServiceException();
            }
            catch(OutOfServiceException e)
            {
                System.out.println("Get Mature");
            }
        }
    }
}
