package Jar;

public class Main {
    public static void main(String[] args) {
        Jar<Pickle> jar = new Jar<Pickle>();

        jar.add(new Pickle());
        jar.add(new Pickle());

        System.out.println(jar.remove());
    }
}
