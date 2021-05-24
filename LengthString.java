import java.util.ArrayList;

public class LengthString {
    public static ArrayList<String> LengthStringMethod(String[] ars, int Len){
    ArrayList<String> NewList= new ArrayList<String>();
    for(int i=0; i<ars.length; i++ ){
        if (ars[i].length()==Len){
            NewList.add(ars[i]);

        }

    }
    return NewList;
}
    

public static void main(String[] args){
    String a[]={"era","kaya", "nomad", "moving"};
    System.out.println("List of Word : "+ LengthStringMethod(a, 4));
}
}

