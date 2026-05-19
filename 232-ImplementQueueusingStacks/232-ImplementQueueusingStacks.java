// Last updated: 5/19/2026, 1:33:29 PM
1class MyQueue {
2    Stack<Integer> input;
3    Stack<Integer> output;
4
5    public MyQueue() {
6
7        input = new Stack<>();
8        output = new Stack<>();
9    }
10
11    // insert
12    public void push(int x) {
13
14        input.push(x);
15    }
16
17    // remove
18    public int pop() {
19
20        shiftStacks();
21
22        return output.pop();
23    }
24
25    // first element
26    public int peek() {
27
28        shiftStacks();
29
30        return output.peek();
31    }
32
33    // empty check
34    public boolean empty() {
35
36        return input.isEmpty() && output.isEmpty();
37    }
38
39    // move elements
40    private void shiftStacks() {
41
42        if (output.isEmpty()) {
43
44            while (!input.isEmpty()) {
45
46                output.push(input.pop());
47            }
48        }
49    }
50}
51
52/**
53 * Your MyQueue object will be instantiated and called as such:
54 * MyQueue obj = new MyQueue();
55 * obj.push(x);
56 * int param_2 = obj.pop();
57 * int param_3 = obj.peek();
58 * boolean param_4 = obj.empty();
59 */