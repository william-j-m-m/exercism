public class Lasagna {
    // done: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // done: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeInOven) {
        return expectedMinutesInOven() - timeInOven;
    }

    // done: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }

    // : define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int timeInOven) {
        return preparationTimeInMinutes(layers) + timeInOven;
    }
}
