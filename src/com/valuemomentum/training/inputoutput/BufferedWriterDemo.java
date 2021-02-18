package com.valuemomentum.training.inputoutput;

import java.io.*;

public class BufferedWriterDemo{ 

public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
FileWriter writer = new FileWriter("c:/demo/file1.txt",true); 
BufferedWriter bwr=new BufferedWriter(writer);
//creating writer object in append-true 
bwr.write("james");
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 }


}

