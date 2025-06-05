package basiccalculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculation {
    public static void main(String[] args){
        StringBuilder x = new StringBuilder();
        x.append("100%");
        String result = calculation(x);
        System.out.println(result);
    }
    public static final char[] symbols = {'+','-','×','÷','%'};
    public static String calculation(StringBuilder stringBuilder){
        String text = stringBuilder.toString();
        boolean multiplication = true;
        boolean division = true;
        boolean addition = true;
        boolean subtraction = true;
        String textTemp = text;
        textTemp = textTemp.replace("+", " ");
        textTemp = textTemp.replace("-", " ");
        textTemp = textTemp.replace("×", " ");
        textTemp = textTemp.replace("÷", " ");
        textTemp = textTemp.replace("%","");
        String[] numbers = textTemp.split(" ");
        ArrayList<String> signs = new ArrayList<>();

        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            if (letter == '+' || letter == '-' || letter == '×' || letter == '÷' || letter == '%'){
                String iString = Character.toString(letter);
                signs.add(iString);
            }
        }

        int numberOfPercentage = 0;
        for (String i : signs){
            if (i.equals("%")){
                numberOfPercentage++;
            }
        }
        int totalSigns = signs.size() - numberOfPercentage;

        if ((numbers.length > totalSigns && totalSigns != 0) || numberOfPercentage == numbers.length) {


            ArrayList<String> completedCalculation = new ArrayList<>();
            int iNumbers = 0;
            int jSigns = 0;
            while (iNumbers <= numbers.length - 1 || jSigns <= signs.size() - 1) {
                completedCalculation.add(numbers[iNumbers]);
                if (jSigns <= signs.size() - 1) {

                    if (signs.get(jSigns).equals("%")) {

                        completedCalculation.add(signs.get(jSigns));
                        if (jSigns < signs.size() - 1) {
                            jSigns++;
                            completedCalculation.add(signs.get(jSigns));
                        }

                    } else {
                        completedCalculation.add(signs.get(jSigns));
                    }
                }
                iNumbers++;
                jSigns++;
            }
            while (completedCalculation.size() != 1) {
                if (completedCalculation.contains("%")) {
                    int signIndex = completedCalculation.indexOf("%");
                    int numberIndex = signIndex - 1;
                    double number = Double.parseDouble(completedCalculation.get(numberIndex)) / 100;
                    String numberString = Double.toString(number);
                    completedCalculation.set(numberIndex, numberString);
                    completedCalculation.remove(signIndex);

                } else if (completedCalculation.contains("×") || completedCalculation.contains("÷")) {
                    int signIndex1 = completedCalculation.indexOf("×"); // For multiplication
                    int signIndex2 = completedCalculation.indexOf("÷"); // For Division
                    boolean multiply = true;
                    boolean divide = true;
                    if (multiplication && division) {
                        if (signIndex1 == -1) {
                            multiplication = false;
                        }
                        if (signIndex2 == -1) {
                            division = false;
                        }
                    }
                    if (multiplication || division) {
                        if (multiplication && division) {
                            if (signIndex1 < signIndex2) {
                                divide = false;
                            } else if (signIndex2 < signIndex1) {
                                multiply = false;
                            }
                        }
                        if ((multiply && !divide) || (multiplication && !division)) { // Is multiplication
                            int firstNumberIndex = signIndex1 - 1;
                            int secondNumberIndex = signIndex1 + 1;
                            double firstNumber = Double.parseDouble(completedCalculation.get(firstNumberIndex));
                            double secondNumber = Double.parseDouble(completedCalculation.get(secondNumberIndex));
                            double result = firstNumber * secondNumber;
                            String resultString = Double.toString(result);
                            completedCalculation.set(firstNumberIndex, resultString);
                            completedCalculation.remove(signIndex1);
                            completedCalculation.remove(signIndex1);
                        } else { // Is division
                            int firstNumberIndex = signIndex2 - 1;
                            int secondNumberIndex = signIndex2 + 1;
                            double firstNumber = Double.parseDouble(completedCalculation.get(firstNumberIndex));
                            double secondNumber = Double.parseDouble(completedCalculation.get(secondNumberIndex));
                            if (secondNumber == 0) {
                                return "Error";
                            } else {
                                double result = firstNumber / secondNumber;
                                String resultString = Double.toString(result);
                                completedCalculation.set(firstNumberIndex, resultString);
                                completedCalculation.remove(signIndex2);
                                completedCalculation.remove(signIndex2);
                            }
                        }
                    }
                } else if (completedCalculation.contains("+") || completedCalculation.contains("-")) {
                    int signIndex1 = completedCalculation.indexOf("+"); // For multiplication
                    int signIndex2 = completedCalculation.indexOf("-"); // For Division
                    boolean add = true;
                    boolean minus = true;
                    if (addition && subtraction) {
                        if (signIndex1 == -1) {
                            addition = false;
                        }
                        if (signIndex2 == -1) {
                            subtraction = false;
                        }
                    }
                    if (addition || subtraction) {
                        if (addition && subtraction) {
                            if (signIndex1 < signIndex2) {
                                minus = false;
                            } else if (signIndex2 < signIndex1) {
                                add = false;
                            }
                        }
                        if ((add && !minus) || (addition && !subtraction)) {// Is multiplication
                            int firstNumberIndex = signIndex1 - 1;
                            int secondNumberIndex = signIndex1 + 1;
                            double firstNumber = Double.parseDouble(completedCalculation.get(firstNumberIndex));
                            double secondNumber = Double.parseDouble(completedCalculation.get(secondNumberIndex));
                            double result = firstNumber + secondNumber;
                            String resultString = Double.toString(result);
                            completedCalculation.set(firstNumberIndex, resultString);
                            completedCalculation.remove(signIndex1);
                            completedCalculation.remove(signIndex1);
                        } else {
                            int firstNumberIndex = signIndex2 - 1;
                            int secondNumberIndex = signIndex2 + 1;
                            double firstNumber = Double.parseDouble(completedCalculation.get(firstNumberIndex));
                            double secondNumber = Double.parseDouble(completedCalculation.get(secondNumberIndex));
                            double result = firstNumber - secondNumber;
                            String resultString = Double.toString(result);
                            completedCalculation.set(firstNumberIndex, resultString);
                            completedCalculation.remove(signIndex2);
                            completedCalculation.remove(signIndex2);
                        }
                    }
                }
            }
            String resultString = completedCalculation.get(0);
            double resultDouble = Double.parseDouble(resultString);
            String numberString = String.format("%.0f", resultDouble);
            long number = Long.parseLong(numberString);
            if (resultDouble == number) {
                return numberString;
            }
            return resultString;
        }
        return "";
    }
}
