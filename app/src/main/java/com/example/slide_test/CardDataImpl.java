package com.example.slide_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CardDataImpl implements ECCardData<String> {

    private String cardTitle;
    private Integer mainBackgroundResource;
    private Integer headBackgroundResource;
    private List<String> listItems;

    public CardDataImpl(String cardTitle, Integer mainBackgroundResource, Integer headBackgroundResource, List<String> listItems) {
        this.mainBackgroundResource = mainBackgroundResource;
        this.headBackgroundResource = headBackgroundResource;
        this.listItems = listItems;
        this.cardTitle = cardTitle;
    }

    @Override
    public Integer getMainBackgroundResource() {
        return mainBackgroundResource;
    }

    @Override
    public Integer getHeadBackgroundResource() {
        return headBackgroundResource;
    }

    @Override
    public List<String> getListItems() {
        return listItems;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public static List<ECCardData> generateExampleData() {
        List<ECCardData> list = new ArrayList<>();
        list.add(new CardDataImpl("첫번째 사진", R.drawable.attractions, R.drawable.attractions_head, createItemsList("Card 1")));
        list.add(new CardDataImpl("두번째 사진", R.drawable.city_scape, R.drawable.city_scape_head, createItemsList("Card 2")));
        list.add(new CardDataImpl("세번째 사진", R.drawable.nature, R.drawable.nature_head, createItemsList("Card 3")));
        return list;
    }

    private static List<String> createItemsList(String cardName) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                "내용 1",
                "내용 2",
                "내용 3"
        ));
        return list;
    }
}