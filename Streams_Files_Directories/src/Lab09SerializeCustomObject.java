import java.io.*;
import java.nio.file.Path;

public class Lab09SerializeCustomObject {

    public static class Cube implements Serializable {

        public Cube(String color, double width, double height, double depth){
            this.color = color;
            this.width = width;
            this.height = height;
            this.depth = depth;
        }
        String color;
        double width;
        double height;
        double depth;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube myCube = new Cube("white", 15.2, 13.5, 14.1);

        String path = "C:\\WGU\\Java-Advanced-1\\Streams_Files_Directories\\Resources\\serialize.ser";

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(myCube);

        FileInputStream fileInputStream = new FileInputStream(path);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Cube myNewCube = (Cube) objectInputStream.readObject();

        System.out.println(myNewCube.color);
        System.out.println(myNewCube.width);
        System.out.println(myNewCube.height);
        System.out.println(myNewCube.depth);
    }
}
