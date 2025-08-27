public class App {
    public static void main(String[] args) {
        ArraySimple vector = new ArraySimple();

        for (int i = 0; i < 10; i++) {
            int matricula = (int) (Math.random() * 5187000) + 4581;
            int darsena =(int) (Math.random() * 20) + 1;
            String nom = "Capitan Barco " + matricula;
            double carga = (Math.random() * 50000) + 10000;

            Barco b = new Barco(matricula, darsena, nom, carga);

            System.out.println(b);
            vector.append(b);
        }
    }
}
