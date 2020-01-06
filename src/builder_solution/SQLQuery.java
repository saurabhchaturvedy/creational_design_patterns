package builder_solution;

public class SQLQuery implements Query {

    private String from;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    private String where;

    @Override
    public void execute() {
        System.out.println("Executing SQL Query from : " + from + " where : " + where);
    }
}
