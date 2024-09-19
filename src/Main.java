public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book("War and Peace", "Leo Tolstoy", 1867);
        Book pinocchio = new Book("Pinocchio", "Alexei Tolstoy", 1936);
        Author pushkin = new Author("Alexander", "Pushkin");
        Author tolstoy = new Author("Leo", "Tolstoy");
        System.out.println(pinocchio.getYearСreation());
        pinocchio.setyearСreation(1882);
        System.out.println(pinocchio.getYearСreation());

    }
}