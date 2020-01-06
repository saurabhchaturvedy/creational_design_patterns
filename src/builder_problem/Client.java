package builder_problem;

public class Client {

    public static void main(String[] args) {

        String from = "table name...";
        String where = "some_condition.?.";

        SQLQuery sqlQuery = new SQLQuery();
        sqlQuery.setFrom(from);
        sqlQuery.setWhere(where);
        sqlQuery.execute();

        MongoDBQuery mongoDBQuery = new MongoDBQuery();
        mongoDBQuery.setFrom(from);
        mongoDBQuery.setWhere(where);
        mongoDBQuery.execute();
    }
}
