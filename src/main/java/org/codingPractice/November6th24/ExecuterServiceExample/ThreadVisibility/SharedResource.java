package org.codingPractice.November6th24.ExecuterServiceExample.ThreadVisibility;

class SharedResource {
    private volatile boolean flag = false;

    public void setFlag() {
        this.flag = true;
    }

    public boolean getFlag() {
        return this.flag;
    }
}




