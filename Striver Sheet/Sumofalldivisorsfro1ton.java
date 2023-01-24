public class Sumofalldivisorsfro1ton{
    public static void printDivisor(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
                sum = sum+i;
            }
        }
        System.out.println();

        System.out.println("The sum is "+sum);
    }

    public static void printDivisor2(int num){
        int sum2=0;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    sum2 = sum2+j;
                }
            }
        }
        System.out.println("The sum is "+sum2);
    }

    public static void printDivisor3(int num){
        int sum3=0;
        int i=1;
        while(i<=num){
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    sum3 = sum3+j;
                }
            }
            i++;
        }
        System.out.println("The sum is "+ sum3);
    }

    public static void printDivisor4(int num){
        int sum=0;
        for(int i=1; i<=num; i++){
            sum = sum+(num/i)*i;
        }
        System.out.println("The sum is: "+sum);
    }

    public static void main(String[] args){
        printDivisor(4);
        printDivisor2(4);
        printDivisor3(4);
        printDivisor4(4);
    }
}