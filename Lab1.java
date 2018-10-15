import java.util.Scanner;

public class Lab1 {
	
    Scanner input = new Scanner (System.in);
    public static void main (String [] args) {
    	for (int line = 2; line >= -2; line--) {
    		
    		for(int s = 0; s < 2 - Math.abs(line); s++) {
    			System.out.print(" ");
    		}
    		for(int n = 0; n < 2*Math.abs(line)+1; n++) {
    			System.out.print("*");
    		
    		}
    		
    		System.out.println();
    		}
    	QuestionTwo(2,5);
    	QuestionThree(10,20,30);    	}
    
    public static int QuestionTwo (int first,int second) {
    	
       int i = 0;
       if (first <= second) {
    	   
       i = first;
       while (i< second) {
           if (i<second) {
               System.out.print(i);
               if (i<second) {
                   i++;
                   System.out.print(",");
                }
            }
        }
        System.out.print(i);
      } else if (first>=second) { 
    	  
       i = first;
       for (int g=first; g>=second; g--) {
           if (i > second) {
               System.out.print(i);
               if (i > second) {
                   i--;
                   System.out.print(",");
                }
            }
        }
        System.out.print(i);
     }
     return i;
    }
    
    public static int QuestionThree (int num1,int num2,int num3) {
    	System.out.println();
        int median = 0;
        if (num1 < num2 && num1 > num3 || num1 < num3 && num1 > num2) {
                median = num1;
                System.out.println(median);
            } else if (num2 < num1 && num2 > num3 || num2 < num3 && num2 > num1){
                median = num2;
                System.out.println(median);
            } else if (num3 < num1 && num3 > num2 || num3 < num2 && num3 > num1){
                median = num3;
                System.out.println(median);
            }
        return median;    
    }
}