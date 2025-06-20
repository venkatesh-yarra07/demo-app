package com.example.demo_app;

public class App {
    public static void main(String[] args) {
        System.out.println("✅ Application started successfully!");
        // Add your app logic here
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("⏳ App is still running...");
            } catch (InterruptedException e) {
                System.err.println("⚠ Interrupted!");
                break;
            }
        }
    }
}