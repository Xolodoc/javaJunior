package lesson8;

import lesson7.StringUtils;

//входит текст, метод должен написать слова из текста в отдельной строке
public class ScannerUtils {
    public static void printTextByWords (String words){
        //Words = "Я не шарю в ява"
        String [] wordsMassive = words.split(" ");

        for (int i = 0; i < wordsMassive.length; i++){
            System.out.println(wordsMassive [i]);

        }

    }

    public static void printTextReversWords (String words){
        //text = "как то так"
        String [] wordsMassive = words.split(" ");

        for (int i = 0; i < wordsMassive.length; i++){
            String reversWords = StringUtils.reverseText(wordsMassive[i]);
            System.out.println(reversWords);

        }

    }

}
