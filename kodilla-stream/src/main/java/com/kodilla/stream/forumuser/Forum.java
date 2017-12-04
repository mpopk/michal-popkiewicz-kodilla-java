package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public final class Forum {

private final List<ForumUser> userList = new ArrayList<>();

public Forum() {
    userList.add(new ForumUser(0001, "Jan Nowak", 'M', 1999-04-05 , 55));
    userList.add(new ForumUser(0002, "Anna Kowalska", 'F', 1995-02-02, 100));
    userList.add(new ForumUser(0003, "Jacek Szewczyk", 'M', 1996.04.04, 250));
    userList.add(new ForumUser(0004, "Maciej Rybak", 'M', 1990.05.05, 0));
    userList.add(new ForumUser(0005, "Eliza Krajewska", 'F', 1978.06.06, 12));
    userList.add(new ForumUser(0006, "Marcin Krawczyk", 'M', 2006.08.08, 430));
    userList.add(new ForumUser(0007, "Patrycjusz Mecwaldowski", 2000.09.10, 1));
}

public List<ForumUser>getList(){
    return new ArrayList<>(userList);
    }

}
