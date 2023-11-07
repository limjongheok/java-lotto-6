package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import lotto.controller.LottoController;
import lotto.domain.LottoTickets;

public class UserInputView {

    public static void inputPurchaseAmount(){
        try{
            LottoController.createBuyLottoTickets(Long.parseLong(Console.readLine()));

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            inputPurchaseAmount();
        }
    }

    public static void winningNumbers(){
        try{

        }catch (IllegalAccessError e){
            System.out.println(e.getMessage());
            winningNumbers();
        }
    }
}
