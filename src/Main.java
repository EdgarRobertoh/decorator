public class Main {
    public static void main(String[] args) {
        Bebida cafeSolo = new Cafe();
        System.out.println("Descripción: " + cafeSolo.getDescripcion());
        System.out.println("Costo: Q" + cafeSolo.costo());

        Bebida teSolo = new Te();
        System.out.println("\nDescripción: " + teSolo.getDescripcion());
        System.out.println("Costo: Q" + teSolo.costo());

        Bebida cafeConLeche = new LecheDecorator(new Cafe());
        System.out.println("\nDescripción: " + cafeConLeche.getDescripcion());
        System.out.println("Costo: Q" + cafeConLeche.costo());

        Bebida teConLeche = new LecheDecorator(new Te());
        System.out.println("\nDescripción: " + teConLeche.getDescripcion());
        System.out.println("Costo: Q" + teConLeche.costo());

        Bebida cafeConChocolate = new ChocolateDecorator(new Cafe());
        System.out.println("\nDescripción: " + cafeConChocolate.getDescripcion());
        System.out.println("Costo: Q" + cafeConChocolate.costo());

        Bebida teConChocolate = new ChocolateDecorator(new Te());
        System.out.println("\nDescripción: " + teConChocolate.getDescripcion());
        System.out.println("Costo: Q" + teConChocolate.costo());

        Bebida cafeConCanela = new CanelaDecorator(new Cafe());
        System.out.println("\nDescripción: " + cafeConCanela.getDescripcion());
        System.out.println("Costo: Q" + cafeConCanela.costo());

        Bebida teConCanela = new CanelaDecorator(new Te());
        System.out.println("\nDescripción: " + teConCanela.getDescripcion());
        System.out.println("Costo: Q" + teConCanela.costo());

        Bebida cafeLecheChocolate = new ChocolateDecorator(new LecheDecorator(new Cafe()));
        System.out.println("\nDescripción: " + cafeLecheChocolate.getDescripcion());
        System.out.println("Costo: Q" + cafeLecheChocolate.costo());

        Bebida teLecheCanela = new CanelaDecorator(new LecheDecorator(new Te()));
        System.out.println("\nDescripción: " + teLecheCanela.getDescripcion());
        System.out.println("Costo: Q" + teLecheCanela.costo());
    }
}
