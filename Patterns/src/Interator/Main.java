package Interator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<PageWeb> lista = new ArrayList<PageWeb>();
		
		PageWeb p1 = new PageWeb("Presentation");
		PageWeb p2 = new PageWeb("Html1");
		PageWeb p3 = new PageWeb("Html2");
		PageWeb p4 = new PageWeb("Html3");
		PageWeb p5 = new PageWeb("Html4");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(p4);
		lista.add(p5);
		
		ListPage<PageWeb> concret = new ConcretListPage(lista);
		
		InteratorWeb<PageWeb> iterator1 = concret.OurIterator();
		
		
		System.out.println(iterator1.nextPage().getTitle());
		
		iterator1.nextPage();
		iterator1.nextPage();
		iterator1.nextPage();
		System.out.println(iterator1.curentPage().getTitle());
		iterator1.nextPage();
		System.out.println(iterator1.curentPage().getTitle());
		iterator1.nextPage();
		
		
	
		
		
	}
}
