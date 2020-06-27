package controller;

import action.Action;
import action.member.MemberInsertAction;

public class MemberActionFactory {
	private MemberActionFactory() {}
	
	private static MemberActionFactory instrance = 
			new MemberActionFactory();
	
	public static MemberActionFactory getInstance() {
		return instrance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("member")) {
			action = new MemberInsertAction();
		}
		return action;
	}
	
}
