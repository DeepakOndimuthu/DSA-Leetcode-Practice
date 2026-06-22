// Last updated: 6/22/2026, 12:49:27 PM
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
12    public void reorderList(ListNode head) {
13
14        if(head == null || head.next == null){
15            return;
16        }
17
18        //  Find middle
19        ListNode slow = head;
20        ListNode fast = head;
21
22        while(fast.next != null && fast.next.next != null){
23            slow = slow.next;
24            fast = fast.next.next;
25        }
26
27       // Reverse second half
28        ListNode previous = null;
29        ListNode current = slow.next;
30        slow.next = null;
31
32        while(current != null){
33            ListNode next = current.next;
34            current.next = previous;
35            previous = current;
36            current = next;
37        }
38
39        // Merge two halves
40        ListNode first = head;
41        ListNode second = previous;
42
43        while(second != null){
44            
45            ListNode firstNext = first.next;
46            ListNode secondNext = second.next;
47
48            first.next = second;
49            second.next = firstNext;
50
51            first = firstNext;
52            second = secondNext;
53        }
54        
55    }
56}