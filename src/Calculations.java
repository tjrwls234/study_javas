public class Calculations extends Object {
    int _first = 0;
    int _second = 0;

    Calculations() {
        System.out.println("Calculations - constructor");
    }

    Calculations(int first, int second) {
        this._first = first;
        this._second = second;
        System.out.println("Calculations - constructor wiith parameter");
    }

    // muliplication
    public int multiplication() {
        int result = this._first * this._second;
        return result;
    }

    // Public Method addtion
    public int addition(int first, int second) {
        int result = first + second;
        return result;
    }

    // Public Method subtraction
    public int subtraction(int first, int second) {
        int result = first - second;
        return result;
    }
}
