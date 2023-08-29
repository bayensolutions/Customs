public class MatematickeOperacije {
    private int operand1, operand2;

    public MatematickeOperacije() {
        operand1 = 1;
        operand2 = 2;
    }

    public MatematickeOperacije(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int proizvod() {
        return operand1 * operand2;
    }

    public float kolicnik() {
        return (float) operand1 / operand2;
    }

    public boolean prviJeVeci() {
        return operand1 > operand2;
    }

    public static int sumaPrvih20CijelihBrojeva() {
        int suma = 0;
        for (int i = 1; i <= 20; i++) {
            suma += i;
        }
        return suma;
    }

    public static int razlikaBrojevaDjeljivihSa3() {
        int razlika = 99, i = 3;
        while (i < 100) {
            razlika -= i;
            i += 3;
        }
        return razlika;
    }

    public static void main(String[] args) {
        MatematickeOperacije mo1 = new MatematickeOperacije();
        MatematickeOperacije mo2 = new MatematickeOperacije(100, 4);

        System.out.println("mo1");
        System.out.println("Proizvod: " + mo1.proizvod());
        System.out.println("Kolicnik: " + mo1.kolicnik());
        System.out.println("Prvi je veci: " + mo1.prviJeVeci());

        System.out.println("mo2");
        System.out.println("Proizvod: " + mo2.proizvod());
        System.out.println("Kolicnik: " + mo2.kolicnik());
        System.out.println("Prvi je veci: " + mo2.prviJeVeci());

        System.out.println("Suma prvih 20 brojeva: " + MatematickeOperacije.sumaPrvih20CijelihBrojeva());
        System.out.println("Razlika brojeva djeljivih sa 3: " + MatematickeOperacije.razlikaBrojevaDjeljivihSa3());
    }
}