import java.util.ArrayList;

public class NotBelowZero {
    public static int largest( int[] ars) {
      for (int i =0; i< ars.length; i++){
        for(int j=i+1; j<ars.length; j++){
          if (ars[i]>ars[j]){
            var temp=ars[i];
            ars[i]=ars[j];
            ars[j]=temp;
          }

        }
      };
      return ars[ars.length-1];
    }

    public static ArrayList<Integer> notBelowZeroMethod(int[]ars){
      var listInt= new ArrayList<Integer>();
      var max=largest(ars);
      for(int i=0; i<ars.length; i++){
        if(ars[i]==max){
          listInt.add(ars[i]);

        }
      }
 
      return listInt;
    }


public static void main(String[]args){  
  int a[]={1,2,5,6,3,2,6};  
 
  System.out.println("Not Below Zero From List: "+notBelowZeroMethod(a));  
  }}



