package test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public int return7() {
		return 7;
	}

	public int callFunction() {
		return return7();
	}

	public int callFunction10x() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += return7();
		}
		return sum;
	}

	public void uncaughtException() {
		List<String> test = new ArrayList<>();
		test.get(0);
	}

	public boolean caughtException() {
		try {
			int test = 3 / 0;
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int functionWithSwitch() {
		int res = 0;
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				break;
			case 1:
				break;
			case 3:
				res++;
			default:
				res = 0;
			}
		}
		return res;

	}

}
