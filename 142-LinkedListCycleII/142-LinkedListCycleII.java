// Last updated: 6/23/2026, 12:41:02 PM
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
13    public ListNode detectCycle(ListNode head) {
14
15        if(head == null || head.next == null){
16            return null;
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
27
28                ListNode start = head;
29
30                while(start != slow){
31
32                    start = start.next;
33                    slow = slow.next;
34
35                }
36                
37                return start;
38            }
39
40        }
41        return null;
42    }
43}