package prototype_solution;

public class Video extends Graphic {

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

    @Override
    public Graphic clone() {
        Video clone = new Video();
        clone.setUrl(url);
        return clone;
    }
}
