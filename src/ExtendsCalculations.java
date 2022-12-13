public class ExtendsCalculations extends Calculations {

    ExtendsCalculations() {
        System.out.println("ExtendsCalcultions - constructor");

    }

    // Public Method addtion
    public int multiplication(int first, int second) {
        int result = first * second;
        return result;
    }

    // Public Method subtraction
    public int subtraction(int first, int second) {
        int result = second - first;
        return result;
    }
}
