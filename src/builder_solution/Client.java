package builder_solution;

public class Client {

    public static void main(String[] args) {
        String from = "table_name...";
        String where = "some_condition..?..";

        QueryBuildDirector queryBuildDirector = new QueryBuildDirector();

        QueryBuilder queryBuilder = new MongoDBQueryBuilder();
        Query query = queryBuildDirector.buildQuery(from, where, queryBuilder);
        query.execute();

        queryBuilder = new SQLQueryBuilder();
        Query query2 = queryBuildDirector.buildQuery(from, where, queryBuilder);
        query2.execute();

    }
}
