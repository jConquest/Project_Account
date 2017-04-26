package chessgame;

/**
 *
 * @author Anya, Joe and Jenna
 */
public class ChessBoard {
    
    private String[][]board=new String[8][8];
    private ChessPiece[]white = new ChessPiece[16];
    private ChessPiece[]black = new ChessPiece[16];
    private String[][]compareBoard = new String[8][8];
    
    public ChessBoard()
    {
        white[0]=new Pawn(Color.white);
        white[1]=new Pawn(Color.white);
        white[2]=new Pawn(Color.white);
        white[3]=new Pawn(Color.white);
        white[4]=new Pawn(Color.white);
        white[5]=new Pawn(Color.white);
        white[6]=new Pawn(Color.white);
        white[7]=new Pawn(Color.white);
        white[8]=new Rook(Color.white);
        white[9]=new Knight(Color.white);
        white[10]=new Bishop(Color.white);
        white[11]=new Queen(Color.white);
        white[12]=new King(Color.white);
        white[13]=new Bishop(Color.white);
        white[14]=new Knight(Color.white);
        white[15]=new Rook(Color.white);
        
        black[0]=new Rook(Color.black);
        black[1]=new Knight(Color.black);
        black[2]=new Bishop(Color.black);
        black[3]=new Queen(Color.black);
        black[4]=new King(Color.black);
        black[5]=new Bishop(Color.black);
        black[6]=new Knight(Color.black);
        black[7]=new Rook(Color.black);
        black[8]=new Pawn(Color.black);
        black[9]=new Pawn(Color.black);
        black[10]=new Pawn(Color.black);
        black[11]=new Pawn(Color.black);
        black[12]=new Pawn(Color.black);
        black[13]=new Pawn(Color.black);
        black[14]=new Pawn(Color.black);
        black[15]=new Pawn(Color.black);
        
        compareBoard[0][0]="A1";
        compareBoard[0][1]="A2";
        compareBoard[0][2]="A3";
        compareBoard[0][3]="A4";
        compareBoard[0][4]="A5";
        compareBoard[0][5]="A6";
        compareBoard[0][6]="A7";
        compareBoard[0][7]="A8";
        compareBoard[1][0]="B1";
        compareBoard[1][1]="B2";
        compareBoard[1][2]="B3";
        compareBoard[1][3]="B4";
        compareBoard[1][4]="B5";
        compareBoard[1][5]="B6";
        compareBoard[1][6]="B7";
        compareBoard[1][7]="B8";
        compareBoard[2][0]="C1";
        compareBoard[2][1]="C2";
        compareBoard[2][2]="C3";
        compareBoard[2][3]="C4";
        compareBoard[2][4]="C5";
        compareBoard[2][5]="C6";
        compareBoard[2][6]="C7";
        compareBoard[2][7]="C8";
        compareBoard[3][0]="D1";
        compareBoard[3][1]="D2";
        compareBoard[3][2]="D3";
        compareBoard[3][3]="D4";
        compareBoard[3][4]="D5";
        compareBoard[3][5]="D6";
        compareBoard[3][6]="D7";
        compareBoard[3][7]="D8";
        compareBoard[4][0]="E1";
        compareBoard[4][1]="E2";
        compareBoard[4][2]="E3";
        compareBoard[4][3]="E4";
        compareBoard[4][4]="E5";
        compareBoard[4][5]="E6";
        compareBoard[4][6]="E7";
        compareBoard[4][7]="E8";
        compareBoard[5][0]="F1";
        compareBoard[5][1]="F2";
        compareBoard[5][2]="F3";
        compareBoard[5][3]="F4";
        compareBoard[5][4]="F5";
        compareBoard[5][5]="F6";
        compareBoard[5][6]="F7";
        compareBoard[5][7]="F8";
        compareBoard[6][0]="G1";
        compareBoard[6][1]="G2";
        compareBoard[6][2]="G3";
        compareBoard[6][3]="G4";
        compareBoard[6][4]="G5";
        compareBoard[6][5]="G6";
        compareBoard[6][6]="G7";
        compareBoard[6][7]="G8";
        compareBoard[7][0]="H1";
        compareBoard[7][1]="H2";
        compareBoard[7][2]="H3";
        compareBoard[7][3]="H4";
        compareBoard[7][4]="H5";
        compareBoard[7][5]="H6";
        compareBoard[7][6]="H7";
        compareBoard[7][7]="H8";
        
        board[0][0]=black[0].toString();
        board[0][1]=black[1].toString();
        board[0][2]=black[2].toString();
        board[0][3]=black[3].toString();
        board[0][4]=black[4].toString();
        board[0][5]=black[5].toString();
        board[0][6]=black[6].toString();
        board[0][7]=black[7].toString();
        board[1][0]=black[8].toString();
        board[1][1]=black[9].toString();
        board[1][2]=black[10].toString();
        board[1][3]=black[11].toString();
        board[1][4]=black[12].toString();
        board[1][5]=black[13].toString();
        board[1][6]=black[14].toString();
        board[1][7]=black[15].toString();
        board[2][0]="C1";
        board[2][1]="C2";
        board[2][2]="C3";
        board[2][3]="C4";
        board[2][4]="C5";
        board[2][5]="C6";
        board[2][6]="C7";
        board[2][7]="C8";
        board[3][0]="D1";
        board[3][1]="D2";
        board[3][2]="D3";
        board[3][3]="D4";
        board[3][4]="D5";
        board[3][5]="D6";
        board[3][6]="D7";
        board[3][7]="D8";
        board[4][0]="E1";
        board[4][1]="E2";
        board[4][2]="E3";
        board[4][3]="E4";
        board[4][4]="E5";
        board[4][5]="E6";
        board[4][6]="E7";
        board[4][7]="E8";
        board[5][0]="F1";
        board[5][1]="F2";
        board[5][2]="F3";
        board[5][3]="F4";
        board[5][4]="F5";
        board[5][5]="F6";
        board[5][6]="F7";
        board[5][7]="F8";
        board[6][0]=white[0].toString();
        board[6][1]=white[1].toString();
        board[6][2]=white[2].toString();
        board[6][3]=white[3].toString();
        board[6][4]=white[4].toString();
        board[6][5]=white[5].toString();
        board[6][6]=white[6].toString();
        board[6][7]=white[7].toString();
        board[7][0]=white[8].toString();
        board[7][1]=white[9].toString();
        board[7][2]=white[10].toString();
        board[7][3]=white[11].toString();
        board[7][4]=white[12].toString();
        board[7][5]=white[13].toString();
        board[7][6]=white[14].toString();
        board[7][7]=white[15].toString();
 
        
    }
    public String printBoard()
    {   String tmp="";
        
        for(int i =0; i<8; i++)
        {   
            tmp+="\n\n\n\n";
        
            for(int j=0; j<8; j++)
            {
                tmp+=("|\t"+board[i][j]+"\t");
                if(j==7)
                    tmp+="|";
        
            }
            
        }
        return tmp;
    }
    
}

