import java.util.*;

public class PairFull<U extends Comparable<U>, V extends Comparable<V>> implements Comparable<PairFull<U, V>> {
	U u;
	V v;

	public PairFull(U u, V v) {
		this.u = u;
		this.v = v;
	}

	public int hashCode() {
		return (u == null ? 0 : u.hashCode() * 31) + (v == null ? 0 : v.hashCode());
	}

	public boolean equals(Object o) {
		if (!(o instanceof PairFull)) {
			return false;
		}
		PairFull<U, V> p = (PairFull<U, V>) o;
		return (u == null ? p.u == null : u.equals(p.u)) && (v == null ? p.v == null : v.equals(p.v));
	}

	public int compareTo(PairFull<U, V> b) {
		int cmp = u.compareTo(b.u);
		if (cmp != 0)
			return cmp;

		return v.compareTo(b.v);
	}

	// Usage example
	public static void main(String[] args) {
		PairFull<Integer, Integer>[] a = new PairFull[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = new PairFull(a.length - i, i);
		}
		Arrays.sort(a);
		for (PairFull p : a) {
			System.out.println(p.u + " " + p.v);
		}
	}
}