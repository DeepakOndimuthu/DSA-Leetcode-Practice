// Last updated: 5/13/2026, 4:38:43 PM
1class MyCircularQueue {
2    int [] queue;
3    int front;
4    int rear;
5    int size;
6
7    public MyCircularQueue(int k) {
8        queue = new int[k];
9        front = 0;
10        rear = 0;
11        size = 0;
12        
13    }
14    
15    public boolean enQueue(int value) {
16        if(isFull()){
17            return false;
18        }
19        
20        queue[rear] = value;
21        rear = (rear + 1) % queue.length;
22        size++;
23
24        return true;
25        
26    }
27    
28    public boolean deQueue() {
29        if(isEmpty()){
30            return false;
31        }
32        front = (front + 1) % queue.length;
33        size--;
34
35        return true;
36        
37    }
38    
39    public int Front() {
40        if(isEmpty()){
41            return -1;
42        }
43        return queue[front];
44        
45    }
46    
47    public int Rear() {
48        if(isEmpty()){
49            return -1;
50        }
51
52        int index = (rear - 1 + queue.length) % queue.length;
53        return queue[index];
54    }
55    
56    public boolean isEmpty() {
57        return size == 0;
58        
59    }
60    
61    public boolean isFull() {
62        return size == queue.length;
63        
64    }
65}
66
67/**
68 * Your MyCircularQueue object will be instantiated and called as such:
69 * MyCircularQueue obj = new MyCircularQueue(k);
70 * boolean param_1 = obj.enQueue(value);
71 * boolean param_2 = obj.deQueue();
72 * int param_3 = obj.Front();
73 * int param_4 = obj.Rear();
74 * boolean param_5 = obj.isEmpty();
75 * boolean param_6 = obj.isFull();
76 */