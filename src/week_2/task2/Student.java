package week_2.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Book implements Comparable<Book> {
    String name;
    int year;
    int lists;

    Book(String name, int year, int lists) {
        this.name = name;
        this.year = year;
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getLists() {
        return lists;
    }

    public String toString() {
        return "Название книги: " + name + " Год выпуска: " + year + " Количество листов: " + lists;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.lists, other.lists);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && lists == book.lists && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, lists);
    }
}

class Student {
    private String name;
    private List<Book> books;

    public Student(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + books;
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Олег", Arrays.asList(
                        new Book("451 градус по Фаренгейту", 1951, 250),
                        new Book("Собачье сердце", 1951, 90),
                        new Book("Мастер и Маргарита", 1925, 280),
                        new Book("Тихий Дон", 1925, 402),
                        new Book("Над пропастью во ржи", 1951, 218)
                )),
                new Student("Мария", Arrays.asList(
                        new Book("Игра престолов", 1996, 720),
                        new Book("Бесконечная шутка", 1996, 210),
                        new Book("Гарри Поттер и узник Азкабана", 1999, 250),
                        new Book("Зимняя дорога", 2015, 220),
                        new Book("Дни Савелия", 2018, 300)
                ))
        );

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Book::compareTo)
                .distinct()
                .filter(element -> element.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска книги: " + year),
                        () -> System.out.println("Книга не найдена"));
    }
}

