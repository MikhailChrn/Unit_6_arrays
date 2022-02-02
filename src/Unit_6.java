public class Unit_6 {

    public static void weekDays() {
        //1.Одномерный массив типа String.
        //Создать массив типа String с размером 7.
        //Записать в него значения дней недели.
        //Вывести на консоль значение последнего элемента.
        String[] weekDays = new String[7];
        weekDays[0] = "воскресенье";
        weekDays[1] = "понедельник";
        weekDays[2] = "вторник";
        weekDays[3] = "среда";
        weekDays[4] = "четверг";
        weekDays[5] = "пятница";
        weekDays[6] = "суббота";

        System.out.println(weekDays[6]);
    }//end void weekDays

    public static void arrayDouble() {
        //2. Одномерный массив типа double.
        //Создать массив типа double с размером 4.
        //Записать в него любые значения с помощью блока для инициализации.
        //Вывести на консоль значение первого элемента.
        Double[] arrayDouble = {5.4, 4.6, 8.9, -10.5};

        System.out.println(arrayDouble[1]);
    }//void arrayDouble

    public static void arrayTwoDimensionalWithString() {
        //3. Двумерный массив типа String.
        //Создать массив типа String размером 3х6.
        //И записать в него значения:
        //a1  a2  a3  a4  a5  a6
        //b1  b2  b3  b4  b5  b6
        //c1  c2   c3  c4  c5  c6
        //Распечатать массив.
        String[][] arrayString = {
                {"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"}};

        for (String[] arrayOne : arrayString) {
            for (String element : arrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }//end for
    }//end void arrayTwoDimensional

    public static void arrayTwoDimensionalWithChar() {
        //4. Двумерный массив типа char.
        //Создать двумерный массив типа char размером 4х2.
        //Записать в него значения с помощью блока для инициализации.
        //Распечатать значения массива.
        char[][] arrayChar = {
                {'q', 'w'},
                {'a', 's'},
                {'z', 'x'},
                {'e', 'r'}};

        for (char[] arrayOne : arrayChar) {
            for (char element : arrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }//end for
    }//end void arrayTwoDimensionalWithChar

    public static void findMaxMin() {
        //5. Поиск максимального и минимального значения в каждой строке массива.
        //Создать двумерный массив 5х8 типа int и инициализировать его с помощью блока для инициализации.
        //Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
        //Распечатать оба массива.
        int[][] arraySource = {
                {4, 6, 1, 3, 7, 9, 2, 4},
                {9, 7, 5, 3, 8, 6, 4, 2},
                {2, 6, 3, 7, 4, 8, 5, 9},
                {1, 5, 0, 3, 7, 4, 8, 3},
                {3, 1, 8, 4, 6, 1, 0, 5}};

        for (int[] arrayOne : arraySource) {
            for (int element : arrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }//end for 1

        System.out.println();

        int max, min, i = 0;
        int [][] arrayResult = new int[arraySource.length][2];

        for (int[] arrayOne : arraySource) {
            max = arrayOne[0];
            min = arrayOne[0];
            for (int element : arrayOne) {
                if (element > max) {max = element;}
                if (element < min) {min = element;}
            }
            arrayResult[i][0] = min;
            arrayResult[i][1] = max;
            i++;
        }//end for 2

        for (int[] arrayOne : arrayResult) {
            for (int element : arrayOne) {
                System.out.print(element + " ");
            }
            System.out.println();
        }//end for 3

    }//end void findMaxMin

}//end class Unit_6
