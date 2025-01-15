class Solution {
    public int minimizeXor(int num1, int num2) {
        int num2Bits = Integer.bitCount(num2);
        int result = 0;
        for (int i = 31; i >= 0 && num2Bits > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                result |= (1 << i);
                num2Bits--;
            }
        }
        for (int i = 0; i <= 31 && num2Bits > 0; i++) {
            if ((result & (1 << i)) == 0) {
                result |= (1 << i);
                num2Bits--;
            }
        }
        return result;
    }
}
