import java.util.Random;

public class StartArray {
    private final int size;
    private int[] array;
    private int count = 0;
    
    //Create an array
    public StartArray(int size){
        this.size = size;                           //makes array size global
        array = new int[size];                      //instantiates array size
    }//end of constructor
    
    //Fill with random numbers
    public int[] randomize(int number){
    Random rnd = new Random();
        for (int i=0; i<400; i++){
            array[i]=rnd.nextInt(number)+1;
        }return array;
    }//end of method randomize
    
    public int[] sort (int[] smallA){
        this.array=smallA;
        int in, out, temp;      //parsing through -> out to temp, temp to in
        for(out=1; out<array.length; out++){        //starts @1 until length
            temp = array[out];                      //temp = 1st comparable val
            in = out;                               //1st comparable element
            while(in>0 && array[in-1]>temp){
                array[in] = array[in-1];            //out of order, replace
                --in;                               //decrement down the list
            }//end while loop
            array[in]=temp;
        }//end for loop
        return array;                               //spits out a usable array
    }//end method sort
    
    //Print the array
    public String printList(int[] smallA){
        this.array=smallA;
        String temp = "[";                       //returns a string for the array
        System.out.println("");
        for (int i=0; i < array.length; i++){   //walks through all elements
            if(array[i]!=0){
                temp += (array[i]);                 //saving element values
                if(i < array.length-1)              //no comma/space for the last #
                    temp += ", ";
                if(i%10==9)                         //for good readable spacing
                    temp += "\n";}
            else{
//                array[array.length-i]=array[i];
            }
        }//end of for loop
        return temp + "]";                           //virtual printing of the array
    }//end of method printList
    
    public int search(int criterion){
        for(int i=0; i<array.length;i++){
            if(array[i]==criterion){
                criterion=i;
            }else
                criterion=-1;
        }//end of for loop
        return criterion;
    }//end of method search
}
