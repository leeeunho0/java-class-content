
class 댓글{
	public String 작성자, 내용;
	private int 신고횟수 =0;
	
	public 댓글(String 작성자, String 내용) {
		this.작성자 = 작성자;
		this.내용 = 내용;
		
	}
	public void 신고하기() {
		this.신고횟수 +=1;
		System.out.println("신고접수됨.(누적 "+this.신고횟수 + "회)" );
		
		if(this.신고횟수 >= 5) {
			this.내용 = "삭제된 댓글입니다.";
			System.out.println("이 댓글은 신고 누적으로 숨김 처리되었습니다.");
		}
	}
	
}

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
