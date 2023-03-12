import java.util.Scanner;
//          Задача
//          Будем считать слово слишком длинным, если его длина строго больше 10 символов. Все слишком длинные слова
//          можно заменить специальной аббревиатурой.
//
//        Эта аббревиатура строится следующим образом: записывается первая и последняя буква слова, а
//        между ними — количество букв между первой и последней буквой (в десятичной системе счисления и без ведущих нулей).
//
//        Таком образом, «localization» запишется как «l10n», а «internationalization» как «i18n».
//
//        Вам предлагается автоматизировать процесс замены слов на аббревиатуры. При этом все слишком
//        длинные слова должны быть заменены аббревиатурой, а слова, не являющиеся слишком длинными, должны
//        остаться без изменений.
//
//        Входные данные
//        В первой строке содержится целое число n (1≤n≤100). В каждой из последующих n строк содержится
//        по одному слову. Все слова состоят из малых латинских букв и имеют длину от 1 до 100 символов.
//
//        Выходные данные
//        Выведите n строк. В i строке должен находиться результат замены i-го слова из входных данных.
//
//        Примеры
//        входные данные
//        4
//        word
//        localization
//        internationalization
//        pneumonoultramicroscopicsilicovolcanoconiosis
//
//        выходные данные
//        word
//        l10n
//        i18n
//        p43s



public class TooLongWords {
    public static String abbreviateString(String input, int maxLength) {
        maxLength = 10;
        Scanner in = new Scanner(System.in);
                if (input.length() <= maxLength)
            return input;
        else
            return input.substring(0, maxLength-2) + "..";
    }


    // пока не удалось

}
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String enterAnyWord;
//        int maxWidth = 10;
//        do {
//            System.out.println("Enter any word which is not longer that 100 characters:");
//          enterAnyWord = s.next();
//        }while(enterAnyWord.length()<100);
////        if (enterAnyWord.length()>10){
//        System.out.println(enterAnyWord);
//        System.out.println(enterAnyWord.substring(0, Math.min(enterAnyWord.length(), maxWidth)));
//        //correctly process UTF-16 surrogate pairs
//        if(enterAnyWord.length()>maxWidth){
//            int correctedMaxWidth = (Character.isLowSurrogate(enterAnyWord.charAt(maxWidth)))&&maxWidth>0 ? maxWidth-1 : maxWidth;
//            System.out.println(enterAnyWord.substring(0, Math.min(enterAnyWord.length(), correctedMaxWidth)));
//        }
//
//        }
////        System.out.println(enterAnyWord);
//
//    }

