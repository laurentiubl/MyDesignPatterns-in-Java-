package IteratorPattern;

public interface ChannelIterator {

    public boolean hasNext();
	
	public Channel next();
	
	public Channel back();
}
