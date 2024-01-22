package ru.geekbrains.oop.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    default void onChangeReservationTable(int oldReservationId, Date newReservationDate, int newTableNo, String newName) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
