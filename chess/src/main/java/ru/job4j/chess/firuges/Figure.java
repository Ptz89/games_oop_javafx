package ru.job4j.chess.firuges;

import ru.job4j.chess.ImpossibleMoveException;

public interface Figure {
    Cell position();  /*Это метод используется для получения позиции фигуры на поле. Он возвращает тип перечисления.*/

    Cell[] way(Cell dest) throws ImpossibleMoveException; /*Этот метод возвращает массив с клетками, которые
                                                          должна пройти фигура при своем движении из текущей
                                                          позиции до клетки dest.*/

    default String icon() {                               /*Этот метод возвращает имя картинки фигуры. Этот метод
                                                          имеет реализацию по умолчанию.*/
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }

    Figure copy(Cell dest);                               /*Этот метод создаст объект класса с позицией dest.*/
}
