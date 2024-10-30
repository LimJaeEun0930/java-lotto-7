package lotto.application;

import lotto.LottoCustomer;
import lotto.LottoSystem;

public class Application {
    public static void main(String[] args) {
        LottoSystem system = new LottoSystem();
        system.insertMoney();
        system.printSoldLottos();
    }
}
