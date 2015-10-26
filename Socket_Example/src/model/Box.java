package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Sean Yergensen
 */
public class Box implements Serializable {
	public static final long serialVersionUID = 1L;

	public static final int MAX_ITEMS = 4;

	private List<Item> items;

	public Box() {
	}

	public void addItem(String itemName) {
		if(items == null) {
			items = new ArrayList<>();
		}
		items.add(new Item(itemName));
	}

	public List<Item> getItems() {
		return items;
	}

	public void printItems() {
		if(items != null) {
			for (Item item : items) {
				System.out.println(item.getName());
			}
		}
	}

	private class Item implements Serializable {
		public static final long serialVersionUID = 1L;

		private String name;

		public Item(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
}















//
//
//package model;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * User: Sean Yergensen
// */
//public class Box implements Serializable {
//	public static final long serialVersionUID = 1L;
//
//	public static final int MAX_ITEMS = 6;
//
//	private List<Item> items;
//
//	public Box() {
//	}
//
//	public void addItem(String itemName) {
//		if(items == null) {
//			items = new ArrayList<>();
//		}
//		items.add(new Item(itemName));
//	}
//
//	public List<Item> getItems() {
//		return items;
//	}
//
//	public void printItems() {
//		if(items != null) {
//			for (Item item : items) {
//				System.out.println(item.getName());
//			}
//		}
//	}
//
//	private class Item implements Serializable {
//		public static final long serialVersionUID = 1L;
//
//		private String name;
//
//		public Item(String name) {
//			this.name = name;
//		}
//
//		public String getName() {
//			return name;
//		}
//	}
//}

