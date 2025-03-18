class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        this.sisi = 0;
    }

    public Persegi(double sisi, String warna, String border) {
        this.sisi = sisi;
        this.warna = warna;
        this.border = border;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }
}