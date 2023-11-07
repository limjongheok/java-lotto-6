package lotto.domain;

import lotto.view.ExceptionMessage;

import java.util.ArrayList;
import java.util.List;


public class WinningNumber {

    private static  List<Integer> winningNums;

    private static  int bonusNum;


    public static  void putWinningNum(String winningNums) throws IllegalArgumentException{
        String[] winningNum = winningNums.split(",");
        List<Integer> winningNumbers = new ArrayList<>();
        for(int i=0; i<winningNum.length; i++){
            validateRangeNum(Integer.valueOf(winningNum[i]));
            winningNumbers.add(Integer.valueOf(winningNum[i]));
        }
        WinningNumber.winningNums = winningNumbers;
        validateSize(winningNumbers);
    }

    public static void putBonusNum(String bonusNum) throws IllegalArgumentException{
        validateRangeNum(Integer.parseInt(bonusNum));
        WinningNumber.bonusNum = Integer.parseInt(bonusNum);
    }

    public static List<Integer> getWinningNums() {
        return winningNums;
    }

    public static int getBonusNum() {
        return bonusNum;
    }

    private static void validateSize(List<Integer> winningNums){
        if(winningNums.size() != 6){
            throw new IllegalArgumentException(ExceptionMessage.inputWinningNumbersSizeError.getErrorMessage());
        }
    }

    private static void validateRangeNum(int number){
        if(number <1 || number >45){
            throw new IllegalArgumentException(ExceptionMessage.NumberRangeError.getErrorMessage());
        }

    }


}
