class Solution {
    public String findLatestTime(String st) {
        StringBuilder sb = new StringBuilder(st);
        
        if (sb.charAt(0) == '?') 
        {
            if (sb.charAt(1) == '?' || sb.charAt(1) < '2') 
            {
                sb.setCharAt(0, '1');
            } 
            else 
            {
                sb.setCharAt(0, '0');
            }
        }
        if (sb.charAt(1) == '?') 
        {
            if (sb.charAt(0) == '1') 
            {
                sb.setCharAt(1, '1');  // Maximum valid is '11'
            } 
            else 
            {
                sb.setCharAt(1, '9');  // Maximum valid for '09' or '00'
            }
        }
        
        // Process minutes
        if (sb.charAt(3) == '?') {
            sb.setCharAt(3, '5');  // Maximum valid minute tens
        }
        if (sb.charAt(4) == '?') {
            sb.setCharAt(4, '9');  // Maximum valid minute ones
        }
        
        return sb.toString();
    }
}