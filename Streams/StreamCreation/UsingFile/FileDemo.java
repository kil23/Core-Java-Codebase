/*
- The forEach() method of Stream is another example of a terminal operation (along with count()).
  It does not produce another stream; rather it takes each item flowing by in the stream and consumes it (with a Consumer).
  It doesn’t produce anything (i.e., forEach() is void), so whatever you want to do with the data you’re processing with
  forEach() must happen in the Consumer you pass to it.
-
*/

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.file.*;

class DVDInfo{
  String title;
  String genre;
  String leadActor;

  DVDInfo(String title, String genre, String leadActor){
    this.title = title;
    this.genre = genre;
    this.leadActor = leadActor;
  }

  public String toString(){
    return title + " / "+ genre +" / "+ leadActor;
  }
}

class FileDemo{
  public static void main(String[] args) {
      List<DVDInfo> dvds = loadDVDs("dvdinfo.txt");
      dvds.forEach(System.out::println);
  }

  public static List<DVDInfo> loadDVDs(String fileName){
    List<DVDInfo> dvds = new ArrayList<>();
    try(Stream<String> stream = Files.lines(Paths.get(fileName))){ // Files is used to read data from a file
      stream.forEach(line -> { // use forEach to display each line
        String[] dvdItems = line.split("/");
        DVDInfo dvd = new DVDInfo(dvdItems[0], dvdItems[1], dvdItems[2]);
        dvds.add(dvd);
      });
    }catch(IOException e){
      System.out.println("Error reading DVDs");
      e.printStackTrace();
    }
    return dvds;
  }
}
