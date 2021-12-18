public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfLeader = new Wolf();
        wolfLeader.name = "Akella";
        wolfLeader.sex = 'M';
        wolfLeader.weight = 47.5f;
        wolfLeader.age = 12;
        wolfLeader.color = "Pale";

        System.out.println("Wolf: " + wolfLeader.name);
        System.out.println("sex: " + wolfLeader.sex);
        System.out.println("weight: " + wolfLeader.weight);
        System.out.println("age: " + wolfLeader.age);
        System.out.println("weight: " + wolfLeader.weight);
        System.out.println("color: " + wolfLeader.color);

        wolfLeader.walk();
        wolfLeader.sit();
        wolfLeader.run();
        wolfLeader.howl();
        wolfLeader.hunt();
    }
}