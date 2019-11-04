package keyValue1;

/**
 * @author paulinemakoma
 *
 * @param <K>
 * @param <V>
 */
//public class KeyValuePair<K extends Comparable<K> ,V> implements Comparable< KeyValuePair <K,V>> {
	
	
	public class KeyValuePair<K extends Comparable<K>, V> implements Comparable< KeyValuePair <K, V>>{

	private K key;
	private V value;
	
	
	/**
	 * @param key
	 * @param value
	 */
	public KeyValuePair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}


	public K getKey() {
		return key;
	}


	public void setKey(K key) {
		this.key = key;
	}


	public V getValue() {
		return value;
	}


	public void setValue(V value) {
		this.value = value;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof KeyValuePair))
			return false;
		KeyValuePair other = (KeyValuePair) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return String.format("(%s, %s)", this.key, this.value);
	}
	
	
	
	
	
	
}
