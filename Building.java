package zoho;

import java.util.Scanner;

public class Building {

	public static void main(String[] args) throws Exception{
		System.out.println("Before Exception");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
	    sc.close();
		try {
			int j=n/0;
		}catch (Exception e) {
			e.printStackTrace(); // this show what kind of exception arise.
		}
		System.out.println("After Exception");
	}

}
//	public static void main(String[] args) {
//		 Room roomA = new RoomA();
//	        Room roomB = new RoomB();
//	        
//	        String[] people = { "p4", "p5", "p6" };
//	        int[] capacities = {  };
//
//	        // Initialize and interact with RoomA
//	        try {
//	            roomA.roomCapacity(people, capacities);
//	            roomA.removePerson("p1");
//	            roomA.addPerson("p7");
//	        } catch (ArrayIndexOutOfBoundsException e) {
//	            System.out.println("Exception: " + e.getMessage());
//	        }
//
//	        // Initialize and interact with RoomB
//	        try {
//	            roomB.roomCapacity(people, capacities);
//	            roomB.addPerson("p8");
//	        } catch (ArrayIndexOutOfBoundsException e) {
//	            System.out.println("Exception: " + e.getMessage());
//	        }
//	    }
//	}


	abstract class Room {
		private final String name;
		private final int[] capacity;
		private String[] allocatedPeople;

		public Room(String name, int capacity, String[] person) {
			this.name = name;
			this.capacity = new int[capacity];
			this.allocatedPeople = person;
		}

		public String[] getAllocatedPeople() {
			return allocatedPeople;
		}

		public void setAllocatedPeople(String[] allocatedPeople) {
			this.allocatedPeople = allocatedPeople;
		}

		public String getName() {
			return name;
		}

		public int[] getCapacity() {
			return capacity;
		}

		public  void roomCapacity(String[] person, int[] capacity) {
			if(this.getAllocatedPeople().equals(getCapacity())) {
				
			}
		}

		public abstract boolean isRoomFull();

		public  void removePerson(String person) {
			
		}

		public  void addPerson(String person) {
			
		}
	}

	class RoomA extends Room {
		public RoomA() {
			super("RoomA", 10, new String[] { "p1", "p11", "p21" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}


		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomB extends Room {
		public RoomB() {
			super("RoomB", 10, new String[] { "p2", "p12", "p22" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomC extends Room {
		public RoomC() {
			super("RoomC", 10, new String[] { "p3", "p13", "p23" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomD extends Room {
		public RoomD() {
			super("RoomD", 10, new String[] { "p4", "p14", "p24" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomE extends Room {
		public RoomE() {
			super("RoomE", 10, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomF extends Room {
		public RoomF() {
			super("RoomF", 10, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomG extends Room {
		public RoomG() {
			super("RoomG", 10, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomH extends Room {
		public RoomH() {
			super("RoomH", 10, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomI extends Room {
		public RoomI() {
			super("RoomI", 10, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}
	}

	class RoomJ extends Room {
		public RoomJ() {
			super("RoomJ", 5, new String[] { "p1", "p2", "p3" });
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		@Override
		public void addPerson(String person) {
			if (isRoomFull()) {
				throw new ArrayIndexOutOfBoundsException(getName() + " is full. Cannot add more people.");
			}

			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] == null) {
					getAllocatedPeople()[i] = person;
					System.out.println("Added " + person + " to " + getName());
					return;
				}
			}
		}

	}
	
	class RoomK extends Room {
		public RoomK() {
			super("RoomK", 1, new String[] { "p1"});
		}

		@Override
		public void roomCapacity(String[] person, int[] capacity) {
			if (person.length <= getCapacity()[0]) {
				System.out.println(getName() + " has a capacity for more people:");
				for (int i = 0; i < person.length; i++) {
					addPerson(person[i]);
					System.out.println("Allocating " + person[i] + " with capacity " + capacity[i]);
				}
			} else {
				throw new ArrayIndexOutOfBoundsException(
						"Capacity of " + getName() + " is full. Move to the next room.");
			}
		}

		@Override
		public boolean isRoomFull() {
			for (String person : getAllocatedPeople()) {
				if (person == null) {
					return false;
				}
			}
			return true;
		}

		@Override
		public void removePerson(String person) {
			for (int i = 0; i < getAllocatedPeople().length; i++) {
				if (getAllocatedPeople()[i] != null && getAllocatedPeople()[i].equals(person)) {
					getAllocatedPeople()[i] = null;
					System.out.println("Removed " + person + " from " + getName());
					return;
				}
			}
			System.out.println(person + " not found in " + getName());
		}

		
	}
	
