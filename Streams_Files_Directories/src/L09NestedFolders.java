import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class L09NestedFolders {
    public static void main(String[] args) {
        File file = new File("C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources");

        File[] filesList = file.listFiles();

//        System.out.println(file.list());

        String[] filesStringArray = file.list();

//        Arrays.stream(filesStringArray).forEach(System.out::println);

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
