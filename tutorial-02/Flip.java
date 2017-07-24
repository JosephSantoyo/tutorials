/** basic biased coin flip */

import java.util.Random;

public class Flip{
 
 public static void main(String[] args){
  double bias = 0.5;  // 50% heads, 50% tails
  int flips = 100;
  boolean ok = true;
  if(args.length > 1){
   try{
    bias = Double.parseDouble(args[0]);
    // number of coin flips
    flips = Integer.parseInt(args[1]);
   }catch(Exception e){
    System.out.println("command line arguments must be: number, integer");
    ok = false;
   }
  }
  if(ok){ 
   System.out.print("bias is " + bias);
   
   Random r = new Random();
   
   int num_heads = 0;
   int num_tails = 0;
   for (int i = 0; i < flips; i++) {
     if (r.nextDouble() < bias) { 
       num_heads++;
     } else {
       num_tails++;
     }
   }
 
   System.out.print(", " + num_heads + " heads, " + num_tails + " tails.\n");
  }
 }
}

