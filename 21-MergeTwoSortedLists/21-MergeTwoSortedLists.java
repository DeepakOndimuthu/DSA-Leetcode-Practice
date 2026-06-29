// Last updated: 6/29/2026, 11:55:43 AM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode dummy = new ListNode(0);
14        ListNode tail = dummy;
15
16        while(list1 != null && list2 != null){
17            if(list1.val <= list2.val){
18                tail.next = list1; // add list1 to tail node
19                list1 = list1.next; // move one point next
20            }else{
21                tail.next = list2; // add list2 to tail node
22                list2 = list2.next; // move one point next
23            }
24
25            tail = tail.next; // move tail one step next (0 to 10 first time) 
26        }
27
28        if(list1 != null){
29            tail.next = list1; // add pending list node to tail last
30        }else{
31            tail.next = list2; // add pending list node to tail last
32        }
33
34        return dummy.next;
35        
36    }
37}