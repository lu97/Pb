package com.example.pb.ui.question;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuestionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public QuestionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Страница для обратной связи - вопросы и предложения");
    }

    public LiveData<String> getText() {
        return mText;
    }
}