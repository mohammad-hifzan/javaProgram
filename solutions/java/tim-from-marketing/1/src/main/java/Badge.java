class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder result = new StringBuilder();
        if (id != null) {
            result.append("[" + id + "]");
            result.append(" - ");
        }
        result.append(name);
        result.append(" - ");
        if (department == null) {
            result.append("OWNER");
        } else {
            result.append(department.toUpperCase());   
        }
        return result.toString();
        // throw new UnsupportedOperationException("Please implement the Badge.print() method");
    }
}
