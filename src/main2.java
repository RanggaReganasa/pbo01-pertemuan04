public class main2 {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        System.out.println("isi gelas ketika penuh : " + penuh + "ml");

        do {
            isiGelas++;
            System.out.println("Sedang mengisi gelas.. ");
            System.out.println("Isi gelas sekarang : " + isiGelas + "ml");
        } while (isiGelas != penuh);

        System.out.println("Finale isi gelas sekarang : " + isiGelas + "ml");
    }
}
