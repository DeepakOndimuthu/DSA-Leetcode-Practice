// Last updated: 7/1/2026, 11:58:16 AM
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
12    public ListNode partition(ListNode head, int x) {
13
14        ListNode samllDummy = new ListNode(0);
15        ListNode largeDummy = new ListNode(0);
16
17        ListNode samll = samllDummy;
18        ListNode large = largeDummy;
19
20        while(head != null){
21            if(head.val < x){
22                samll.next = head;
23                samll = samll.next; // Move to the next node.
24            }else{
25                large.next = head;
26                large = large.next; // Move to the next node.
27            }
28            head = head.next; // Move to the next one step.
29        }
30
31        large.next = null;
32        samll.next = largeDummy.next;
33        return samllDummy.next;
34        
35    }
36}