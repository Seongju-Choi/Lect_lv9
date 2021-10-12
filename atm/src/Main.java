

import controller.BankManager;

/*
 * atm 
 * 
 * 1. 회원가입/탈퇴 ⭕️❌
 * 2. 로그인 
 * 3. 계좌개설/철회 (회원당 3개 계좌 제한) 
 * 4. 뱅킹기능 (입금/출금/이체/조회) 
 * 5. 파일처리 (저장/로드)
 * 6. 관리자모드 (admin/0000 -> 전체유저조회/전체계좌조회 
 */

public class Main {
	public static void main(String args[]) {
		
		BankManager.instance.run();
	}
}
