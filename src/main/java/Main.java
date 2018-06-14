public class Main {
    public static void main(String[] args) {
        JDBC jdbc = new JDBC();

        jdbc.exequte(Queries.INSERT.toString());
        jdbc.exequte(Queries.UPDATE.toString());
        jdbc.exequte(Queries.DELETE.toString());
    }
}
