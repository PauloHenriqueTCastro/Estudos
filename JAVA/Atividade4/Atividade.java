public class Atividade {
    public static void main(String[] args) {
        printCarValue(30000);
    }

    public static void printCarValue(double carValue) {
        double parcelConditional = 1000;
        for (int parcel = 1; parcel < carValue; parcel++) {
            double parcelValue = carValue / parcel;
            if (parcelValue < parcelConditional) {
                break;
            }
            System.out.println("Quantidade de Parcelas = " + parcel + ", Valor da parcela: " + parcelValue);
        }
    }
}
