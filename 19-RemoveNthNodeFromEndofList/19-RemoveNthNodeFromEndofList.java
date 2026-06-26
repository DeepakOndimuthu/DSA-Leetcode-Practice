// Last updated: 6/26/2026, 2:46:08 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode slow = dummy;
17        ListNode fast = dummy;
18
19        // Move fast n+1 steps
20        for(int i=0; i<=n ; i++){
21            fast = fast.next;
22        }
23
24        // Move both pointers
25        while(fast != null){
26            slow = slow.next;
27            fast = fast.next;
28        }
29
30        // Remove target node
31        slow.next = slow.next.next;
32
33        return dummy.next;
34        
35    }
36}