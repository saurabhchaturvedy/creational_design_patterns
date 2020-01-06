package builder_solution;

public class SQLQueryBuilder implements QueryBuilder {

    SQLQuery sqlQuery = new SQLQuery();

    @Override
    public void setFrom(String from) {
        sqlQuery.setFrom(from);
    }

    @Override
    public void setWhere(String where) {
        sqlQuery.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return sqlQuery;
    }
}
