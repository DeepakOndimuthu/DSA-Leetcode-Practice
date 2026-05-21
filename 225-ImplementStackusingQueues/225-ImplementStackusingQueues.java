// Last updated: 5/21/2026, 11:57:17 AM
1class MyStack {
2
3    Queue<Integer> queue;
4
5    public MyStack() {
6
7        queue = new LinkedList<>();
8    }
9
10    public void push(int x) {
11
12        queue.offer(x);
13
14        int size = queue.size();
15
16        // rotate
17        for (int i = 0; i < size - 1; i++) {
18
19            queue.offer(queue.poll());
20        }
21    }
22
23    public int pop() {
24
25        return queue.poll();
26    }
27
28    public int top() {
29
30        return queue.peek();
31    }
32
33    public boolean empty() {
34
35        return queue.isEmpty();
36    }
37}
38
39/**
40 * Your MyStack object will be instantiated and called as such:
41 * MyStack obj = new MyStack();
42 * obj.push(x);
43 * int param_2 = obj.pop();
44 * int param_3 = obj.top();
45 * boolean param_4 = obj.empty();
46 */