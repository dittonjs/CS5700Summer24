class IdGenerator {
    private int id = 1;
    private static IdGenerator instance = null;

    public int getId() {
        return id ++;
    }

    private IdGenerator() {

    }

    public static IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
}


public class Main {
    public static void main(String[] args) {
        IdGenerator generator = IdGenerator.getInstance();
        System.out.println(generator.getId());

        IdGenerator otherGenerator = IdGenerator.getInstance();
        System.out.println(generator == otherGenerator);
        System.out.println(otherGenerator.getId());

    }
}