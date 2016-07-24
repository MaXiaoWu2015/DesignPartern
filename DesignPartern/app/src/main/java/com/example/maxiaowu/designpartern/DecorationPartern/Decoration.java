package com.example.maxiaowu.designpartern.DecorationPartern;

/**
 * Created by maxiaowu on 16/7/24.
 */
public class Decoration extends People {

    protected People people;
    public void decoratePeople(People people)
    {

        this.people=people;
    }

    @Override
    public void show() {
       if (people!=null)
             people.show();
        //new function
    }
}
