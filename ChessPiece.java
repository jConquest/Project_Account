
public abstract class ChessPiece {
	
	private Color color;
	public ChessPiece(Color c){
		color = c;
	}
	
	void Move(String mv)
	{
		
	}
	abstract boolean parseMove(String src, String destination, ChessBoard[][]b);
	
		//Here below starts modifications by Joe on 4/26/17 3:35pm 
	
	//We need a way of translating the input for where the player wishes to place the piece into int x and y for the array
		//i.e. "a7" would be translated to int x = 0; int y = 6; or Board[0][6]
		//this is also a good place to handle INBOUNDS exceptions, if they dont give us a char a-h or 1-8 then we shoot error
		//function should return boolean true if move is possible
	//TWO FUNCTIONS NECESSARY TO RETRIVE THE X AND Y VALUES FOR THE ARRAY
	/**
         * Translates the column from letter to coordinate 
         * @param str will be put into string builder at uppercase
         * 
         * @return int value for x of (x,y) array coordinates RETURN -1 IF ERROR
         */
	public int translateColumn(String str){
		StringBuilder string = new StringBuilder(str.toUpperCase());	
                if (string.length() != 2)  {
                    System.out.println("Invalid coordinate entry");
                    return -1;
                }
                    
                else{
                    switch(string.charAt(0)){
                        case 'A': return 0;
                        case 'B': return 1;
                        case 'C': return 2;
                        case 'D': return 3;
                        case 'E': return 4;
                        case 'F': return 5;
                        case 'G': return 6;
                        case 'H': return 7;
                    }
                }
             return -1;   
	}
         /**
         * Translate Row for int value of y coordinate
         * @param str at char(1)
         * @return int value for y RETURN -1 IF ERROR
         */
        public int translateRow(String str){
		StringBuilder string = new StringBuilder(str.toUpperCase());	
                if (string.length() != 2)  {
                    System.out.println("Invalid coordinate entry");
                    return -1;
                }
                    
                else{
                    switch(string.charAt(1)){
                        case '1': return 0;
                        case '2': return 1;
                        case '3': return 2;
                        case '4': return 3;
                        case '5': return 4;
                        case '6': return 5;
                        case '7': return 6;
                        case '8': return 7;
                    }
                }
             return -1;   
	}
	
}
