package prototype_solution;

public class GraphicCreatorTool {

    private Graphic prototype;

    public GraphicCreatorTool(Graphic prototype) {
        this.prototype = prototype;
    }

    public Graphic createGraphic() {
        return prototype;
    }

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }
}
