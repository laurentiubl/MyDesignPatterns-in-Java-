package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{

	private List<Channel> channelList;
	
	
	public ChannelCollectionImpl() {
		
		channelList = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		this.channelList.add(c);
		
	}

	@Override
	public void removeChannel(Channel c) {
		this.channelList.remove(c);
		
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
	
		return new ChannelIteratorImpl(type, this.channelList);
	}
	
	
	
	
	private class ChannelIteratorImpl implements ChannelIterator{

		@Override
		public String toString() {
			return "ChannelIteratorImpl [type=" + type + ", channels=" + channels + ", position=" + position + "]";
		}


		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		
	public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			
			this.type = type;
			this.channels = channels;
		}
		
		@Override
		public boolean hasNext() {
			while (position < channels.size()) {
				Channel c = channels.get(position);
				if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
					return true;
				} else
					position++;
			}
			return false;
		}
		 

		@Override
		public Channel next() {
			
			position++;
			Channel c = channels.get(position);
			return c;
		}

		@Override
		public Channel back() {
		
		
			position--;
			Channel c = channels.get(position);
			return c;
		}
		
		
		
	}
	

}
