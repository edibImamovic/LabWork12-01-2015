package com.bitcamp.stack.queues.ADT;

public class TestStack {

	public static void main(String[] args) {
		
		StackInt stc = new StackInt();
		
		stc.push(2);
		stc.push(23);
		stc.push(233);
		stc.push(24);
		stc.push(25);
		stc.push(25555);
		
		System.out.println(stc.peek());
		
		
		System.out.println(stc.contains(223));
	}

}
