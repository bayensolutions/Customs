public class InicijalizacijaPromjenljivih {

    private static int vrijednost = 7;
    private static int duplaVrijednost = vrijednost * 2;
    private static float kolicnikSaDva = (float) vrijednost / 2;
    private static char znakPodatka = 'A';

    public static void main(String[] args) {
        System.out.println("Vrijednost: " + vrijednost + "\nDupla vrijednost: " + duplaVrijednost + "\nKolicnik sa dva: " + kolicnikSaDva + "\nKarakter: " + znakPodatka);
    }
}