// Last updated: 5/25/2026, 2:22:58 PM
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
12     
13    public ListNode removeElements(ListNode head, int val) {
14        // remove matching nodes from beginning
15        while (head != null && head.val == val) {
16
17            head = head.next;
18        }
19
20        ListNode  current = head;
21
22        while (current != null &&
23                current.next != null) {
24
25            if (current.next.val == val) {
26                // skip node
27                current.next = current.next.next;
28            } else {
29                current =current.next;
30            }
31        }
32
33        return head;
34        
35    }
36}