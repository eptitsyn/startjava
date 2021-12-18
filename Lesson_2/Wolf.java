public class Wolf {

    private String name;
    private char sex;
    private float weight;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 8) {
            this.age = age;
        } else {
            System.out.println("Некорректный возраст");
        }
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Walking.");
    }

    public void sit() {
        System.out.println("Sitting.");
    }

    public void run() {
        System.out.println("Running.");
    }

    public void howl() {
        System.out.println("Howling.");
    }

    public void hunt() {
        System.out.println("Hunting.");
    }
}