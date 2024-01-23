import java.io.File;
import java.io.IOException;

public class Ex08GetFolderSize {
    public static void main(String[] args) throws IOException {
        String userDir = System.getProperty("user.dir");
        String folderPath = userDir + "\\Streams_Files_Directories\\Resources\\Exercises Resources";
        File myFolder = new File(folderPath);

        //if you use the function to find the folder size, the result will be different than
        //summing all files' sizes in the folder
//        System.out.println(myFolder.length());
//        System.out.println(Files.size(Path.of(folderPath)));

        File[] files = myFolder.listFiles();

        long size = 0;
        if (files != null){
            for (File currentFile : files) {
                size += currentFile.length();
            }
        }

        System.out.println("Folder size: " + size);
    }
}
