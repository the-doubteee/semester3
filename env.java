package ankit;

public class env {
    public static void main(String[] args) {
        System.out.println(System.getenv());
        System.out.println(System.getenv("USERNAME"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(java.io.File.separator);
    }
}
