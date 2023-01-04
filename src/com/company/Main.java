package com.company;

class Multi extends Thread{
    private String name;
    Multi(String name){
     this.name = name;
    }
    public void run(){
        System.out.println("thread " + this.name + "is running");
    }
    public static void main(String args[]){
        for(int i =0;i<5;i++){
            new Multi("thread"+Integer.toString(i)).start();
        }
    }
}