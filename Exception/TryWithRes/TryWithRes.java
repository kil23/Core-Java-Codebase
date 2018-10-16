import java.io.IOException;
import java.io.File;
import java.io.BufferedReader;

class Resources implements AutoCloseable{
	@Override
	public void close() throws IOException{
		System.out.println("Closing Resources...");
	}
}

class TryWithRes{
	public static void main(String args[]){
		try(Resources r = new Resources()){
			System.out.println("try-with resources");
			if(true){
				throw new IOException();
			}
			if(true){
				return;
			}
			System.out.println("Out of try-with-resources block...");
	
		}catch(Exception e){
			System.out.println("12");
		}
	}
}