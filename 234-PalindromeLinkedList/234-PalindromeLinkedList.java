// Last updated: 6/18/2026, 2:33:53 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public boolean isPalindrome(ListNode head) {
13
14        if (head == null || head.next == null) {
15            return true;
16        }
17
18        // Find Middle
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while(fast != null  && fast.next != null){
23            slow = slow.next;
24            fast = fast.next.next;
25        }
26
27        // Reverse
28        ListNode previous = null;
29        ListNode current = slow;
30
31        while( current != null){
32            ListNode next = current.next;
33            current.next = previous;
34            previous = current;
35            current = next;
36        }
37
38        // Compare
39        ListNode firstHalf = head;
40        ListNode secondHalf = previous;
41
42        while(secondHalf != null){
43            if(firstHalf.val != secondHalf.val){
44                return false;
45            }
46            firstHalf = firstHalf.next;
47            secondHalf = secondHalf.next;
48        }
49        return true;
50        
51    }
52}