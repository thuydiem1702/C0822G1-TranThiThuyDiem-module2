package weekkkk;

public class Posts {
    private int id;
    private String title;
    private String subtitle;
    private String content;
    private int views;

    public Posts() {
    }

    public Posts(int id, String title, String subtitle, String content, int views) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
        this.views = views;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", content='" + content + '\'' +
                ", views=" + views +
                '}';
    }
}
