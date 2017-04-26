
public abstract class ChessPiece {
	
	private Color color;
	public ChessPiece(Color c){
		color = c;
	}
	
	void Move(String mv)
	{
		
	}
	public abstract boolean parseMove(String src, String destination, ChessBoard[][]b);
	
}
