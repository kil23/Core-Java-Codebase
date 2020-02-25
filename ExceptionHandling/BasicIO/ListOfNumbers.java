import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(10);
        for (int i = 1; i <= 10; i++) {
            list.add(new Integer(i-1));
        }
    }

    public void writeList() throws IOException {
    
        try{
            PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
            System.out.println("Inside try");
            
            for (int i = 1; i <= 10; i++) {
           
                out.println("Value at: " + i + " = " + list.get(i));
                throw new IOException();
            }
            out.close();
        }
        catch(IOException e){
        System.out.println("IOException occured");
        }
    }

    public static void main(String[] args) throws IOException{
        ListOfNumbers l = new ListOfNumbers();
        l.writeList();
    }
}