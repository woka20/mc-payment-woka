import java.util.ArrayList;

public class LengthString {
    public static ArrayList<String> lengthStringMethod(String[] ars, int Len){
    ArrayList<String> newList= new ArrayList<String>();
    for(int i=0; i<ars.length; i++ ){
        if (ars[i].length()==Len){
            newList.add(ars[i]);

        }

    }
    return newList;
}
    
// Running The Program Here
public static void main(String[] args){
    String a[]={"era","kaya", "nomad", "moving"};
    System.out.println("List of Word : "+ lengthStringMethod(a, 4));
}
}

