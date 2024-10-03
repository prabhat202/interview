package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;




enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25), HALF_DOLLAR(50);
    final int value;
    Coin(int value) {
        this.value = value;
    }
}

public class CoinPurse {


    /**
     * Adds a Coin to the Wallet, increasing its value.
     *
     * @param c the type of Coin to be added.
     */

    Map<Coin, List<Coin>> coinPurseMap = new HashMap();

    public void addCoin(Coin c) {
        List<Coin> coinList;
        if (coinPurseMap.containsKey(c)) {
            coinList = coinPurseMap.get(c);
        } else {
            coinList = new ArrayList();      
        }
        coinList.add(c);
        coinPurseMap.put(c, coinList);
    }

    /**
     * Returns the value of the wallet in Cents.
     */
    public int getValueInCents() {
        
        Set<Map.Entry<Coin,List<Coin>>> set = coinPurseMap.entrySet();
        Iterator itr = set.iterator();
        int sum = 0;
        while(itr.hasNext()) {
            Map.Entry<Coin,List<Coin>> en = (Map.Entry<Coin,List<Coin>>) itr.next();
            //List<Coin> list = en.getValue();
            int sumForDeno = getValueDeno(en.getKey(), en.getValue());
            sum+=sumForDeno;
            
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
         List<Coin> coinList;
        if (coinPurseMap.containsKey(c)) {
            coinList = coinPurseMap.get(c);
            coinList.remove(c);
            coinPurseMap.put(c, coinList);
        } else {
            throw new IllegalStateException();
        }
        
    }

    /**
     * Mutates the wallet to minimize the number of coins contained while keeping the ValueInCents constant.
     *
     * @return the total reduction in number of coins contained
     */
    public int reduceCoinage() {
        Set<Map.Entry<Coin,List<Coin>>> set = coinPurseMap.entrySet();
        Iterator itr = set.iterator();
        int sum = 0;
        while(itr.hasNext()) {
            Map.Entry<Coin,List<Coin>> en = (Map.Entry<Coin,List<Coin>>) itr.next();
            reduceCoin(en.getKey(), en.getValue());
            
        }
        return 0;
    }

    private void reduceCoin(Coin c, List<Coin> list) {

        if(c.equals(Coin.PENNY) && getValueDeno(c, list) > 10) {
            int val = getValueDeno(c, list);
            int i = val - c.value;
            //list.remove()
        }
    }

    /**
     * Returns the total number of coins in the wallet.
     */
    public int getCoinCount() {
        Set<Map.Entry<Coin,List<Coin>>> set = coinPurseMap.entrySet();
        Iterator itr = set.iterator();
        int sum = 0;
        while(itr.hasNext()) {
            Map.Entry<Coin,List<Coin>> en = (Map.Entry<Coin,List<Coin>>) itr.next();
            //List<Coin> list = en.getValue();
            int count = en.getValue().size();
            sum+=count  ;
        }
        return sum;
       
    }

    /**
     * Generates a list of exact change amounts that can be paid from this wallet. In the results, zero cents should
     * always be included, there should be no duplicates, and the values should appear in ascending order.
     *
     * e.g. {PENNY(1), NICKEL(5)} -> {0, 1, 5, 6}
     *
     * @return List of Integer numbers of cents. This list is ordered from lowest to highest.
     */
    public List<Integer> generateAllUniqueExactChangeAmountsPossible() {
        // Hint: Use the Sets::powerSet method in the Google Guava library to help solve this.
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the sequence of coins in the wallet, from most valuable to least valuable.
     * If there are two or more coins of the same denomination in the wallet, they are returned individually.
     * Denominations of coins not in the wallet are not returned at all.
     */
    public Iterator<Coin> iterator() {
        throw new UnsupportedOperationException();
    }
    
    public static void main(String[] args) {
    	CoinPurse cp = new CoinPurse();
    	cp.addCoin(Coin.PENNY);
    	cp.addCoin(Coin.PENNY);
    	cp.addCoin(Coin.PENNY);
    	
    	cp.getCoinCount();
	}

}
