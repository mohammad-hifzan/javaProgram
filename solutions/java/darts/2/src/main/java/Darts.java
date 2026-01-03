class Darts {
    int score(double xOfDart, double yOfDart) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int score = 0;
        double r = Math.sqrt((Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2)));
        if (r <= 1) {
            score = 10;
        } else if (r <= 5) {
            score = 5;
        } else if (r <= 10) {
            score = 1;
        }

        return score;
    }
}
