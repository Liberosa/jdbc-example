public enum Queries {
    INSERT{
        @Override
        public String toString() {
            return "INSERT INTO developers (NAME, SPECIALTY, EXPERIENCE, SALARY)" +
                    " VALUES ('Liza', 'Java', 0, 423)";
        }
    },

    UPDATE{
        @Override
        public String toString() {
            return "UPDATE developers SET SALARY = 10000 WHERE NAME='Dmitry Volchok' AND ID=3";
        }
    },

    DELETE{
        @Override
        public String toString() {
            return "DELETE FROM developers WHERE developers.ID >= 1";
        }
    }

}
