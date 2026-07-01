// Last updated: 7/1/2026, 10:34:39 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13
14        if(head == null || head.next == null || k==0){
15            return head;
16        }
17
18        // Find length and last node
19        ListNode tail = head;
20        int length = 1;
21
22        while(tail.next != null){
23            tail = tail.next;
24            length++;
25        }
26
27       // Reduce extra rotations
28        k = k % length;
29        if(k == 0){
30            return head;
31        }
32
33       // Make circular list
34        tail.next = head;
35        // Find new tail
36        int steps = length - k;
37
38        ListNode newTail = head;
39
40        for(int i=1; i<steps; i++){
41            newTail = newTail.next;
42        }
43
44       // New head
45        ListNode newHead = newTail.next;
46        // Break circle
47        newTail.next = null;
48
49        return newHead;
50        
51        
52    }
53}
54
55    /*
56    1. Length
57    2. Make circular
58    3. New Tail
59    4. New Head
60    5. Break Circle
61    */