package com.liepin.rim.org.day01.test11;

public abstract class Father {

    abstract Father method();

}

class Son{
    Father father = new Father() {
        @Override
        Father method() {

            return null;
        }
    }.method();
}
