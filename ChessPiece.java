
public abstract class ChessPiece {
	
	private Color color;
	public ChessPiece(Color c){
		color = c;
	}
	
	void Move(String mv)
	{
		
	}
	abstract boolean parseMove(String src, String destination, ChessBoard[][]b);
	
}
