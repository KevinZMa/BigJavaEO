package ch03;

import util.SimpleTester;

/**
 * E3.5 Tests all circuit combinations of `Circuit`, printing out all actual and
 * expected states for the switches and lamps.
 */
public class CircuitTester extends SimpleTester {

    public static void main(String[] args) {
        Circuit circuit = new Circuit();

        circuit.toggleFirstSwitch();
        printStates(circuit, 1, 0, 1, false);

        circuit.toggleSecondSwitch();
        printStates(circuit, 1, 1, 0);

        circuit.toggleFirstSwitch();
        printStates(circuit, 0, 1, 1);
    }

    private static void printStates(
        Circuit circuit,
        int firstSwitch,
        int secondSwitch,
        int lamp,
        boolean printSeparator
    ) {
        if (printSeparator) System.out.println("=====");
        expect(circuit.getFirstSwitchState(), firstSwitch);
        expect(circuit.getSecondSwitchState(), secondSwitch);
        expect(circuit.getLampState(), lamp);
    }

    private static void printStates(
        Circuit circuit,
        int firstSwitch,
        int secondSwitch,
        int lamp
    ) {
        printStates(circuit, firstSwitch, secondSwitch, lamp, true);
    }
}
