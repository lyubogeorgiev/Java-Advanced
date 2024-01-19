import java.io.File;

public class L07ListFiles {
    public static void main(String[] args) {
        File file = new File("C:\\WGU" +
                "\\Java-Advanced-1" +
                "\\Streams_Files_Directories" +
                "\\Resources" +
                "\\Files-and-Streams");

        File[] files = file.listFiles();

        if (files != null){
            for (File currentFile : files) {
                if (currentFile.isFile()){

                    System.out.printf("%s: [%d]%n", currentFile.getName(), currentFile.length());
                }
            }
        }

    }

}
