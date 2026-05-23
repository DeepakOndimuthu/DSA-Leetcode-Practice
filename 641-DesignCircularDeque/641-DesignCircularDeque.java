// Last updated: 5/23/2026, 1:25:43 PM
1class MyCircularDeque {
2    int [] deque;
3    int front;
4    int rear;
5    int size;
6
7    public MyCircularDeque(int k) {
8        deque = new int[k];
9        front =0;
10        rear = 0;
11        size =0;
12        
13    }
14    
15    public boolean insertFront(int value) {
16        if(isFull()){
17            return false;
18        }
19        front = (front - 1 + deque.length) % deque.length;
20        deque[front] = value;
21        size++;
22        return true;
23        
24    }
25    
26    public boolean insertLast(int value) {
27         if(isFull()){
28            return false;
29        }      
30        deque[rear] = value;
31        rear = (rear + 1) % deque.length;
32        size++;
33        return true;
34        
35    }
36    
37    public boolean deleteFront() {
38         if(isEmpty()){
39            return false;
40        }
41        front = (front + 1) % deque.length;
42        size--;
43        return true;
44        
45    }
46    
47    public boolean deleteLast() {
48         if(isEmpty()){
49            return false;
50        }
51        rear = (rear - 1 + deque.length) % deque.length;
52        size--;
53        return true;
54        
55    }
56    
57    public int getFront() {
58         if(isEmpty()){
59            return -1;
60        }
61
62        return deque[front];
63        
64    }
65    
66    public int getRear() {
67         if(isEmpty()){
68            return -1;
69        }
70        int index = (rear - 1 + deque.length) % deque.length;
71        return deque[index];
72        
73    }
74    
75    public boolean isEmpty() {
76        return size == 0;
77        
78    }
79    
80    public boolean isFull() {
81        return size == deque.length;
82        
83    }
84}
85
86/**
87 * Your MyCircularDeque object will be instantiated and called as such:
88 * MyCircularDeque obj = new MyCircularDeque(k);
89 * boolean param_1 = obj.insertFront(value);
90 * boolean param_2 = obj.insertLast(value);
91 * boolean param_3 = obj.deleteFront();
92 * boolean param_4 = obj.deleteLast();
93 * int param_5 = obj.getFront();
94 * int param_6 = obj.getRear();
95 * boolean param_7 = obj.isEmpty();
96 * boolean param_8 = obj.isFull();
97 */