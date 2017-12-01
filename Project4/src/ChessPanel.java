
public class ChessPanel
{
	
	private Chesspiece[][] chessPanel;
	for(int i=0;i<8;i++) { 
		for(int j=0;j<8;j++) chessPanel[i][j]=new Chesspiece(); }
	
	
	// pos에 있는 체스말 반환, 없다면 null return
	public Chesspiece getChesspiece(Vector2 pos)
	{
		return null;
	}

	public boolean move(Chesspiece piece, Vector2 pos)//piece가 pos로 이동할수있는지 체크, 만약 가능하다면 이동시키고 true반환
	{
		//CheckCheck(piece);
		return false;
	}
	
	public void Move (Chesspiece chesspiece, Vector2 pos) { // chesspiece를 pos로 옮김
		
	}
	
	private boolean checkCheck(Chesspiece piece)//piece가 다음에 갈 수 있는 위치에 적 킹 있는지 판단
	{
		return false;
	}
}
