//package TEST;
//
//class ScannerTest1 {
//
//	public static void main(String[] arg) 
//	{
//		public static void print(ChessPiece[][] chess, int row1st, int col1st,
//				int col2nd, int row2nd) {
//			int a;
//			int b;
//
//			String rows = " hgfedcba";
//			String nullSquare = "| Null |";
//			String[][] array = new String[9][9];
//			for (a = 1; a < 9; a++) {
//				for (b = 1; b < 9; b++) {
//					if (chess[a][b] != null) { 
//						array[a][b] = chess[a][b].setInBoard();
//					} else {
//						array[a][b] = nullSquare;
//					}
//				}
//			}
//			rows = " hgfedcba";
//			int i = 0;
//			int j = 0;
//			for (i = 0; i < 9; i++) {
//				for (j = 1; j < 9; j++) {
//					if (i == 0) {
//						System.out.print("    " + rows.charAt(j) + "   ");
//					} else {
//						if (i > 0)
//							System.out.print(array[i][j]);
//					}
//				}
//				if (i == 0)
//					System.out.println();
//				if (i > 0) {
//					System.out.println(i);
//				}
//
//			}
//
//		}
//	
//	}
//}
//
