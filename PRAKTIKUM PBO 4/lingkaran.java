class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        this.jari = 0;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return this.jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari : " + getJari());
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
    }
}