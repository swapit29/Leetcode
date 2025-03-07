package matrix;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {

	// Beats - 26%
	public static boolean isValidSudoku(char[][] board) {
		Set<String> cache = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char ch = board[i][j];
				if (ch != '.' && (!cache.add("Row-" + i + "," + ch) || !cache.add("Column-" + j + "," + ch)
						|| !cache.add("Block-" + i / 3 + "," + j / 3 + "," + ch))) {
					return false;
				}
			}
		}
		return true;
	}

}
