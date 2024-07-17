class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
      String answer = "";

        char[] c_my_string = my_string.toCharArray();
        char[] c_overwrite_string = overwrite_string.toCharArray();


        System.arraycopy(c_overwrite_string, 0,
                          c_my_string, s, overwrite_string.length());

        answer = new String(c_my_string);
        return answer;
    }
}