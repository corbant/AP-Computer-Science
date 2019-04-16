package inheritanceLabs;

public class SortedIntList extends IntList {

	public SortedIntList(int size) {
		super(size);
	}
	
	@Override
	public void add(int value) {
		if (numElements + 1 == list.length)
		    System.out.println("Can't add, list is full");
		else {
			for(int i = 0; i <= numElements ; i++) {
				if(value < list[i] || numElements == 0 || i == numElements) {
					int temp = list[i];
					list[i] = value;
					numElements++;
					for(int j = i+1; j <= numElements; j++) {
						list[j] = temp;
						temp = list[j+1];
					}
					break;
				}
			}
		}
	}

}
