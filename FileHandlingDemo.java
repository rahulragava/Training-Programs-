import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("-----------------------------------------------------------------------");

        //folder creation
        File file = new File("C:\\Users\\Rahul SK\\OneDrive\\Desktop\\exception handling");
        if(!file.exists()){
            file.mkdir();
        }
        System.out.println("A folder is created!");
        System.out.println("-----------------------------------------------------------------------");

        // file creation and renaming
        File file1 = new File("C:\\Users\\Rahul SK\\OneDrive\\Desktop\\exception handling\\handling.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        System.out.println("A file is created !!");
        File renameFile = new File("C:\\Users\\Rahul SK\\OneDrive\\Desktop\\exception handling\\IO exception handling.txt");
        file1.renameTo(renameFile);
        System.out.println("file is renamed");
        File file2 = new File("C:\\Users\\Rahul SK\\OneDrive\\Desktop\\exception handling\\file handling.txt");
        file2.createNewFile();
        System.out.println("-----------------------------------------------------------------------");

        // file deletion
        file1.delete();
        if(!file1.exists()){
            System.out.println("the file is deleted");
        }
        System.out.println("-----------------------------------------------------------------------");

        //printing the name of the file and its size
        System.out.println("file name is : "+file2.getName());
        System.out.println("size of the file is : "  +file2.length());
        System.out.println("-----------------------------------------------------------------------");

        //printing all the folders and files inside an folder
        File folderList = new File("C:\\Users\\Rahul SK\\OneDrive\\Desktop");
        String[] listOfFilesAndFolders = folderList.list();
        assert listOfFilesAndFolders != null;
        for (String fileName: listOfFilesAndFolders){
            System.out.println(fileName);
        }
        System.out.println("-----------------------------------------------------------------------");

        //writing in a file
        FileWriter fileWriter = new FileWriter(file2);
        fileWriter.write("I can write in this file using file handling !!!");
        fileWriter.flush();
        fileWriter.close();
        System.out.println("-----------------------------------------------------------------------");

        //reading the file
        FileReader fileReader = new FileReader(file2);
        int result = fileReader.read();
        while(result != -1){
            System.out.print((char)result);
            result = fileReader.read();
        }

        //Buffered file writer
        FileWriter fileWriter1 = new FileWriter(file2);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
        bufferedWriter.newLine();
        bufferedWriter.write("writing this file using buffer writer...");
        bufferedWriter.newLine();
        bufferedWriter.write("line starts from new line..");
        bufferedWriter.flush();
        bufferedWriter.close();

        //buffered file writer
        FileReader fileReader1 = new FileReader(file2);
        BufferedReader bufferedReader = new BufferedReader(fileReader1);
        String line = bufferedReader.readLine();
        while(line!=null){
            System.out.println(line);
            line = bufferedReader.readLine();
        }
    }
}
