
public class Pawn extends ChessPiece {
	boolean isFirstMove;;

	public Pawn(Color c) {
		super(c);
		isFirstMove=true;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Move(String mv)
	{
		
	}
	@Override
	public boolean parseMove(String src, String dest, ChessBoard[][] b)
	{
		
		return true;
	}

}
