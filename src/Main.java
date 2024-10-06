public class Main {
    public static void main(String[] args) {
        Author tolstoyAlex = new Author("Alexei", "Tolstoy");
        Author tolstoyLeo = new Author("Leo", "Tolstoy");

        Book warAndPeace = new Book("War and Peace", tolstoyLeo, 1867);
        Book pinocchio = new Book("Pinocchio", tolstoyAlex, 1936);
        Book warAndPeace1 = new Book("War and Peace", tolstoyLeo, 1867);


        System.out.println(pinocchio.getYearСreation());
        pinocchio.setyearСreation(1882);
        System.out.println(pinocchio.getYearСreation());
        System.out.println(warAndPeace);
        System.out.println( warAndPeace.equals(warAndPeace1));

    }
}