
public class Ficha {

    public interface BuildierI {

        public BuildierI setRow(int a);

        ;

        public BuildierI setColumn(int a);

        

        public BuildierI setPlayer(String a);

        public Ficha create();

        Object setRow(int i);

        ;

    };
    private static class Buildier implements BuildierI  {

        @Override
        public BuildierI setX(int a) {
            return null;
        }

        @Override
        public BuildierI setY(int a) {
            return null;
        }

        @Override
        public BuildierI setPlayer(String a) {
            return null;
        }

        public Ficha create() {
           return null;
        };

    }
    public static BuildierI getBuildier() {
        return null;
    };
}
