package builder_solution;

public class QueryBuildDirector {

    public Query buildQuery(String from, String where, QueryBuilder queryBuilder) {
        queryBuilder.setFrom(from);
        queryBuilder.setWhere(where);
        return queryBuilder.getQuery();
    }
}
