package homwork3;

public interface Game {
    void start(Integer sizeWord, Integer attempts);

    void stop(String exit);


    Answer inputValue(String value);

    GameStatus getGameStatus();




}
