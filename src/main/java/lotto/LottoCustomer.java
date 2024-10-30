package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoCustomer {
    private int BetMoney;
    private List<Lotto> lottos = new ArrayList<>();
    LottoCustomer() {
    }

    void addBetMoney(int betMoney) {
        this.BetMoney += betMoney;
    }

    void collectLotto(Lotto lotto) {
        this.lottos.add(lotto);
    }

    List<Lotto> getLottos() {
        return lottos;
    }
}
