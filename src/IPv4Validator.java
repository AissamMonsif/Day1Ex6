public class IPv4Validator {

    public static boolean validate(String ip){
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return false;
        }
        try {
            for (int i = 0; i < parts.length; i++) {
                int num = Integer.parseInt(parts[i]);

                if (num < 0 || num > 255) {
                    return false;
                }

                if (i == 3 && (num == 0 || num == 255)) {
                    return false;
                }
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
