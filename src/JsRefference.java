import java.util.List;

public class JsRefference {
    List<Section> sectionList;
    Author author;

    public JsRefference(List<Section> sectionList, Author author) {
        this.sectionList = sectionList;
        this.author = author;
    }
    public JsRefference(){}

    public List<Section> getSectionList() {
        return sectionList;
    }

    public Author getAuthor() {
        return author;
    }
}
