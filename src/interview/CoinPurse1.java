package interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoinPurse1 {

	public static void main(String[] args) {
		CoinPurse1 cp = new CoinPurse1();
		cp.addCoin(Coin.PENNY);
		cp.addCoin(Coin.PENNY);
		cp.addCoin(Coin.PENNY);
		cp.addCoin(Coin.DIME);
		cp.addCoin(Coin.DIME);
		System.out.println(cp.coinPurseMap);
		System.out.println(cp.getValueInCents());
	}

	/**
	 * Adds a Coin to the Wallet, increasing its value.
	 *
	 * @param c the type of Coin to be added.
	 */

	Map<Coin, Integer> coinPurseMap = new HashMap();

	public void addCoin(Coin c) {
		int count;
		if (coinPurseMap.containsKey(c)) {
			count = coinPurseMap.get(c);
			coinPurseMap.put(c, ++count);
		} else {
			coinPurseMap.put(c, 1);
		}

	}

	/**
	 * Returns the value of the wallet in Cents.
	 */
	public int getValueInCents() {
		int sum = 0;

		Set<Map.Entry<Coin, Integer>> set = coinPurseMap.entrySet();
		Iterator<Map.Entry<Coin, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Coin, Integer> en = itr.next();
			sum += en.getValue() * en.getKey().value;
		}
		return sum;
	}

	private int getValueDeno(Coin c, List<Coin> list) {
		return list.size() * c.value;
	}

	/**
	 * Removes one coin of type c from the wallet, if present in the wallet.
	 *
	 * @param c the type of Coin to be removed.
	 * @throws IllegalStateException , if there is no coin with that denomination
	 */
	public void removeCoin(Coin c) throws IllegalStateException {

	}

	/**
	 * Mutates the wallet to minimize the number of coins contained while keeping
	 * the ValueInCents constant.
	 *
	 * @return the total reduction in number of coins contained
	 */
	public int reduceCoinage() {

		return 0;
	}

	private void reduceCoin(Coin c, List<Coin> list) {

		if (c.equals(Coin.PENNY) && getValueDeno(c, list) > 10) {
			int val = getValueDeno(c, list);
			int i = val - c.value;
			// list.remove()
		}
	}

	/**
	 * Returns the total number of coins in the wallet.
	 */
	public int getCoinCount() {
		return 0;

	}

	/**
	 * Generates a list of exact change amounts that can be paid from this wallet.
	 * In the results, zero cents should always be included, there should be no
	 * duplicates, and the values should appear in ascending order.
	 *
	 * e.g. {PENNY(1), NICKEL(5)} -> {0, 1, 5, 6}
	 *
	 * @return List of Integer numbers of cents. This list is ordered from lowest to
	 *         highest.
	 */
	public List<Integer> generateAllUniqueExactChangeAmountsPossible() {
		// Hint: Use the Sets::powerSet method in the Google Guava library to help solve
		// this.
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the sequence of coins in the wallet, from most valuable to least
	 * valuable. If there are two or more coins of the same denomination in the
	 * wallet, they are returned individually. Denominations of coins not in the
	 * wallet are not returned at all.
	 */
	public Iterator<Coin> iterator() {
		throw new UnsupportedOperationException();
	}

}
