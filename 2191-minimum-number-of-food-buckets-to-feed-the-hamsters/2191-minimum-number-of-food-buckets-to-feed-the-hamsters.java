class Solution {
    public int minimumBuckets(String hamsters) {
        int buckets = 0;

        char[] hams = hamsters.toCharArray();

        for (int i = 0; i < hams.length; i++) {
            if (hams[i] == 'H') {
                // Check if hamster is already fed
                if (i - 1 >= 0 && hams[i - 1] == 'F') {
                    continue;
                }

                // Check if we can feed hamster on the next slot
                if (i + 1 < hams.length && hams[i + 1] == '.') {
                    hams[i + 1] = 'F';
                    buckets++;
                    continue;

                // Check if we can feed hamster on previous slot
                } else if (i - 1 >= 0 && hams[i - 1] == '.') {
                    hams[i - 1] = 'F';
                    buckets++;
                    continue;
                }

                return -1;
            }
        }

        return buckets;
    }
}
