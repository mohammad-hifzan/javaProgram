class ReverseString {

    String reverse(String inputString) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        char[] revString = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            revString[i] = inputString.charAt(inputString.length() - 1 - i);
        }

        return new String(revString);
    }
  
}
