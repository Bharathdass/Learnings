package mrng;

public class Helpline911 {

	
		public void handle(Dogs d) {
			System.out.println("I will handle dog problems...");
		}
		public void handle(Tiger t) {
			System.out.println("I will handle tiger problem...");
		}
		public void handle(OfficeBoy ob) {
			System.out.println("i will handle officeboy problem...");
		}
		
	}
	class Operator{
		public void connect(Item i) {
			i.connect();
		}
	}
	abstract class Item{abstract void connect();}
	class Dogs extends Item{
		void connect() {new Helpline911().handle(this);}
	}
	class Tiger extends Item{
		void connect() {new Helpline911().handle(this);}
	}
	class OfficeBoy extends Item{
		void connect() {new Helpline911().handle(this);}
	}

