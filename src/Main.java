public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String formatedName = formatName("nAglis lapas");
        assertEquals(formatedName, "Naglis");
    }

    public static String formatName(String name) {
        String actual = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
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