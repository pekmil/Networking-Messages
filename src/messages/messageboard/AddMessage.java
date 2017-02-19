package messages.messageboard;

import messages.Message;

public class AddMessage extends Message {

    private BoardMessage message;

    public AddMessage(){

    }

    public BoardMessage getMessage() {
        return message;
    }

    public void setMessage(BoardMessage message) {
        this.message = message;
    }
}
