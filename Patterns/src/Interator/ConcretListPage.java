package Interator;


import java.util.List;

public class ConcretListPage implements ListPage<PageWeb> {

	List<PageWeb> ourPages = null;
	
	public ConcretListPage(List<PageWeb> ourPages) {
		this.ourPages = ourPages;
	}

	
	@Override
	public InteratorWeb<PageWeb> OurIterator() {
		
		return new IteratorWeb(this.ourPages);
	}
	

	private class IteratorWeb implements InteratorWeb<PageWeb>{

		private List<PageWeb> myList = null;
		

		private int position;
		
		
		
		public IteratorWeb(List<PageWeb> myList) {
			this.myList = myList;
			this.position = 0;
		}
		

		@Override
		public boolean hasNext() {
			if(position == myList.size()-1)
			return false;
			
				return true;
			
		}

		@Override
		public PageWeb nextPage() {
			if(hasNext()) {
				
			this.position++;
			PageWeb p = myList.get(position);
			return p;
			}
			
				return null;
		}

		@Override
		public PageWeb curentPage() {
		
			return this.myList.get(position);
		}
	}
	
	
	
}
