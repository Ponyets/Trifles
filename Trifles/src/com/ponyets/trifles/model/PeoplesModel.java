package com.ponyets.trifles.model;

import java.util.ArrayList;
import java.util.List;

import com.appspot.api.services.peopleendpoint.model.People;

public class PeoplesModel {
    private static PeoplesModel sInstance = new PeoplesModel();
    private final List<People> mPeopleList;

    public static PeoplesModel getInstance() {
        return sInstance;
    }

    private PeoplesModel() {
        mPeopleList = new ArrayList<People>();
    }

    public boolean addPeople(People people) {
        return mPeopleList.add(people);
    }

    public boolean remove(People people) {
        return mPeopleList.remove(people);
    }

    public void clear() {
        mPeopleList.clear();
    }

    public List<People> getPeopleList() {
        return new ArrayList<People>(mPeopleList);
    }

    public boolean contain(People people) {
        return mPeopleList.contains(people);
    }
}
