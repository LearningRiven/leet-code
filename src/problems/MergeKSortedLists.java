package problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	
	public class Element implements Comparator<Element>{
		int curVal;
		int headVal;
		List<Integer> list;
		
		public Element() {
			
		}
		
		public Element(int curVal, int headVal, List<Integer> list) {
			this.curVal 	= curVal;
			this.headVal 	= headVal;
			this.list 		= list;
		}

		@Override
		public int compare(Element e1, Element e2) {
			if(e1.curVal > e2.curVal) {
				return 1;
			}
			if(e1.curVal < e2.curVal) {
				return -1;
			}
			return 0;
		}
		
	}
	
	public List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
		List<Integer> res = new ArrayList<Integer>();
		PriorityQueue<Element> heap = new PriorityQueue<Element>(lists.size(), new Element());
		
		//Add the first element
		for(int k = 0; k < lists.size(); k++) {
			Element e = new Element(lists.get(k).get(0), 0, lists.get(k));
			heap.add(e);
		}
		
		//Continue adding and removing
		while(!heap.isEmpty()) {
			//Grab the lowest value
			Element e = heap.poll();
			
			//Only add if it doesnt yet exist in our answer
			if(!res.contains(e.curVal)) {
				res.add(e.curVal);
			}
			
			//Update the head
			int headVal = e.headVal + 1; 
			
			//Check to see if the list is empty
			if(headVal < e.list.size()) {
				//If it isnt, we add the next element from it
				Element next = new Element(e.list.get(headVal), headVal, e.list);
				heap.add(next);
			}
		}
		
		return res;
	}
	
	public List<Integer> mergeKSortedListsBrute(List<List<Integer>> lists) {
		List<Integer> res = new ArrayList<Integer>();	
		PriorityQueue<Integer> brute = new PriorityQueue<Integer>();
		
		int ls = lists.size();
		
		for(var k = 0; k < ls; k++) {
			brute.addAll(lists.get(k));
		}
		
		while(!brute.isEmpty()) {
			if(!res.contains(brute.peek())) {
				res.add(brute.poll());
			}
			else {
				brute.poll();
			}
		}
		
        return res;
    }
}
