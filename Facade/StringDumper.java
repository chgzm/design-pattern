public class StringDumper {
    private StringDumper() {}

    public static String hexdump(String str) {
        final StringBuilder sb = new StringBuilder();
        final byte[] bytes = str.getBytes();

        for (int i = 0; i < bytes.length; ++i) {
            sb.append(String.format("%02x", bytes[i]));
            if ((i + 1) % 16 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
