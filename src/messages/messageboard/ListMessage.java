package messages.messageboard;

import messages.Message;

import java.util.ArrayList;
import java.util.List;

public class ListMessage extends Message {

    private List<BoardMessage> boardMessages;

    public ListMessage(){
        this.boardMessages = new ArrayList<>();
    }

    public List<BoardMessage> getBoardMessages() {
        return boardMessages;
    }

    public void setBoardMessages(List<BoardMessage> boardMessages) {
        this.boardMessages = boardMessages;
    }
}
