package datastructures;

public class HeapMinMax {
	
	private int heapSize;
	private int[] heapArray;
	private boolean isMax;
	
	public HeapMinMax(boolean isMax) {
		this.heapSize = 0;
		this.isMax = isMax;
		this.heapArray = new int[10];
	}
	
	public void insert(int element) {
		if(this.heapSize+1 > this.heapArray.length) {
			this.doubleSize();
		}
		this.heapSize++;
		
		heapArray[this.heapSize] = element;
		
		for(int pos = this.heapSize/2; pos >= 0; pos--) {
			this.heapify(pos);
		}
	}
	
	public Integer remove() {
		if(this.isEmpty()) {
			return null;
		}
		
		int head = this.heapArray[0];
		
		//now move the last element to the front
		this.heapArray[0] = this.heapArray[heapSize];
		this.heapSize--;
		heapify(0);
		
		return head;
	}
	
	public boolean isEmpty() {
		if(this.heapSize > 0) {
			return false;
		}
		return true;
	}
	
	private void doubleSize() {
		int[] newHeap = new int[this.heapArray.length*2];
		
		for(int k = 0; k < heapArray.length; k++) {
			newHeap[k] = this.heapArray[k];
		}
		
		this.heapArray = newHeap;
	}
	
	
	//returns the value
	private void heapify(int pos) {
		//We only rearrange if the value is not a leaf
		if(!this.isLeaf(pos)) {
			if(this.isMax) {
				this.heapifyMax(pos);
			}
			else {
				this.heapifyMin(pos);
			}
		}
	}
	
	//sorts for min heap
	private void heapifyMin(int pos) {
		int leftPos 	= this.leftChild(pos);
		int rightPos 	= this.rightChild(pos);
		
		int leafVal 		= this.heapArray[pos];
		int leftChildVal 	= this.heapArray[leftPos];
		int rightChildVal 	= this.heapArray[rightPos];
		
		//Check if the current node is greater than its child
		if(leafVal > leftChildVal || leafVal > rightChildVal) {
			
			//If it is a swap must happen, but against the lower child
			if(leftChildVal < rightChildVal) {
				this.swap(pos, leftPos);
				this.heapifyMin(leftPos);
			}
			else {
				this.swap(pos, rightPos);
				this.heapifyMin(rightPos);
			}
		}
	}
	
	//sorts for max heap
	private void heapifyMax(int parent) {
		//Check if the current node is smaller than its child
		int leftPos = this.leftChild(parent);
		int rightPos = this.rightChild(parent);
		
		int parentVal 		= this.heapArray[parent];
		int leftChildVal 	= this.heapArray[leftPos];
		int rightChildVal 	= this.heapArray[rightPos];
		
		//Check if the current node is less than its child
		if(parentVal < leftChildVal || parentVal < rightChildVal) {
			
			//If it is a swap must happen, but against the greater child
			if(leftChildVal > rightChildVal) {
				this.swap(parent, leftPos);
				this.heapifyMax(leftPos);
			}
			else {
				this.swap(parent, rightPos);
				this.heapifyMax(rightPos);
			}
		}
	}
	
	//swapper
	private void swap(int parentPos, int childPos) {
		int temp = this.heapArray[parentPos];
		this.heapArray[parentPos] = this.heapArray[childPos];
		this.heapArray[childPos]  = temp;
	}

	
	private int leftChild(int pos) {
		return 2*pos;
	}
	
	private int rightChild(int pos) {
		return 2*pos+1;
	}
	
	private boolean isLeaf(int pos) {
		//basically if its in the second half of the array, its a leaf, if not, it isnt
		if(pos >= (this.heapSize/2) && pos <= heapSize) {
			return true;
		}
		return false;
	}
	
}
