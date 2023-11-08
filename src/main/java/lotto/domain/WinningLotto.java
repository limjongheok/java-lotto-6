package lotto.domain;

public class WinningLotto {

    private static int treeSameNumLotto = 0;
    private static int fourSameNumLotto = 0;
    private static int fiveSameNumLotto = 0;
    private static int fiveAndBonusSameNumLotto = 0;
    private static int sixSameNumLotto = 0;

    public WinningLotto() {
    }
    private static class WinningLottoHolder{
        private static final WinningLotto winningLotto = new WinningLotto();
    }

    public static WinningLotto getInstance() {
        return WinningLottoHolder.winningLotto;
    }

    public  int getTreeSameNumLotto() {
        return treeSameNumLotto;
    }

    public  int getFourSameNumLotto() {
        return fourSameNumLotto;
    }

    public  int getFiveSameNumLotto() {
        return fiveSameNumLotto;
    }

    public  int getFiveAndBonusSameNumLotto() {
        return fiveAndBonusSameNumLotto;
    }

    public  int getSixSameNumLotto() {
        return sixSameNumLotto;
    }

    public  void increaseTreeSameNumLotto(){
        treeSameNumLotto++;
    }
    public  void increaseFourSameNumLotto(){
        fourSameNumLotto++;
    }
    public  void increaseFiveSameNumLotto(){
        fiveSameNumLotto++;
    }
    public  void increaseFiveAndBonusSameNumLotto(){
        fiveAndBonusSameNumLotto++;
    }
    public  void increaseSixSameNumLotto(){
        sixSameNumLotto++;
    }

    public  void WinningLottoInit(){
        treeSameNumLotto = 0;
        fourSameNumLotto = 0;
        fiveSameNumLotto = 0;
        fiveAndBonusSameNumLotto = 0;
        sixSameNumLotto = 0;
    }


}
