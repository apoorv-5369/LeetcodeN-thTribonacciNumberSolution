class Solution {
    public int tribonacci(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // Initiating a HashMap, to hold the value of n Tribonacci numbers.
        hm.put(0, 0); // Putting '0' as key with the same value.
        hm.put(1, 1); // Putting '1' as key with the same value.
        hm.put(2, 1); // Putting '2' as key with '1' as value.
        // Iterating from '3' to 'n'.
        for(int i=3; i<n+1;i++){
            hm.put(i, hm.getOrDefault(i-1, 0)+hm.getOrDefault(i-2, 0)+hm.getOrDefault(i-3, 0)); //Putting values for ith triibonacci number by adding the previous three tribonacci numbers, which are already present in the HashMap.
        }
        return hm.get(n); // Finally, returning the value holded by the key 'n', which is the desired tribonacci number, T(n).
    }
}
