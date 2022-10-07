package main.chapter7_Beyond_Classes._2_Enums._1_Creating_Simple_Enums;

public enum Season {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SPRING {
        public String getHours() {
            return "9am-5pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    FALL {
        public String getHours() {
            return "9am-5pm";
        }
    };

    public abstract String getHours();
}


//public enum Season {
//    WINTER("Low"),
//    SPRING("Medium"),
//    SUMMER("High"),
//    FALL("Medium");
//    private final String expectedVisitors;
//
//    private Season(String expectedVisitors) {
//        this.expectedVisitors = expectedVisitors;
//    }
//
//    public void printExpectedVisitors() {
//        System.out.println(expectedVisitors);
//    }
//}


//public enum Season {
//    WINTER, SPRING, SUMMER, FALL;
//}
