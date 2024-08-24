package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    STATUS_KI2(0),
    //public static final int STATUS_KI2 = 0, STATUS_BLITZ = 1, STATUS_NORMALHEAL = 2, STATUS_FULLKICRIT = 3, STATUS_PRIZEMONEY = 4;
    STATUS_BLITZ(1),
    STATUS_NORMALHEAL(2),
    STATUS_FULLKICRIT(3),
    STATUS_PRIZEMONEY(4);

    private final int value;
}
