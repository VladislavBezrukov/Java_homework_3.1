public class BonusMilesService {
    public int calculate(int price) {
        int bonusAmount = 20; // стоймость одной мили

        int bonus = price / bonusAmount;

        return bonus;
    }

}

