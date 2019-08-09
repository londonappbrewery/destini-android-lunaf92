package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTopButtonTextView;
    Button mBottomButtonTextView;
    TextView mStoryTextView;

    int mStory;
    int mTopButton;
    int mBottomButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mTopButtonTextView = findViewById(R.id.buttonTop);
        mBottomButtonTextView = findViewById(R.id.buttonBottom);

        mStory = R.string.T1_Story;
        mTopButton = R.string.T1_Ans1;
        mBottomButton = R.string.T1_Ans2;
        mStoryTextView.setText(mStory);
        mTopButtonTextView.setText(mTopButton);
        mBottomButtonTextView.setText(mBottomButton);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButtonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStory == R.string.T3_Story){
                    mStory = R.string.T6_End;
                    mStoryTextView.setText(mStory);
                    mTopButtonTextView.setVisibility(View.GONE);
                    mBottomButtonTextView.setVisibility(View.GONE);
                }else{
                    mStory = R.string.T3_Story;
                    mTopButton = R.string.T3_Ans1;
                    mBottomButton = R.string.T3_Ans2;
                    mStoryTextView.setText(mStory);
                    mTopButtonTextView.setText(mTopButton);
                    mBottomButtonTextView.setText(mBottomButton);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButtonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStory == R.string.T2_Story){
                    mStory = R.string.T4_End;
                    mStoryTextView.setText(mStory);
                    mTopButtonTextView.setVisibility(View.GONE);
                    mBottomButtonTextView.setVisibility(View.GONE);
                }else if (mStory == R.string.T3_Story){
                    mStory = R.string.T5_End;
                    mStoryTextView.setText(mStory);
                    mTopButtonTextView.setVisibility(View.GONE);
                    mBottomButtonTextView.setVisibility(View.GONE);
                }else{
                    mStory = R.string.T2_Story;
                    mTopButton = R.string.T2_Ans1;
                    mBottomButton = R.string.T2_Ans2;
                    mStoryTextView.setText(mStory);
                    mTopButtonTextView.setText(mTopButton);
                    mBottomButtonTextView.setText(mBottomButton);
                }

            }
        });

    }
}
