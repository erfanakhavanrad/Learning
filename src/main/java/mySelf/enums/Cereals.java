package mySelf.enums;

/**
 * @author Erfan Akhavan Rad
 * @created 04/19/2024
 */
public enum Cereals {
    CAPTAIN_CRUNCH(50, 7), FROOT_LOOPS(60, 6), REESES_PUFFS(100, 5.5), COCOA_PUFFS(75, 8.9);

    final int levelOfDeliciousness;
    final double price;

    Cereals(int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
