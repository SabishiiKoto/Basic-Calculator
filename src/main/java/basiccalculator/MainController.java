package basiccalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.NodeOrientation;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Arrays;

public class MainController {

    @FXML
    private TextField textAreaForCalculation;

    @FXML
    private Label labelForEstimated;

    private StringBuilder calculationString = new StringBuilder();

    private int lastIndex(StringBuilder text){
        return text.length() - 1;
    }
    private boolean lastIndexIsDigits(StringBuilder text){
        if (!text.isEmpty()) {
            int lastIndex = lastIndex(text);
            char x = text.charAt(lastIndex);
            if (x == '0' || x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9') {
                return true;
            }
        }
        return false;
    }

    @FXML
    void onACButtonClick(ActionEvent event) {
        calculationString.delete(0,lastIndex(calculationString) + 1);
        textAreaForCalculation.setText(calculationString.toString());
        labelForEstimated.setText("");
    }

    @FXML
    void onAdditionButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && (lastIndexIsDigits(calculationString) || calculationString.charAt(lastIndex(calculationString)) == '%')) {
            calculationString.append("+");
            textAreaForCalculation.setText(calculationString.toString());
        }
        scrollToEnd();
    }

    @FXML
    void onDecimalButtonClick(ActionEvent event) {
        String textTemp = calculationString.toString();
        textTemp = textTemp.replace("+", " ");
        textTemp = textTemp.replace("-", " ");
        textTemp = textTemp.replace("×", " ");
        textTemp = textTemp.replace("÷", " ");
        String[] numbers = textTemp.split(" ");
        if (!numbers[numbers.length - 1].isEmpty() && !numbers[numbers.length - 1].contains("%") &&!numbers[numbers.length - 1].contains("."))
        {
            calculationString.append(".");
            textAreaForCalculation.setText(calculationString.toString());
        }
        scrollToEnd();

    }

    @FXML
    void onDeleteButtonClick(ActionEvent event) {
        if(!calculationString.isEmpty()) {
            calculationString.deleteCharAt(lastIndex(calculationString));
            textAreaForCalculation.setText(calculationString.toString());
        }
        labelForEstimated.setText("");
    }

    @FXML
    void onDivisionButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && (lastIndexIsDigits(calculationString) || calculationString.charAt(lastIndex(calculationString)) == '%')) {
            calculationString.append("÷");
            textAreaForCalculation.setText(calculationString.toString());
        }
        scrollToEnd();
    }

    @FXML
    void onEightButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("8");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }

    @FXML
    void onEqualButtonClick(ActionEvent event) {
        char letter = calculationString.charAt(calculationString.length() - 1);
        if (letter == '+' || letter == '-' || letter == '×' || letter == '÷'){
            calculationString.deleteCharAt(calculationString.length() - 1);
        }
        String text = calculationString.toString();
        if (!text.contains("+") && !text.contains("-") && !text.contains("×") && !text.contains("÷") && !text.contains("%")){
            calculationString.setLength(0);
            calculationString.append(text);
            textAreaForCalculation.setText(calculationString.toString());
        }
        else {
            String result = Calculation.calculation(calculationString);
            calculationString.setLength(0);
            calculationString.append(result);
            textAreaForCalculation.setText(calculationString.toString());
        }
        labelForEstimated.setText("");
    }

    @FXML
    void onFiveButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("5");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }

    @FXML
    void onFourButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("4");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }

    @FXML
    void onMultiplicationButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && (lastIndexIsDigits(calculationString) || calculationString.charAt(lastIndex(calculationString)) == '%')) {
            calculationString.append("×");
            textAreaForCalculation.setText(calculationString.toString());
        }
        scrollToEnd();
    }

    @FXML
    void onNineButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("9");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();

    }

    @FXML
    void onOneButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("1");
//        String result = Calculation.calculation(calculationString);
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();

    }

    @FXML
    void onPercentageButtonClick(ActionEvent event) {
        if (lastIndexIsDigits(calculationString)) {
            calculationString.append("%");
            textAreaForCalculation.setText(calculationString.toString());
            String result = Calculation.calculation(calculationString);
            labelForEstimated.setText(result);
        }
        scrollToEnd();
    }

    @FXML
    void onSevenButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("7");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();

    }

    @FXML
    void onSixButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("6");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }

    @FXML
    void onSubtractionButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && (lastIndexIsDigits(calculationString) || calculationString.charAt(lastIndex(calculationString)) == '%')) {
            calculationString.append("-");
            textAreaForCalculation.setText(calculationString.toString());
        }
        scrollToEnd();
    }

    @FXML
    void onThreeButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("3");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();

    }

    @FXML
    void onTwoButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("2");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }

    @FXML
    void onZeroButtonClick(ActionEvent event) {
        if (!calculationString.isEmpty() && calculationString.charAt(lastIndex(calculationString)) == '%'){
            calculationString.append("×");
        }
        calculationString.append("0");
        textAreaForCalculation.setText(calculationString.toString());
        String result = Calculation.calculation(calculationString);
        labelForEstimated.setText(result);
        scrollToEnd();
    }
    @FXML
    void aboutTrigger(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About!");
        alert.setHeaderText("About This Basic Calculator");
        alert.setContentText("This is my first personal project, a basic calculator.\nThanks for using it!");
        alert.showAndWait();
    }
    @FXML
    private void initialize(){
    }
    private void scrollToEnd(){
        textAreaForCalculation.positionCaret(calculationString.length());  // Scrolls to end
    }
}
