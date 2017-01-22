/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package problemone;
import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Tiffany
 */
public class ProblemOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file1 = new File("input-1.txt");
        File file2 = new File("output-1.txt");
        //Write your information to the file
        try {
            PrintWriter output = new PrintWriter(file1);
            
            output.append("P2\n" + "1010\n" + "9\n");
            output.println("1357913579\n" + "2468246824\n" + "3579135795\n" + "4682468246\n" + "5791357913\n" + "6824682468\n" + "7913579135\n"
             + "8246824682\n" + "9135791357\n" + "0246824682\n");
            output.close();
          
        } catch (IOException ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
        
        try {
            PrintWriter output2 = new PrintWriter(file2);
            
            output2.println();
            output2.close();
          
        } catch (IOException fx) {
            System.out.printf("ERROR: %s\n", fx);
        }
       
        //Read from the file
        try{
            Scanner input = new Scanner(file1);
            String nums1, nums2, nums3, nums4, nums5, nums6, nums7, nums8, nums9, nums10, nums11, nums12, nums13;
            nums1 = input.next();
            nums2 = input.next();
            nums3 = input.next();
            nums4 = input.next();
            nums5 = input.next();
            nums6 = input.next();
            nums7 = input.next();
            nums8 = input.next();
            nums9 = input.next();
            nums10 = input.next();
            nums11 = input.next();
            nums12 = input.next();
            nums13 = input.next();
            System.out.println(nums1 + "\n" + nums2 + "\n" + nums3 + "\n" + nums4 + "\n" + nums5 + "\n" + nums6 + "\n" 
                    + nums7 + "\n" + nums8 + "\n" + nums9 + "\n" 
                    + nums10 + "\n" + nums11 + "\n" + nums12 + "\n" + nums13);
        } catch (FileNotFoundException ex) {
            System.out.printf("ERROR: %s\n",ex);
        }
        
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("input-1.txt");
            fw = new FileWriter("output-1.txt");
            int c = fr.read();
            while(c!=-1) {
                fw.write(c);
                c = fr.read();
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            close(fr);
            close(fw);
        }
    }
    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch(IOException e) {
            //...
        }
    
    }
    
}
