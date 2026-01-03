class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String numToString = String.valueOf(numberToCheck);
        char[] numArr = numToString.toCharArray();
        int total = 0;
        for (char c : numArr) {
            total += Math.pow(Integer.parseInt(String.valueOf(c)), numArr.length);
        }

        return total == numberToCheck ? true : false;
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");

    }


}
