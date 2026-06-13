//package stack;
//
//public class minElmInStack {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//class MinStack {
//    
//	   
//    public MinStack() {
//        
//    }
//
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> minSt = new Stack<>();
//    
//    public void push(int value) {
//     st.push(value);
//     if(minSt.isEmpty()){
//        minSt.push(value);
//     }
//     else if(minSt.peek() >= value){
//     minSt.push(value);
//    }
//  }
//
//    public void pop() {
//      int popElm = st.pop();
//        if(popElm == minSt.peek()){
//            minSt.pop();
//        }
//    }
//    
//    public int top() {
//        return st.peek();
//    }
//    
//    public int getMin() {
//        return minSt.peek();
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(value);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */