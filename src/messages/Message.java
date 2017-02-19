package messages;

import java.io.Serializable;

public abstract class Message implements Serializable {

    private static final long serialVersionUID = 42L;

    private String clientId;

    private Serializable content;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Serializable getContent() {
        return content;
    }

    public void setContent(Serializable content) {
        this.content = content;
    }
}
