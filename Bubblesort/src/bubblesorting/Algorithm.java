
 package bubblesorting;
import java.util.Scanner;

public class Algorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
 *
 * @author Tomee
 */

    /**
     * @param args the command line arguments
     */
 
        Scanner input = new Scanner(System.in);
        //Determine the length of the array
        System.out.println("HOW MANY NUMBERS DO YOU WANT TO SORT? ");
        int x = input.nextInt();
        int []arr= new int [x];
        //fill up array
        for(int i=0;i<arr.length;i++){
            System.out.println("INPUT NUMBER "+(i+1)+": ");
            arr[i]=input.nextInt();
        }
       
        //display values
        System.out.println("The unsorted numbers are ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\b\b.");
        int end;
        int cycle =1;
        //perform bubblesorting
        do{
            end =1;
        //perform a cycle of bubblesorting
        for(int i=0;i<arr.length;i++){
            if(i==arr.length - 1){
                break;
            }
            if (arr[i]>arr[i+1]){
               int y=arr[i];
               arr[i]= arr[i+1];
               arr[i+1]=y;
                                }
                                     }
            
        
        
            
         for(int i=0;i<arr.length;i++){
             if(i==arr.length - 1){
                break;}
             if(arr[i]>arr[i+1]){
                 end =0;
                 cycle++;
                break; 
             }   
            } 
       
          }while(end ==0);//end if fully sorted
       //display sorted values
        System.out.println("The sorted numbers are ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\b\b.");
        System.out.println("The number of times(execution times) sorting was performed is " + cycle);
    }
    
}
}
