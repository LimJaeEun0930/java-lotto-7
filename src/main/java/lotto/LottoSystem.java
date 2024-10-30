package lotto;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class LottoSystem {
    private static final String INSERT_MONEY = "구입금액을 입력해 주세요.";
    private static final String PRINT_SOLD_LOTTO_COUNT = "개를 구매했습니다.";
    private static final String MONEY_NOT_DIVIDED_BY_1000 = "[ERROR] 로또 구입 금액은 1,000원 단위로 입력 가능합니다.";

    private static LottoCustomer customer = new LottoCustomer();
    private int printLottoCount;

    public void insertMoney() {
        System.out.println(INSERT_MONEY);
        int money = Integer.parseInt(Console.readLine());
        if (money % 1000 != 0) {
            throw new IllegalArgumentException(MONEY_NOT_DIVIDED_BY_1000);
        }
        printLottoCount = money / 1000;
        customer.addBetMoney(money);
        for (int i = 0; i < printLottoCount; ++i) {
            customer.collectLotto(createAutoLotto());
        }
    }

    public void printSoldLottos() {
        System.out.println(printLottoCount + PRINT_SOLD_LOTTO_COUNT);
        for (Lotto lotto : customer.getLottos()) {
            System.out.println(lotto);
        }
    }

    private Lotto createAutoLotto() {
        return new Lotto(Randoms.pickUniqueNumbersInRange(1, 45, 6));
    }
}
