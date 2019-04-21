public class Main {
    public static void main(String[] args) {
        JunkList<String> junkList = new JunkList<>();
        junkList.add("Element1");
        junkList.add("Element2");
        junkList.add("Element3");

        Iterator<String> itr = junkList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
