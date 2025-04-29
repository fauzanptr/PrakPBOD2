public class ProgramAnabul {
    public static void main(String[] args) {
        Anabul[] daftarHewan = {
            new Kucing(),
            new Anjing(),
            new Burung()
        };

        for (Anabul hewan : daftarHewan) {
            System.out.println("=== " + hewan.getClass().getSimpleName() + " ===");
            hewan.suara();  
            hewan.gerak();  
            System.out.println();
        }
    }
}
