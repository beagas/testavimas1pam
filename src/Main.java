public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(assertEquals(String.valueOf(formatName("NAGLIS")), "Naglis"));
        System.out.println(assertEquals(String.valueOf(formatName("NAGLIS ")), "Naglis "));
        System.out.println(assertEquals(String.valueOf(formatName("nAGLIS")), "Naglis"));
        System.out.println(assertEquals(String.valueOf(formatName("  naglis ")), "Naglis"));
        System.out.println(assertEquals(String.valueOf(formatName("  naglis ")), "Naglis"));
        System.out.println(assertEquals(String.valueOf(formatName("  naglis jonas ")), "Naglis Jonas"));
        System.out.println(assertEquals(String.valueOf(formatName("  naglis    jonas ")), "Naglis Jonas"));

    }

    public static StringBuilder formatName(String name) {
        String[] names = name.trim().split("\\s+");
        StringBuilder actual = new StringBuilder();
        for (String word :names) {
        actual.append(word.substring(0, 1).toUpperCase()).
                append(word.substring(1).toLowerCase()).
                append(" ");
        }
        actual = new StringBuilder(actual.substring(0, actual.length() - 1));
        return actual;//suformatuotas Namecase
    }
    private static boolean assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Assert passed " + actual + " equals " + expected);
            return true;
        } else {
            System.out.println("Assert failed " + actual + " does not equal " + expected);
            return false;
        }
    }

}