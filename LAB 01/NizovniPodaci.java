public class NizovniPodaci {
    private char[] nizSlova;
    private int[][] tablizaMnozenja = new int[11][11];

    public void setSlova(char[] s) {
        nizSlova = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            nizSlova[i] = s[i];
        }
    }

    public NizovniPodaci() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                tablizaMnozenja[i][j] = i * j;
            }
        }
    }

    public void prikaziTablicuMnozenja() {
        for (int i = 0; i < tablizaMnozenja.length; i++) {
            for (int j = 0; j < tablizaMnozenja[i].length; j++) {
                System.out.print(tablizaMnozenja[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void prikaziSlova() {
        for (int i = 0; i < nizSlova.length; i++) {
            System.out.println(nizSlova[i]);
        }
    }

    public static void main(String[] args) {
        NizovniPodaci np = new NizovniPodaci();
        np.prikaziTablicuMnozenja();
        char[] vanja = {'V', 'a', 'n', 'j', 'a'};
        np.setSlova(vanja);
        np.prikaziSlova();
    }
}