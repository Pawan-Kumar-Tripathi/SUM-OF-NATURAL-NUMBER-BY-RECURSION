public class RECURSION_PROGRAM_2 
{
    public static void name(int i , int n , int sum)
     {
         if(i==n)
        {
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        name(i+1,n,sum);
    }
    public static void main()
    {
        name(1,5,0);
    }
}
