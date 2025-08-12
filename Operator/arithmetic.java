// package DsaWithSir.Operator;

public class arithmetic {
     // sum of even square number 
     public static long sumOfEvenNatural(int n){
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }
     // sum of even n number 
    public static int sumOfEven(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            if(i%2==1) continue;
            sum += i; 
        } return sum;
    }

    public static void main(String[] args) {
        // // Q24
        // System.out.println(0.0/0); // -infinity

        // Q20
        // int x = 100/10*2%3;
        // System.out.println(x);//2

        // Q19
        // int x = 1 + 2 / 3 * 4;

        // System.out.println(x); //1
        
        
       
        
        // int n = 5;
        // System.out.println(sumOfEvenNatural(n));
        
        // int n = 10;
        // System.out.println(sumOfEven(n));

        // Q10
        // int n = 123;
        // int sum = ( (n/100) + (n/10)%10 + (n)%10 );
        // System.out.println(sum);
    }
    
}
