public class AdvancedPatterns{
public static void main(String[] args) {
        System.out.println("1.BUTTERFLY PATTERN");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <=spaces; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
                int spaces=2*(n-i);
                for(int j=1; j<=spaces;j++)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++)
                {
                    System.out.print(" *");
                }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

        System.out.println("2.SOLID RHOMBUS");
        int n1 = 5;
        for (int i = 1; i <= n1; i++) {
            int spaces = n1- i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

        System.out.println("3.NUMBER PYRAMID");
        int n2=6;
        for(int i=1 ; i<=n2 ;i++)
        {
            int spaces = n2-i;
            for(int j=1 ; j<=spaces ; j++)
            {
                System.out.print(" ");
            }
            for(int j=1 ;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

        System.out.println("4.PALINDROMIC PATTERN");
        int n3=5;
        for(int i=1 ;i<=n3 ;i++)
        {
            for(int j=1 ;j<=n3-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for(int j=2 ;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");

        System.out.println("5.DIAMOND PATTERN");
        int n4=4;
        for(int i =1; i<=n4 ; i++)
        {
            for(int j=1 ;j<=n4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i =n4; i>=1 ; i--)
        {
            for(int j=1 ;j<=n4-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");
        System.out.println("6.HOLLOW BUTTERFLY PATTERN");
        int n5 = 4;
        int m1 = 5;
        for (int i = 1; i < n5; i++) {
            for (int j = 1; j <= m1; j++) {
                if (j == 1 || j == m1|| (i != n  && (j == i || j == m1- i + 1))) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n5; i >= 1; i--) {
            for (int j = 1; j <= m1; j++) {
                if (j == 1 || j == m1 || (i != n  && (j == i || j == m1 - i + 1))) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("<------------------------------------------------>");
        System.out.println("7.HOLLOW RHOMBUS");
            int n6 = 5;
            for (int i = 1; i <= n6; i++) {
                for (int j = 1; j <= n6 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n6; j++) {
                    if (i == 1 || i == n1 || j == 1 || j == n6) {
                        System.out.print("*" + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("<------------------------------------------------>");

            System.out.println("8.PASCAL'S TRIANGLE");

            int n7=5;
            for(int i=1 ;i<=n7;i++)

            {
                for(int j=1;j<=n7-i;j++)
                {
                    System.out.print(" ");
                }
                int num=1;
                for(int j=1 ; j<=i ; j++)

                {
                    System.out.print(num +" ");
                    num=num*(i-j)/j;
                }
                    System.out.println();
            }
            System.out.println("<------------------------------------------------>");
            System.out.println("9.HALF PYRAMID (STAR)");
            int n8=5;
            for(int i=1 ;i<=n8 ;i++)
            {
                for(int j=1 ;j<=n8-i;j++)
                {
                    System.out.print("");
                }
                for(int j=1 ; j<=i+1;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            System.out.println("<------------------------------------------------>");
            System.out.println("10.INVERTED NUMBER PYRAMID");
            int n9=5;
            for(int i=1 ; i<=n ;i++)
            {
                for(int j=1 ;j<=n9-i;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            }
        }
        
