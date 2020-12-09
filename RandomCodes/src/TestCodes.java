import  java.util.*;

public class TestCodes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // 1
        int n=2, s=0;
        while(n<9)
        {
            s = s + n;
            n++;
        }
        System.out.println(s);
        System.out.println();

        // 2
        int num = 0;
        while(num < 10)
        {
            num++;
            if (num % 2 == 0)
                continue;
            System.out.print(num + " ");

        } System.out.println();
        System.out.println();

        // 4
        int m = 0;
        while(m < 4)
        {
            System.out.print(m);
            m++;
        }
        System.out.println();
        System.out.println();

        // 6
        int i=1;
        while(i<10)
        {
            i=i+2;
            System.out.println(i);
        }

        i=3;
        while(i<=11)
        {
            System.out.println(i);
            i=i+2;
        }
        System.out.println();

        // 8
        int answer = 0;
        i = 0;
        while( i < 2 )
        {
            int j = 0;
            while (j < 4)
            {
                answer++;
                j++;
            }
            i++;
        }
        System.out.println(answer);
        System.out.println();


        // 9
        int k=0;
        while(k<3)
        {
            System.out.print(k);
            k++;
        }
        System.out.println();
        System.out.println();

        // 10
        i=1;
        while(i<5)
        {
            int dummyVariable = 0;
            i++;
        }
        System.out.print(i);
        System.out.println();

        // 12
        int x = console.nextInt();
        answer = 0;
        while( x > 0 )
        {
            answer += 1;
            x /= 10;
        }
        System.out.println(answer);
        System.out.println();

        // 15
        num = 1;
        while(num < 5)
        {
            if (num == 3)
                break;
            System.out.print("Hello");
            num++;
        }
        System.out.println();

        // 16
        int p = 1;
        do
        {
            p = p + 1;
        }while( p < 5 );
        System.out.println(p);
        System.out.println();

        // 17
        double w = 4.0;
        while(w >= 0)
        {
            w = w - 0.5;
        }
        System.out.print(w);
        System.out.println();

        // 18
        int j=1, tally=0;
        while(j<8)
        {
            tally++;
            j++;
        }
        System.out.print(tally);
        System.out.println();


    }
}
