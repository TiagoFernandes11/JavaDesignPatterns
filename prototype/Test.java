package prototype;

public class Test {
    public static void main(String[] args) {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Game one");

        Game game2 = game1.clone();
        System.out.println(game1);
        System.out.println(game2);
    }
}
