package intro;



public class Main {
//new class main başlangıç
	//  "//" yorum satırı
	public static void main(String[] args) {
		System.out.println("hello from kodlama.io!");
		// String metin değişkeni baş harf büyük
		//değişken isimlendirmeleri camelCase yazılır.
		String metin ="ilginizi çekebilir.";
		String solUst ="vade";
		
		System.out.println(solUst);
		
		// eğer değişken ismini "" içinde yazarsak değişkeni almaz.
		// int sadece tam sayı
		int vade = 12;
		
		//double ondalıklı olabilir
		
		double dolarDun = 16.20;
		double dolarBugun = 16.24;
		
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}else if (dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		
		else {okYonu = "equal.svg";
			System.out.println(okYonu);
		}
			//listelere array denir.. 
			
			String[] krediler = {"Hızlı Kredi" , "Maaşını Alanlara Özel", "Mutlu Emekli", "aaaa"};
			 
			
			
			for (int i = 0; i < krediler.length; i++) {
				System.out.println(krediler[i]);
			}
		}

}
