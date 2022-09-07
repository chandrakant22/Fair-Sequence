package tcs;

import java.util.ArrayList;
import java.util.Scanner;

public class Answer1 {
	
	
	static void fairSequence(int a[],ArrayList<Integer> sequence,boolean b)
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				if (b == true) {
					sequence.add(a[i]);
					b = false;
				}
			} else {
				if (b == false) {
					sequence.add(a[i]);
					b = true;
				}
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;

		// user input N
		N = sc.nextInt();

		int a[] = new int[N];

		// user input array element
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		ArrayList<Integer> sequence = new ArrayList<>();

		if (a[0] > 0) {
			boolean b = true;
			fairSequence(a, sequence, b);

		}

		else {
			boolean b = false;
			fairSequence(a, sequence, b);
		}

		// sum
		int sum = 0;
		for (int s : sequence) {
			sum += s;
		}

		System.out.println(sum);

	}

}
