package IteratorPattern;



public class Main {
	public static void main(String[] args) {
		
		ChannelCollection channels = new ChannelCollectionImpl();
		
		channels.addChannel(new Channel(98.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(99.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(100.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(101.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(102.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(103.5, ChannelTypeEnum.FRENCH));
		channels.addChannel(new Channel(104.5, ChannelTypeEnum.ENGLISH));
		channels.addChannel(new Channel(105.5, ChannelTypeEnum.HINDI));
		channels.addChannel(new Channel(106.5, ChannelTypeEnum.FRENCH));
		
		
	
		
		ChannelIterator iterator1 = channels.iterator(ChannelTypeEnum.ENGLISH);
		
		
			Channel c = iterator1.next();
			System.out.println(c.toString());
			
			Channel c2 = iterator1.back();
			System.out.println(c2.toString());
			
			
	
	}

}
