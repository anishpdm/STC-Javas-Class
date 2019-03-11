public class Biggest{

    public static void main(String[] args) {
        int a=100,b=21,c;

        c=FindBiggest(a,b);
        System.out.println(c);


    }

    public static int FindBiggest(int x,int y)
    {
        if(x>y)
        {
            return x;
        }
        else{
            return y;
        }


    }

}