package array.game1d;

public class OneDArray {
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean isWin = canWin(leap, game, 0);

        return isWin;
    }

    public static boolean canWin(int leap, int[] game, int i) {
        if(i < 0 || game[i] == 1){
            return false;
        }
        if((i == game.length - 1) || i + leap > game.length - 1){
            return true;
        }

        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }
}
