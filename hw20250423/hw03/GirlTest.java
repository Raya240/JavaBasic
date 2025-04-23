package hw03;

public class GirlTest {
	public static void main(String[] args) {
		
		Girl[] girls = {
				new Girl("raya"),
				new GoodGirl ("feya"),
				new BestGirl("anna")
		};
		
		for (Girl g : girls) {
			g.show();
		}
	}

}
