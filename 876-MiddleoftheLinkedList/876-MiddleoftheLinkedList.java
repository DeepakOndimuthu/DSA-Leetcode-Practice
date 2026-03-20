// Last updated: 3/20/2026, 2:32:03 PM
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
12    public ListNode middleNode(ListNode head) {
13          ListNode slow = head;
14        ListNode fast = head;
15
16        while (fast != null && fast.next != null) {
17            slow = slow.next;         // 1 step
18            fast = fast.next.next;    // 2 steps
19        }
20
21        return slow;
22    }
23}
24
25/*
26    Linked list:
27    1 → 2 → 3 → 4 → 5
28
29    Actually in memory:
30
31    [1 | next → node2]
32    [2 | next → node3]
33    [3 | next → node4]
34    [4 | next → node5]
35    [5 | next → null]
36
37    ListNode slow = head;
38    head is first node (1)
39    slow → node(1)
40
41    What is .next?
42    slow = slow.next;
43
44    move to next node
45    1 → 2 → 3 → 4 → 5
46        ↑
47        slow
48
49    return slow → 3 
50    slow is NOT just value 3
51    slow is node(3)
52
53    And node(3) has:
54
55    value = 3
56    next → node(4)
57
58    And node(4):
59
60    value = 4
61    next → node(5)
62
63    3 → 4 → 5
64    Because nodes are linked
65
66    while condition time
67    fast = 5
68    fast.next = null
69    fast.next != null ❌ false
70    Loop stops
71*/