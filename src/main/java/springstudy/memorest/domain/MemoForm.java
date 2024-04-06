package springstudy.memorest.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MemoForm {
    private String title;
    private String content;
    private String author;

    @Override
    public String toString() {
        return "MemoForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
