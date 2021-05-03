
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class CharacterCount {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        try (FileReader fr = new FileReader("C:\\Day3\\Session 03 JUPAI3 File handling and data extraction\\02_File IO\\temp\\test.txt");
             BufferedReader br = new BufferedReader(fr);) {
            String sCurrentLine;

            int count=0;
            while ((sCurrentLine=br.readLine())!= null) {
                for(int i=0;i<sCurrentLine.length();i++)
                {
                   if(sCurrentLine.charAt(i)==w.charAt(0)){


                        count+=1;
                    }
                }

                
            }
            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

