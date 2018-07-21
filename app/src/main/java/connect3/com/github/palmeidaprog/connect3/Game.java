package connect3.com.github.palmeidaprog.connect3;

public class Game {
    private char table[][] = new char[3][3];
    private char currentPlayer;
    private boolean ended;

    public Game() {
        this('x');
    }

    public Game(char currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public boolean turnPlay(int line, int column) {
        if(ended) {
            return false;
        }

        if(table[line][column] == '\u0000') {
            table[line][column] = currentPlayer;
            return true;
        }
        return false;
    }

    // if the game was won
    public boolean isWon() {
        if(ended) {
            return true;
        }

        for(int i = 0; i < 3; i++) {
            if(table[i][0] == table[i][1] && table[i][0] == table[i][2] ||
                table[0][i] == table[1][i] && table[0][i] == table[2][i]) {
                ended = true;
                return true;
            }
        }

        // diagonals
        if(table[0][0] == table[1][1] && table[0][0] == table[2][2] ||
                table[2][0] == table[1][1] && table[2][0] == table[0][2]) {
            ended = true;
            return true;
        }
        return false;
    }
}
