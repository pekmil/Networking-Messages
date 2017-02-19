package messages.messageboard;

import java.io.Serializable;

public class BoardMessage implements Serializable {

    private static final long SerialVersionUID = 42L;

    private String author;
    private String message;

    public BoardMessage(){

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
