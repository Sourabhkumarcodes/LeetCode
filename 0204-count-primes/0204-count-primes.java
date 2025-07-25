class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0; 
        
        BitSet primes = new BitSet(n);
        primes.set(2, n); 
        
        for (int p = 2; p * p < n; p++) {
            if (primes.get(p)) {
                for (int multiple = p * p; multiple < n; multiple += p) {
                    primes.clear(multiple);
                }
            }
        }
        
        return primes.cardinality(); 
    }
}