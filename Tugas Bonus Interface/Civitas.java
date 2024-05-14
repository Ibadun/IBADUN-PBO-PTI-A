package bonus;

public class Civitas {
    protected String nama;
    protected int umur;
    protected boolean jenisKelamin;

    public void makanDiKantin(String kantin) {
        System.out.println(nama + " makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(nama + " main di game corner");
    }

    public void naikLift() {
        System.out.println(nama + " naik lift");
    }
}
