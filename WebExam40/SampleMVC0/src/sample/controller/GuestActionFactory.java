package sample.controller;

import sample.action.Action;
import sample.action.guest.GuestListAction;
import sample.action.guest.GuestModifyAction;
import sample.action.guest.GuestModifyProAction;
import sample.action.guest.GuestViewAction;
import sample.action.guest.GuestWriteAction;
import sample.action.guest.GuestWriteProAction;
public class GuestActionFactory {
	private GuestActionFactory() {}
	private static GuestActionFactory instance = new GuestActionFactory();
	public static GuestActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		if(command.equals("guest_list")) {
			action = new GuestListAction();
		}else if(command.equals("guest_view")) {
			action = new GuestViewAction();
		}else if(command.equals("guest_write")) {//등록폼
			action = new GuestWriteAction();//등록 실제 처리
		}else if(command.equals("guest_write_pro")) {
			action = new GuestWriteProAction();
		}else if(command.equals("guest_modify")) {
			action = new GuestModifyAction();
		}else if(command.equals("guest_modify_pro")) {
			action = new GuestModifyProAction();
		}
		return action;
	}
}