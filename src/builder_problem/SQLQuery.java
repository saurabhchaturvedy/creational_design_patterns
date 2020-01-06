package builder_problem;

public class SQLQuery implements Query {

    private String from;
    private String where;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    @Override
    public void execute() {
        System.out.println("Executing SQL Query from : " + from + " where : " + where);
    }
}
