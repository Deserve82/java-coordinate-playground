package ui;

import domain.Position;
import java.util.List;

public class OutputView {

    private static final int MAX_COORDINATES_VALUE = 24;

    public void printTypeCoordinates() {
        System.out.println("좌표를 입력하십시오");
    }

    public void printCoordinates(List<Position> positions) {
        for (int i = MAX_COORDINATES_VALUE; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();
            addGraphString(i, sb);
            printRow(sb, i, positions);
            System.out.println(sb);
        }
    }

    public void printDistance(double value) {
        System.out.println("두 점 사이 거리는 " + value);
    }

    private void addGraphString(int index, StringBuilder sb) {
        if (index == 0) {
            sb.append("  +ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ\n");
            sb.append("0  2  4  6  8  10 12 14 16 18 20 22 24");
            return;
        }

        if (index % 2 == 0 && index > 8) {
            sb.append(index + "|");
            return;
        }

        if (index % 2 == 0) {
            sb.append(" "+index+"|");
            return;
        }

        sb.append("  |");
    }

    private void printRow(StringBuilder sb, int y, List<Position> positions) {
        for (int x=0; x<25; x++) {
            sb.append(" ");
            checkPositions(positions, x, y, sb);
        }
    }



    private void checkPositions(List<Position> positions, int x, int y, StringBuilder sb) {
        for (Position position : positions) {
            drawPoint(position, x, y, sb);
        }
    }

    private void drawPoint(Position position, int x, int y, StringBuilder sb) {
        if (position.isXValue(x) && position.isYValue(y)) {
            sb.deleteCharAt(sb.length()-1);
            sb.append("*");
        }
    }
}
