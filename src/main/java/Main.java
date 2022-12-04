import domain.Line;
import ui.InputView;
import ui.OutputView;

public class Main {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        outputView.printTypeCoordinates();
        Line line = inputView.getPositions();

        outputView.printCoordinates(line.getPositions());
        outputView.printDistance(line.getLength());
    }
}
