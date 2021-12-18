public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfLeader = new Wolf();
        wolfLeader.setName("Akella");
        wolfLeader.setSex('M');
        wolfLeader.setWeight(47.5f);
        wolfLeader.setAge(7);
        wolfLeader.setColor("Pale");

        System.out.println("Wolf: " + wolfLeader.getName());
        System.out.println("sex: " + wolfLeader.getSex());
        System.out.println("weight: " + wolfLeader.getWeight());
        System.out.println("age: " + wolfLeader.getAge());
        System.out.println("weight: " + wolfLeader.getWeight());
        System.out.println("color: " + wolfLeader.getColor());

        wolfLeader.walk();
        wolfLeader.sit();
        wolfLeader.run();
        wolfLeader.howl();
        wolfLeader.hunt();
    }
}