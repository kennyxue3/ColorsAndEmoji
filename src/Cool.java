public class Cool {
    private static final String RED = "\u001B[31m";
    private static final String GREEN_APPLE_EMOJI = "\uD83C\uDF4F";

    public static void apple() throws InterruptedException {
        String print = RED + GREEN_APPLE_EMOJI;
        for (int i = 0; i < 10; i++) {
            System.out.println(print);
            print = "    " + print;
            Thread.sleep(500);
            System.out.println();
        }
        System.out.println(RED + "THUD!");
    }
}
