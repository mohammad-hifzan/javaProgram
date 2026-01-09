import java.util.Map;
import java.util.HashMap;
public class DialingCodes {
    Map<Integer, String> dialingCodes = new HashMap<Integer, String>();
    public Map<Integer, String> getCodes() {
        return dialingCodes;
        // throw new UnsupportedOperationException(
                // "Delete this statement and write your own implementation.");
    }

    public void setDialingCode(Integer code, String country) {
        dialingCodes.put(code, country);
        // throw new UnsupportedOperationException(
                // "Delete this statement and write your own implementation.");
    }

    public String getCountry(Integer code) {
        return dialingCodes.get(code);
        // throw new UnsupportedOperationException(
                // "Delete this statement and write your own implementation.");
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!(dialingCodes.containsKey(code) || dialingCodes.containsValue(country))) {
            dialingCodes.put(code, country);   
        }
        // throw new UnsupportedOperationException(
                // "Delete this statement and write your own implementation.");
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                return entry.getKey();
            }
        }

        return null;
        // throw new UnsupportedOperationException(
                // "Delete this statement and write your own implementation.");
    }

    public void updateCountryDialingCode(Integer code, String country) {
        boolean flag = false;
        for (Map.Entry<Integer, String> entry : dialingCodes.entrySet()) {
            if (entry.getValue().equals(country)) {
                flag = true;
                dialingCodes.remove(entry.getKey());
            }
        }

        if (flag) {
             dialingCodes.put(code, country);   
        }
        // throw new UnsupportedOperationException(
        //         "Delete this statement and write your own implementation.");
    }
}
