// Last updated: 7/2/2026, 4:18:48 PM
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
13    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
14        ListNode dummy = new ListNode(0);
15        ListNode tail = dummy;
16
17        while(list1 != null && list2 != null){
18            if(list1.val <= list2.val){
19                tail.next = list1;
20                list1 = list1.next;
21
22            }else{
23                tail.next = list2;
24                list2 = list2.next;
25            }
26            tail = tail.next;
27        }
28
29        if(list1 != null){
30            tail.next = list1;
31        }else{
32            tail.next = list2;
33        }
34        return dummy.next;
35
36    }
37    public ListNode mergeKLists(ListNode[] lists) {
38        if(lists == null || lists.length == 0){
39            return null;
40        }
41        ListNode result = lists[0];
42        for(int i=1; i < lists.length; i++){
43            result = mergeTwoLists(result, lists[i]);
44        }
45
46        return result;
47        
48    }
49}