// Last updated: 5/27/2026, 12:47:35 PM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13
14        if(head == null || left == right){
15            return head;
16        }
17
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20        ListNode previous = dummy;
21
22        for(int i =1; i < left; i++){
23            previous = previous.next;
24        }
25        ListNode current = previous.next;
26
27        for(int i =0; i < right-left; i++){
28            ListNode next = current.next;
29            current.next = next.next;
30            next.next = previous.next;
31            previous.next = next;
32        }
33
34        return dummy.next;
35        
36    }
37}