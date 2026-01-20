import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(1, "Swati");
		list.add(1213);
		list.add("Pawar");
		list.add(485);
		list.add(87);
		System.out.println(list);
		{list.get(0);
		System.out.println("get method = "+list);}
		list.getFirst();
		System.out.println("get 1st method = "+list);
		list.getLast();
		System.out.println("getLast method = "+list);
		{
			list.remove(0);
			System.out.println("remove method = "+list);
		}
		{
			list.remove("swati");
			System.out.println("remove method = "+list);
		}
		list.size();
		System.out.println("Size method = "+list);
		list.contains(list);
		System.out.println("contains = "+list);
		list.indexOf(list);
		System.out.println("indexOf(list) method = "+list);
		list.isEmpty();
		System.out.println("isEmpty() method = "+list);
		list.clear();
		System.out.println("clear() method = "+list);
		list.subList(3, 1245);
		System.out.println("subList method = "+list);
		list.iterator();
		System.out.println("iterator() = "+list);
		list.listIterator();
		System.out.println("listIterator() = "+list);
		list.toArray();
		System.out.println("toArray() = "+list);

	}
}
