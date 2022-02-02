public class VitKheCase {
    //01.02.2022
    //Вот тебе задачка для практики
    //Есть строка "112243324544"
    //Надо вывести сколько разных чисел в ней
    //Например 1: 2
    //2:3

    public static String[][] countChar(String originalString) {
        String[][] countResult; //результат калькуляции выполняем в виде массива в два столбца: символ - кол-во

        if (originalString == "")  //в случае пустой строки возвращаем массив из одной строки 0, 0
            {countResult = new String[][]{{"0", "0"}};}

        else  //в случае если строка не пустая
        {
            countResult = new String[originalString.length()][2]; //инициализируем результирующий массив по размеру строки

            int countCharInType = 1; //инициализируем счётчик кол-ва символов одного типа
            //также инициализируем убывающую и прибывающую строки
            String decreasingString = originalString;
            String increasingString = "";

            int n = 0;//счётчик внешнего цикла while**
            while (decreasingString.length() > 0) //внешн while**
            {
                char currentChar = decreasingString.toCharArray()[0];
                countResult[n][0] = String.valueOf(currentChar); //1.фиксируем текущий вид символа

                if (decreasingString.length() > 1) { //if*
                    int i = 1;//счётчик внутреннего цикла while*
                    while (i < decreasingString.length()) //внутр. while*
                    {
                        if (decreasingString.toCharArray()[i] == currentChar)
                        {countCharInType++;}
                        else if (decreasingString.toCharArray()[i] != currentChar)
                        {increasingString += decreasingString.toCharArray()[i];}
                        i++;
                    }//end внутр. while*
                }//end if*

                countResult[n][1] = Integer.toString(countCharInType); //2.фиксируем количество символов текщего вида
                decreasingString = increasingString;
                increasingString = "";
                countCharInType = 1;
                n++;
            }//end внешн. while**
        };//end else

        return countResult;
    }//end String[][] countChar
}//end class VitKheCase
