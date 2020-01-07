package prototype_solution;

public class Client {

    public static void main(String[] args) {

        Image image = new Image();
        image.setUrl("http://test-123.com");
        GraphicCreatorTool graphicCreatorTool = new GraphicCreatorTool(image);
        Graphic graphic = graphicCreatorTool.createGraphic();
        System.out.println("Graphic is " + graphic.getClass());
        Video video = new Video();
        graphicCreatorTool.setPrototype(video);
        Graphic graphic2 = graphicCreatorTool.createGraphic();
        System.out.println("URL is " + graphic2.getClass());
    }
}
