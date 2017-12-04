package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

private final List<ForumUser> userList = new ArrayList<>();

public Forum() {
    userList.add(new ForumUser(0001, "Jan Nowak", 'M', LocalDate.of(1999, 04, 05), 55));
    userList.add(new ForumUser(0002, "Anna Kowalska", 'F', LocalDate.of(1995, 02, 02), 100));
    userList.add(new ForumUser(0003, "Jacek Szewczyk", 'M',LocalDate.of (1996,04,04), 250));
    userList.add(new ForumUser(0004, "Maciej Rybak", 'M', LocalDate.of(1990, 05, 05), 0));
    userList.add(new ForumUser(0005, "Eliza Krajewska", 'F', LocalDate.of(1978,06,06), 12));
    userList.add(new ForumUser(0006, "Marcin Krawczyk", 'M', LocalDate.of(2006,01, 01), 430));
    userList.add(new ForumUser(0007, "Patrycjusz Mecwaldowski", 'M', LocalDate.of(2000, 3, 10), 1));
}

public List<ForumUser>getList(){
    return new ArrayList<>(userList);
    }

}
