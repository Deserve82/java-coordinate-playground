package ui;

import domain.Line;
import domain.Position;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public Line getPositions() {
        String line = scanner.nextLine();

        String[] coordinates = line.split("-");
        List<Position> result = new ArrayList<>();
        for (String coordinate : coordinates) {
            String[] values = coordinate.substring(1, coordinate.length()-1).split(",");
            result.add(new Position(Integer.parseInt(values[0]), Integer.parseInt(values[1])));
        }

        return new Line(result.get(0), result.get(1));
    }
}
