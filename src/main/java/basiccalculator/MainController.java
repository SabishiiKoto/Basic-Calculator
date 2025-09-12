package basiccalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private AnchorPane upperAnchorPane;
    @FXML
    private AnchorPane lowerAnchorPane;
    @FXML
    private MenuBar menuBar;

    @FXML
    private Button acButtonStyle;

    @FXML
    private Button addingButtonStyle;

    @FXML
    private Button decimalButtonStyle;

    @FXML
    private Button deleteButtonStyle;

    @FXML
    private Button divisionButtonStyle;

    @FXML
    private Button eightButtonStyle;

    @FXML
    private Button equalButtonStyle;

    @FXML
    private Button fiveButtonStyle;

    @FXML
    private Button fourButtonStyle;

    @FXML
    private Label labelForEstimated;

    @FXML
    private Button multiplyButtonStyle;

    @FXML
    private Button nineButtonStyle;

    @FXML
    private Button oneButtonStyle;

    @FXML
    private Button percentageButtonStyle;

    @FXML
    private Button sevenButtonStyle;

    @FXML
    private Button sixButtonStyle;

    @FXML
    private Button subtractButtonStyle;

    @FXML
    private TextField textAreaForCalculation;

    @FXML
    private Button threeButtonStyle;

    @FXML
    private Button twoButtonStyle;

    @FXML
    private Button zeroButtonStyle;

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
    void blueColorTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #0196C1;");

        upperAnchorPane.setStyle("-fx-background-color: #B3E0EE;");
        textAreaForCalculation.setStyle("-fx-background-color: #E8F9FD;-fx-text-fill: #046C95  ;");
        labelForEstimated.setStyle("-fx-text-fill: #0196C1 ;");

        lowerAnchorPane.setStyle("-fx-background-color: #B3E0EE;");

        String style = "-fx-background-color: #48b5d6; -fx-text-fill: #E8F9FD;";
        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle("-fx-background-color: #0196c1 ; -fx-text-fill: #E8F9FD;");


    }

    @FXML
    void pinkColorTrigger(ActionEvent event) { // code: EABEC3, DD868C, F5DDE0, D0637C, FFF0F3
        menuBar.setStyle("-fx-background-color: #EABEC3;");

        upperAnchorPane.setStyle("-fx-background-color: #F5DDE0;");
        textAreaForCalculation.setStyle("-fx-background-color: #FFF0F3 ;-fx-text-fill: #D0637C;");
        labelForEstimated.setStyle("-fx-text-fill: #DD868C;");

        lowerAnchorPane.setStyle("-fx-background-color: #F5DDE0;");

        String style = "-fx-background-color: #DD868C; -fx-text-fill: #FFF0F3 ;";
        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle(style);
    }

    @FXML
    void greenColorTrigger(ActionEvent event) { // code: 549895, 387271, 8EBCB1, 245254, D6F5E9
        menuBar.setStyle("-fx-background-color: #549895;");

        upperAnchorPane.setStyle("-fx-background-color: #8EBCB1;");
        lowerAnchorPane.setStyle("-fx-background-color: #8EBCB1;");

        textAreaForCalculation.setStyle("-fx-background-color: #D6F5E9 ;-fx-text-fill: #245254;");
        labelForEstimated.setStyle("-fx-text-fill: #387271;");

        String style = "-fx-background-color: #387271; -fx-text-fill: #D6F5E9;";

        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle("-fx-background-color: #245254; -fx-text-fill: #D6F5E9;");
    }


    @FXML
    void vintageColorTrigger(ActionEvent event) { // code: F6BD60,84A59D, F7EDE2,F28482, FEF9EF
        menuBar.setStyle("-fx-background-color: #F6BD60;");

        upperAnchorPane.setStyle("-fx-background-color: #F7EDE2;");
        textAreaForCalculation.setStyle("-fx-background-color: #FEF9EF;-fx-text-fill: #F28482;");
        labelForEstimated.setStyle("-fx-text-fill: #84A59D;");

        lowerAnchorPane.setStyle("-fx-background-color: #F7EDE2;");

        String style = "-fx-background-color: #84A59D; -fx-text-fill: #FEF9EF;";

        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle("-fx-background-color: #F28482; -fx-text-fill: FEF9EF;");

    }

    @FXML
    void darkColorTrigger(ActionEvent event) {
        menuBar.setStyle("-fx-background-color: #2B2F6C;");

        upperAnchorPane.setStyle("-fx-background-color: #564779;");
        textAreaForCalculation.setStyle("-fx-background-color: #000c43;-fx-text-fill: #DE978F;");
        labelForEstimated.setStyle("-fx-text-fill: #DE978F;");

        lowerAnchorPane.setStyle("-fx-background-color: #564779;");

        String style = "-fx-background-color: #2B2F6C; -fx-text-fill: #DE978F;";

        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle(style);
//        equalButtonStyle.setStyle("-fx-background-color: #000c43; -fx-text-fill: #DE978F;");

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
        if (calculationString.isEmpty()){
            calculationString.append("-");
            textAreaForCalculation.setText(calculationString.toString());
        }
        else if ((lastIndexIsDigits(calculationString) || calculationString.charAt(lastIndex(calculationString)) == '%')) {
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
        alert.setTitle("About This Basic Calculator!");
        alert.setHeaderText("Information and Contact");
        alert.setContentText("I hope you enjoy the app! Please contact me if you see any error.\nFor contact, check out my GitHub:\nhttps://github.com/SabishiiKoto");
        Image image = new Image(getClass().getResource("/assets/Sabii's avatar.jpeg").toExternalForm());
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(70);
        imageView.setFitWidth(70);
        alert.setGraphic(imageView);
        alert.showAndWait();
    }
    @FXML
    private void initialize(){
        menuBar.setStyle("-fx-background-color: #F6BD60;");

        upperAnchorPane.setStyle("-fx-background-color: #F7EDE2;");
        textAreaForCalculation.setStyle("-fx-background-color: #FEF9EF;-fx-text-fill: #F28482;");
        labelForEstimated.setStyle("-fx-text-fill: #84A59D;");

        lowerAnchorPane.setStyle("-fx-background-color: #F7EDE2;");

        String style = "-fx-background-color: #84A59D; -fx-text-fill: #FEF9EF;";

        zeroButtonStyle.setStyle(style);
        oneButtonStyle.setStyle(style);
        twoButtonStyle.setStyle(style);
        threeButtonStyle.setStyle(style);
        fourButtonStyle.setStyle(style);
        fiveButtonStyle.setStyle(style);
        sixButtonStyle.setStyle(style);
        sevenButtonStyle.setStyle(style);
        eightButtonStyle.setStyle(style);
        nineButtonStyle.setStyle(style);

        decimalButtonStyle.setStyle(style);
        percentageButtonStyle.setStyle(style);
        divisionButtonStyle.setStyle(style);
        multiplyButtonStyle.setStyle(style);
        subtractButtonStyle.setStyle(style);
        addingButtonStyle.setStyle(style);
        acButtonStyle.setStyle(style);
        deleteButtonStyle.setStyle(style);
        equalButtonStyle.setStyle("-fx-background-color: #F28482; -fx-text-fill: FEF9EF;");
    }
    private void scrollToEnd(){
        textAreaForCalculation.positionCaret(calculationString.length());  // Scrolls to end
    }
}
