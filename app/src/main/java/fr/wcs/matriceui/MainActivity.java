package fr.wcs.matriceui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLinearLayout = findViewById(R.id.mainLinearLayout);

        // Début textView
        TextView textViewWelcome = new TextView(getApplicationContext());


        textViewWelcome.setText(R.string.welcome);
        textViewWelcome.setBackgroundColor(Color.rgb(255,20,147));

        LinearLayout.LayoutParams paramsTextView = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        paramsTextView.setMargins(0,20,0,0);


        textViewWelcome.setLayoutParams(paramsTextView);
        mainLinearLayout.addView(textViewWelcome);




        //Début checkBox

        CheckBox checkBox = new CheckBox(getApplicationContext());
        checkBox.setText(R.string.checkbox);

        LinearLayout.LayoutParams checkBoxParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        checkBoxParams.gravity = Gravity.CENTER;
        checkBoxParams.setMargins(0,50,0,0);

        checkBox.setLayoutParams(checkBoxParams);
        mainLinearLayout.addView(checkBox);


//////////////////////// Début FIRSTNAME

        LinearLayout linearlayoutFN = new LinearLayout(getApplicationContext());
        linearlayoutFN.setWeightSum(2);

        LinearLayout.LayoutParams linearLayoutMarginTop = new LinearLayout.LayoutParams(    //Uniquement pour la mise en page
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        linearLayoutMarginTop.setMargins(0,50,0,0);
        linearlayoutFN.setLayoutParams(linearLayoutMarginTop);



        //Début PlainText

        EditText plainTextFN = new EditText(getApplicationContext());

        plainTextFN.setHint(R.string.fn);

        LinearLayout.LayoutParams plainTextFNParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1);

        plainTextFN.setLayoutParams(plainTextFNParams);
        linearlayoutFN.addView(plainTextFN);


        //Début espace

        Space spaceFN = new Space(getApplicationContext());
        LinearLayout.LayoutParams spaceFNParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1);

        spaceFN.setLayoutParams(spaceFNParams);
        linearlayoutFN.addView(spaceFN);

        mainLinearLayout.addView(linearlayoutFN);

        //////////////////////////// Début LASTNAME

        LinearLayout linearlayoutLN = new LinearLayout(getApplicationContext());
        linearlayoutLN.setWeightSum(2);



        //Début PlainText

        EditText plainTextLN = new EditText(getApplicationContext());

        plainTextLN.setHint(R.string.ln);

        LinearLayout.LayoutParams plainTextLNParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1);

        plainTextLN.setLayoutParams(plainTextLNParams);
        linearlayoutLN.addView(plainTextLN);



        //Début espace

        Space spaceLN = new Space(getApplicationContext());
        LinearLayout.LayoutParams spaceLNParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT,
                1);


        spaceLN.setLayoutParams(spaceLNParams);
        linearlayoutLN.addView(spaceLN);
        mainLinearLayout.addView(linearlayoutLN);



        // Début boutton

        Button button = new Button(getApplicationContext());
        button.setText(R.string.accept);

        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        button.setLayoutParams(buttonParams);
        mainLinearLayout.addView(button);









    }
}