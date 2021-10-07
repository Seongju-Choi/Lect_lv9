package model;

import controller.BankManager;

/*
	 * 1.로그인
	 * 2.회원가입
	 * 3.개좌개설/철회
	 * 4.은행업무(입금,출금,계좌이체,조회)
	 * 5.
	 */

public class Main {
	public static void main(String args[]) {
		
		BankManager.instance.run();
	}
}
