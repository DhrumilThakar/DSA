import java.util.*;

public class pattern{

    public static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n){
        for(int i=0;i<=n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   
    public static void printPattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
    public static void printPattern5(int n){
        for(int i =0;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void printPattern6(int n){

        for(int i=0;i<n;i++){

           for(int j=1;j<n-i+1;j++)
           {
            System.out.print(j+" ");
           }
            System.out.println();
        }
    }

public static void printPattern7(int n) {

    for(int i=1;i<=n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k =0;k<2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void printPattern8(int n) {

    for(int i=n;i>=1;i--){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k =0;k<2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    
public static void printPattern9(int n){
    // printPattern7(n);
    // printPattern8(n);

    for(int i=1;i<=n;i++){
        for(int j =0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n;i>=1;i--){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int k =0;k<2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void  printPattern10(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
        printPattern10(5);
    }
}