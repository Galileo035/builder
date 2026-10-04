package builder;

public class Main {
    public static void main(String[] args) {
        // Difícil de leer, ¿qué es cada parámetro?
        User user = new User.Builder("Juan", "Pérez")
                .age(30)
                .phone("123456789")
                .address("Calle Falsa 123")
                .build();

        System.out.println(user);

        User user2 = new User.Builder("María", "Gómez")
         .phone("+987654321")
         .build();

         System.out.println(user2);

         User user3 = new User.Builder("Carlos", "López")
         .age(25)
         .address("Avenida Siempre Viva 742")
         .build();

         System.out.println(user3);
    }
}