package messages.messageboard;

import messages.Message;

public class ErrorMessage extends Message {

    private String errorMsg;

    public ErrorMessage(String errorMsg){
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
