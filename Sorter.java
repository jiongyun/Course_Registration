package oop_ownproject;

import java.util.Comparator;

public class Sorter implements Comparator<Course>{
	public int compare(Course one, Course another){
        int returnVal = 0;

    if(one.getCurr() < another.getCurr()){
        returnVal =  -1;
    }else if(one.getCurr() > another.getCurr()){
        returnVal =  1;
    }else if(one.getCurr() == another.getCurr()){
        returnVal =  0;
    }
    return returnVal;
    }
}


