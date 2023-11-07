package lotto.view;

public enum ExceptionMessage {

    inputPurchaseAmountError("ERROR"),
    inputWinningNumbersSizeError("ERROR"),
    NumberFormatError("ERROR"),

    NumberRangeError("ERROR");


    private String errorMessage;

    ExceptionMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
