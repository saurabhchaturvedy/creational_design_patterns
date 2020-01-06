package builder_solution;

public interface QueryBuilder {

    void setFrom(String from);
    void setWhere(String where);
    Query getQuery();
}
