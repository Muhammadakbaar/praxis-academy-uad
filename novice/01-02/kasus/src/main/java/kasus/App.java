/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

public class App {

    private static UserAnggota user = new UserAnggota(null, null, null, null);
    public static void main(String[] args) {
        
        Buku buku = new Buku("PJ01", "Belajar Java asik dan menyenangkan bersama apip", "apip");
        Buku buku1 = new Buku("PJ02", "Java for dummies", "dumb and dumber");
        System.out.println(buku.getJudulBuku());
        System.out.println(buku1.getJudulBuku());
        buku1.setJudulBuku("Java in a nutshell");
        System.out.println(buku1.getJudulBuku());

        System.out.println(user.getUsername());
        user.setUsername("akbarlaz");
        System.out.println(user.getUsername());
        user.pinjam();
    }
}