package builder_solution;

public class MongoDBQueryBuilder implements QueryBuilder {

    MongoDBQuery mongoDBQuery = new MongoDBQuery();

    @Override
    public void setFrom(String from) {
        mongoDBQuery.setFrom(from);
    }

    @Override
    public void setWhere(String where) {
        mongoDBQuery.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return mongoDBQuery;
    }
}
