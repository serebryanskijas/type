package org.itstep;

public class Enums {
    public static void main(String[] args) {

        Colors bus_colors = Colors.YELLOW;
        System.out.println("This bus is " + bus_colors);

        Days today = Days.WEDNESDAY;
        System.out.println("Today is  " + today);

        System.out.println("This wall is " + ColorsNew.WHITE.getTitle());
    }
}

enum Colors {
    BLACK, WHITE, GRAY, RAD, ORANGE, YELLOW, GREEN, BLUE, DARKBLUE, VIOLET

}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum ColorsNew {
    BLACK("Черный"),
    WHITE ("Белый");
    private String title;
        ColorsNew(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;

    }
}