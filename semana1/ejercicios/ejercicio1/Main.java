
public class Main {
    public static void main(String[] args) {
        
        // Figura 1
        System.out.println("Figura 1");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        
        // Figura 2
       System.out.println("Figura 2");
        for (int i = 1; i <= 4; i++) {
            if ( i % 2 == 0 ) {
                System.out.print(" ");
                
            }
            System.out.print("* ".repeat(6));
            System.out.println();
        }

        // Figura 3
         System.out.println("Figura 3");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Figura 4
         System.out.println("Figura 4"); 
        for (int i = 1; i <= 9; i++) {
            if ( i < 5 ) {
                System.out.print("* ".repeat(i));
            } else {
                System.out.print("* ".repeat( 10 - i));
            }
            System.out.println();
        }
}
}  