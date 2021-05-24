import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream; 

public class DivideArr {
    public static List<Integer> DivideList( int[] ars, int x) {
        List<Integer> removal=new ArrayList<Integer>(); 
        float division;
        List<Integer> temp=IntStream.of(ars).boxed().collect(Collectors.toList());
        for (int i=0; i< temp.size(); i++){
          for(int j=0; j<temp.size(); j++){
            try {
                division=temp.get(i)/temp.get(j);
            }
            catch (ArithmeticException e) {
                division=0;
            };
            if (division ==x ){
                removal.add(temp.get(i));

            }
          }
        };
        temp.removeAll(removal);
        return temp;
      }
    



public static void main(String[]args){  
    int a[]={1,0,5,6,3,2,6};  
   
    System.out.println("Divide List:"+DivideList(a, 6));  
    }}
