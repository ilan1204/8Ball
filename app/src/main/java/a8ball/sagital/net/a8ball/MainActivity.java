package a8ball.sagital.net.a8ball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button clickButton;
    ImageView myBallImg;
    TextView questionLbl;
    String questions[] = setUpQuestions();
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myBallImg = findViewById(R.id.ballImg);
        clickButton = findViewById(R.id.clickBtn);
        questionLbl = findViewById(R.id.qlbl);

        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                pos = rnd.nextInt(5);

                int bmpArr[] = {R.drawable.ball1,
                                R.drawable.ball2,
                                R.drawable.ball3,
                                R.drawable.ball4,
                                R.drawable.ball5};

                myBallImg.setImageResource(bmpArr[pos]);
                questionLbl.setText(questions[rnd.nextInt(5)]);
            };

        });

     };

    public String[] setUpQuestions(){
        String smallArr[] = {"Will i get rich?","Are you Human?","Do you have fillings?","Should i rob a bank and buy me a new Ferrari?","Who is the richest man after me of course?"};
        return  smallArr;
    };
};