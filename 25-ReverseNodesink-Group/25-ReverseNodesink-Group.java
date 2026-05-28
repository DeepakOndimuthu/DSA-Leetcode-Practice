// Last updated: 5/28/2026, 1:02:51 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13
14        if(head == null || k == 1){
15            return head;
16        }
17
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20        ListNode previousGroup = dummy;
21
22        while(true){
23            ListNode kth = previousGroup;
24            for(int i=0; i < k; i++){
25                kth = kth.next;
26                if(kth == null){
27                    return dummy.next;
28                }
29            }
30
31            ListNode groupNext = kth.next;
32            ListNode previous = groupNext;
33            ListNode current = previousGroup.next;
34
35            while(current != groupNext){
36                ListNode next = current.next;
37                current.next = previous;
38                previous = current;
39                current = next;
40            }
41
42            ListNode temp = previousGroup.next;
43            previousGroup.next = kth;
44            previousGroup = temp;
45        }
46        
47    }
48}