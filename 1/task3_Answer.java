class task3_Answer {
    public int sumDigits(int n) {
    // Введите свое решение ниже
    if (n<1)
        return 0;

    return  n % 10 + sumDigits(n/10);

    }
    }
    // Не удаляйте этот класс - он нужен для вывода результатов 