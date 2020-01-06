package builder_solution;

public class MongoDBQuery implements Query {

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
        System.out.println("Executing MongoDB Query from : " + from + " where : " + where);
    }
}
