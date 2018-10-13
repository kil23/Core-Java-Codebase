import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
	// The FileWriter constructor throws IOException, which must be caught.
        try{
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
            System.out.println("Inside try");
            
            for (int i = 0; i < SIZE; i++) {
            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
            out.close();
        }
        catch(IOException e){
        System.out.println("Exception");
        }
    }

    public static void main(String[] args) throws IOException{
        ListOfNumbers l = new ListOfNumbers();
        l.writeList();
    }
}