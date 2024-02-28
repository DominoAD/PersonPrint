public class Monsters {
    String name;

    void scare()
    {
        System.out.println(this.name +" said, \"Boo!\"");
    }

    void scare(String name){
        System.out.println(name +" said, \"Boo!\"");
    }
}
