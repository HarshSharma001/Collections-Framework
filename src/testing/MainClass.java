package testing;

import rootLevelInterfaces.childLevelInterfaces.listConcreteImplementations.*;

public class MainClass {
	public static void main(String[] args) throws Exception {
		try {
//			MyConcreteSet set = new MyConcreteSet("int");
//			set.add(10);
//			set.add(20);
//			set.add(30);
//			set.add(40);
//			set.add(45);
//			set.print();
//			
//			
//			MyConcreteSet set1 = new MyConcreteSet("int");
//			set1.add(10);
//			set1.add(20);
//			set1.add(30);
//			set1.add(40);
//			set1.add(45);
//			set1.add(23);
//			set1.add(25);
//			set1.add(76);
//			set1.add(42);
//			set1.add(65);
//			set1.print();
//			
//			Object[] arr = set.findIntersection(set1);
//			
//			for(Object o: arr) {
//				System.out.print(o+" ");
//			}
			
//			MyArrayList arraylist = new MyArrayList("int");
//			arraylist.add(10);
//			arraylist.add(20);
//			arraylist.add(30);
//			arraylist.add(8);
//			arraylist.print();
//
//			
//			MyArrayList arraylist1 = new MyArrayList("int");
//			arraylist1.add(10);
//			arraylist1.add(20);
//			arraylist1.add(30);
//			arraylist1.print();
//			
//			Object[] arr = arraylist.retainAll(arraylist1);
//			arraylist.printArray(arr);
			
//			MyStack stack = new MyStack("int");
//			stack.push(50);
//			stack.push(40);
//			stack.push(30);
//			stack.push(20);
//			stack.push(10);	
//			stack.print();
//			
//			stack.add(60);
//			System.out.println(stack.contains(70));
//			System.out.println(stack.get(stack.size()-1));
//			System.out.println(stack.indexOf(20));
//			System.out.println(stack.peek());
//			System.out.println(stack.max());
//			stack.remove(stack.size()-1);
//			
//			MyStack stack1 = new MyStack("int");
//			stack1.push(20);
//			stack1.push(50);
//			stack1.push(80);
//			System.out.println(stack.containsAll(stack1));
//			stack.print();
//			Object arr[] = stack.retainAll(stack1);
//			for(Object o: arr) {
//				System.out.print(o+" ");
//			}

//			MyLinkedList linkedList = new MyLinkedList("int");
//			linkedList.add(10);
//			linkedList.add(20);
//			linkedList.add(30);
//			linkedList.add(40);
//			linkedList.add(50);
//			linkedList.print();
//
//			linkedList.append(60);
//
//			System.out.println(linkedList.contains(40));
//			System.out.println(linkedList.get(3));
//			System.out.println(linkedList.indexOf(50));
//			linkedList.remove(4);
//			linkedList.print();
//
//			linkedList.set(3, 70);
//			System.out.println(linkedList.isEmpty());
//			System.out.println(linkedList.size());
//			Object[] arr = linkedList.subList(2, linkedList.size() - 1);
//			for (Object o : arr) {
//				System.out.print(o + " ");
//			}
//			System.out.println();
//			linkedList.print();
//
//			MyLinkedList link1 = new MyLinkedList("int");
//			link1.add(10);
//			link1.add(70);
//
//			System.out.println(linkedList.containsAll(link1));
//			arr = linkedList.retainAll(link1);
//			for (Object o : arr) {
//				System.out.print(o + " ");
//			}
//			System.out.println();
//			
//			arr = linkedList.toArray();
//			for (Object o : arr) {
//				System.out.print(o + " ");
//			}
			
//			NormalQueue queue = new NormalQueue("int");
//			queue.add(10);
//			queue.add(20);
//			queue.add(30);
//			queue.add(40);
//			queue.add(50);
//			
//			queue.print();
//			queue.remove(10);
//			queue.print();
//			queue.add(60);
//			queue.add(70);
//			queue.add(80);
//			queue.print();
//			System.out.println("max of the queue is : "+queue.max());
//			queue.clear();
//			System.out.println("queue size is = "+queue.size());
//			queue.print();
//			System.out.println(queue.contains(50));
//			System.out.println(queue.isEmpty());
//			
//			
//			MyArrayList arraylist = new MyArrayList("int");
//			arraylist.add(30);
//			arraylist.add(80);
//			System.out.println(queue.containsAll(arraylist));
			
			
			MyCircularQueue cqueue = new MyCircularQueue("int");
			cqueue.add(10);
			cqueue.add(20);
			cqueue.add(30);
			cqueue.add(40);
			cqueue.add(50);
			cqueue.add(60);
			cqueue.add(70);
			cqueue.add(80);
			
			cqueue.print();
			cqueue.remove(10);
			cqueue.remove(20);
			cqueue.add(90);
			cqueue.add(100);
			cqueue.add(110);
			cqueue.add(120);
			cqueue.add(130);
			cqueue.add(140);
			cqueue.print();
			System.out.println("max of queue is : "+cqueue.max());
			
			
//			MyPriorityQueue pqueue = new MyPriorityQueue("int", 1);
//			pqueue.add(1);
//			pqueue.add(10);
//			pqueue.add(3);
//			pqueue.add(4);
//			pqueue.add(2);
//			
//			pqueue.add(9);
//			pqueue.add(10);
//			pqueue.add(7);
//			pqueue.add(6);
//			pqueue.add(8);
//			pqueue.add(5);
//			
//			pqueue.print();
//			System.out.println(pqueue.max());
//			
//			pqueue.poll();
//			pqueue.print();
//			System.out.println("head of the queue is = "+pqueue.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
