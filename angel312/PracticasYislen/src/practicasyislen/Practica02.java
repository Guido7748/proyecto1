package practicasyislen;
//omar sebastian trejo moreno//
//gisela yislen resendiz saldaña//
import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j>0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
                
            }
            System.out.println("");    
            }
            
        }
        
    }

