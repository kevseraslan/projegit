public class TestFıleClass {
    public static void main(String[] args) {
        java.io.File dosya =new java.io.File("deneme.txt");
        System.out.println("dosya var mı ?" +dosya.exists());
        System.out.println("dosyanın uzunluğu " +dosya.length()+" bytes");
        System.out.println("dosya okunabilir mi ?" +dosya.canRead());
        System.out.println("dosya yazılabilir mi?" +dosya.canWrite());
        System.out.println("dosya bir dizin mi?"+dosya.isDirectory());
        System.out.println("bir dosya mı "+dosya.isFile());
        System.out.println("mutlak mı?" +dosya.isAbsolute());
        System.out.println("gizli mi?"+dosya.isHidden());
        System.out.println("mutlak yolu"+dosya.getAbsolutePath());
        System.out.println("değişiklik tarihi" +new java.util.Date(dosya.lastModified()));
    }
}
