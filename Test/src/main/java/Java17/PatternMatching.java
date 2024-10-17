package Java17;

public class PatternMatching {
    public static void main(String[] args) {
        printValue("abc");
        printValue1(1234);
    }




    //previously

   /* if (obj instanceof String) {
        String str = (String) obj;
        // use str
    }
*/

    /*if (obj instanceof String str) {
        // use str directly
    }*/


    public static void printValue(Object o) {
        if (o instanceof String str) {
            System.out.println("String: " + str);
        } else if (o instanceof Integer i) {
            System.out.println("Integer: " + i);
        }
    }

    public static void printValue1(Object o) {
        if (o instanceof String str) {
            System.out.println("String: " + str);
        } else if (o instanceof Integer i) {
            System.out.println("Integer: " + i);
        }
    }


/*In Java, the introduction of pattern matching for switch statements brings
    a powerful tool for handling complex conditional logic and type checking.*/

    /*public static String getFormatStringUsingSwitchPatternMatching(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("Integer: %d", i);
            case Long l -> String.format("Long: %d", l);
            case Double d -> String.format("Double: %f", d);
            case String s -> String.format("String: %s", s);
            default -> "Unknown";
        };
    }


    public static int getIntegerUsingGuardPattern(Object o) {
        return switch (o) {
            case Integer i && i > 1 -> i;
            case null, default -> 0;
        };
    }*/


}
