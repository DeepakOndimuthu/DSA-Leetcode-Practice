// Last updated: 6/19/2026, 4:41:27 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14
15        if(head == null || head.next == null){
16            return false;
17        }
18
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while(fast != null && fast.next != null){
23            slow = slow.next;
24            fast = fast.next.next;
25
26            if(slow == fast){
27                return true;
28            }
29
30        }
31        return false;
32    }
33}