class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(q1.isEmpty())
            q1.add(x);
        else
        {
            q2.add(x);
            q2.addAll(q1);
            q1.clear();
            q1.addAll(q2);
            q2.clear();
        }
    }
    
    public int pop() {
        if(q1.isEmpty())
            return -1;
        return q1.remove();
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}