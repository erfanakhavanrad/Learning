package broCode;

public enum PlantEnum {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    int number;

    PlantEnum(int number) {
        this.number = number;
    }
}

class Main {
    public static void main(String[] args) {
        PlantEnum plantEnum = PlantEnum.PLUTO;
        canILiveHere(plantEnum);
    }

    private static void canILiveHere(PlantEnum plantEnum) {
        switch (plantEnum) {
            case EARTH:
                System.out.println("Habitable");
                System.out.println("Yet");
                break;
            case PLUTO:
                System.out.println("Dwarf plant");
                System.out.println("Planet Number is " + plantEnum.number);
        }
    }
}
