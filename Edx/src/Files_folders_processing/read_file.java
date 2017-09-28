package Files_folders_processing;

//  Created by Bogdan Trif on 13-07-2017 , 11:16 PM.


import java.io.*;

public class read_file {

    private static void readFile1(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);

        //Construct BufferedReader from InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    private static void readFile2(File fin) throws IOException {
// Construct BufferedReader from FileReader
        BufferedReader br = new BufferedReader(new FileReader(fin));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        //use . to get current directory
        File dir = new File(".");
        File fin = new File(dir.getCanonicalPath() + "/src/Files_folders_processing/sudoku.txt");
//        File fin = new File("D:/Google Drive/COMPUTING & PROGRAMMING/JAVA/Edx/src/Files_folders_processing/sudoku.txt");

        readFile1(fin);

//        readFile2(fin);
        System.out.println(fin);
//        D:\Google Drive\COMPUTING & PROGRAMMING\JAVA\Edx\src\Files_folders_processing\sudoku.txt
    }

}
