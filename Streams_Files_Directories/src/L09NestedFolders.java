import java.io.File;

public class L09NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources");

        File[] filesList = file.listFiles();

        listDirectories(filesList);

    }

    public static void listDirectories(File[] fileList){

        for (File file : fileList) {
            if (file.isDirectory()){

                System.out.println(file.getName());
                listDirectories(file.listFiles());
            }
        }


    }
}
