public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();

        for (int i = 1; i <= 7; i++) {
            smartArray.add(i);
        }

        final int remove = smartArray.remove(0);
        System.out.print(remove);
    }
}
