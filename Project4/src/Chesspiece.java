import java.util.*;


public abstract class Chesspiece {
	
	// 나의 팀
	private GameManager.Team myTeam;	
	public GameManager.Team getTeam() {return myTeam;}	
	
	// 나의 현재 좌표
	private Vector2 myPos;	
	public Vector2 pos() {return myPos;}

	
	// ??
	private String myCode;
	public String code() {return myCode;}
	
	
	public abstract Vector2[] MovablePos();	// 내가 움직일 수 있는 좌표
	
	//constructor
	public Chesspiece(Vector2 myPos, GameManager.Team myTeam){} 

	
//	public virtual void Move(Vector2 position) {} //나를 절대좌표 position으로 옮김 만약 내가 그곳으로 갈 수 없다면 에러 띄움 myPos변경
//	public abstract void Destroy() {}

}




/* *****************************************
 * 현재 좌표로부터 상대적인 특정 좌표로만 갈 수 있는 체스말  *
 * *************************************** */

abstract class RelativeMovePiece extends Chesspiece {

	public RelativeMovePiece(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}
	
	// 내가 상대적으로 움직일 수 있는 좌표
	protected Vector2[] relativeMovePos;
	 // relativeMovePos이용하여 계산
	public ArrayList<Vector2> MovablePos(Vector2 pos) = new ArrayList<Vector2>();
}


class King extends RelativeMovePiece{

	public King(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}
	
	public Override Destroy(){	// GameManager의 GameOver call
		GameManager.checkmate();
	}

	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	} 
}

class Knight extends RelativeMovePiece{

	public Knight(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}





/* *********************************************
 * 현재 좌표로부터 무언가에 부딪힐때까지 직선으로 움직이는 체스말 *
 * ******************************************* */

abstract class LinearMovePiece extends Chesspiece{

	public LinearMovePiece(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}
	
	protected const Vector2[] dir;
	public Override ArrayList<Vector2> MovablePos() = new ArrayList<Vector2>(); // dir 이용하여 계산
}

class Queen extends LinearMovePiece{

	public Queen(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Bishop extends LinearMovePiece{

	public Bishop(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

class Rook extends LinearMovePiece{

	public Rook(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}




class Pawn extends Chesspiece{

	public Pawn(Vector2 myPos, GameManager.Team myTeam) {
		super(myPos, myTeam);
		// TODO Auto-generated constructor stub
	}
	
	public void change(){} // 나를 퀸으로 바꿈
	public Override Move(Vector2 pos) // 움직인 다음에 내가 끝까지 왔다면 change
	


	@Override
	public Vector2[] MovablePos() {
		// TODO Auto-generated method stub
		return null;
	}
}
