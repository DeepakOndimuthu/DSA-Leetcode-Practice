// Last updated: 7/4/2026, 12:16:38 PM
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
12    public ListNode sortList(ListNode head) {
13
14        if(head == null || head.next == null){
15            return head;
16        }
17
18        ListNode slow = head;
19        ListNode fast = head.next;
20
21        while(fast != null && fast.next != null){
22            slow = slow.next;
23            fast = fast.next.next;
24        }
25
26        ListNode second = slow.next;
27        slow.next = null;
28        ListNode left = sortList(head);
29        ListNode right = sortList(second);
30
31        return merge(left, right);
32        
33    }
34
35    public static ListNode merge(ListNode list1, ListNode list2){
36
37        ListNode dummy = new ListNode(0);
38        ListNode tail = dummy;
39
40        while(list1 != null && list2 != null){
41            if(list1.val <= list2.val){
42                tail.next = list1;
43                list1 = list1.next;
44
45            }else{
46                tail.next = list2;
47                list2 = list2.next;
48            }
49            tail = tail.next;
50        }
51
52        if(list1 != null){
53            tail.next = list1;
54        }else{
55            tail.next = list2;
56        }
57
58        return dummy.next;
59    }
60}