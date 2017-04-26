package chessgame;

/**
 *
 * @author Anya, Joe and Jenna
 */
public class ChessBoard {
    
    private String[][]board=new String[8][8];
    private ChessPiece[]white = new ChessPiece[16];
    private ChessPiece[]black = new ChessPiece[16];
    
    public ChessBoard()
    {
        white[0]=new Rook(Color.white);
        white[1]=new Knight(Color.white);
        white[2]=new Bishop(Color.white);
        white[3]=new Queen(Color.white);
        white[4]=new King(Color.white);
        white[5]=new Bishop(Color.white);
        white[6]=new Knight(Color.white);
        white[7]=new Rook(Color.white);
        white[8]=new Pawn(Color.white);
        white[9]=new Pawn(Color.white);
        white[10]=new Pawn(Color.white);
        white[11]=new Pawn(Color.white);
        white[12]=new Pawn(Color.white);
        white[13]=new Pawn(Color.white);
        white[14]=new Pawn(Color.white);
        white[15]=new Pawn(Color.white);
        
        
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
        
        board[0][0]="A1";
        board[0][1]="A2";
        board[0][2]="A3";
        board[0][3]="A4";
        board[0][4]="A5";
        board[0][5]="A6";
        board[0][6]="A7";
        board[0][7]="A8";
        board[1][0]="B1";
        board[1][1]="B2";
        board[1][2]="B3";
        board[1][3]="B4";
        board[1][4]="B5";
        board[1][5]="B6";
        board[1][6]="B7";
        board[1][7]="B8";
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
        board[6][0]="G1";
        board[6][1]="G2";
        board[6][2]="G3";
        board[6][3]="G4";
        board[6][4]="G5";
        board[6][5]="G6";
        board[6][6]="G7";
        board[6][7]="G8";
        board[7][0]="H1";
        board[7][1]="H2";
        board[7][2]="H3";
        board[7][3]="H4";
        board[7][4]="H5";
        board[7][5]="H6";
        board[7][6]="H7";
        board[7][7]="H8";
        
        
        
    /*    int count = 0;
        for(int i=0; i<board.length; i++)
        {
            for(int j = 0; j<8; j++)
            {
                if(i==0||i==1)
                {
                    board[i][j]=black[count];
                    count++;
                }
                
                if(i==6||i==7)
                {
                    board[i][j].equals(white[count]);
                    count++;
                }
                
                else
                {
                    board[i][j]=null;
                    count=0;
                }
                
            }
        }*/
        
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

