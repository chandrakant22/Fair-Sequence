# Fair-Sequence
You are given an array A of size N. Your friend gave an amazing task for you. Your friend likes one type of sequence.So, he called that type of sequence a fair sequence.  You should select a fair sequence of maximum length from an array.
Here a fair-sequence is nothing, but you have to select elements in a pattern like positive element, negative element, positive element,... 
(or) negative element, positive element, negative element,... to form a Sequence.

Your task is to print the maximum sum of elements
possible by selecting a fair subsequence with maximum length.

Ex: If array A = [-1, 18, 13, 18, -2, -16,7,-1,-213, 11]. Here your maximum length can be 6. 
The fair subsequence is -1, 18,-2, 7, -1, 11. The Sum is 32 which is the maximum possible.

Your friend also kept a timer of 15 min. If you solve it in time, you will win. Will you be able to do it?

<b>NOTE: You should select the elements in a fair sequence only.</b>

Example - 1:

Input:
5  -- N (Number of elements in an array) 
21 12 13 -21 -2   -- Array A consists of N elements 161 232

Output:
0

Explanation:

Here you can select 21, -21 subsequences of maximum length 2.
The sum is 0 which is the maximum possible for a fair subsequence of length 2.


Example - 2:

Input:
2 
-153 -689

Output:
-153

Explanation:

Here you can select -153 subsequences of maximum length 1.
The sum is -153 which is the maximum possible for a fair subsequence of length 1.
