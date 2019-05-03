package com.felipehb.designpatterns.behavioral.command;

public class TextFileOperationExecutorDemo {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor
                = new TextFileOperationExecutor();
        System.out.println(textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt"))));
        System.out.println(textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file2.txt"))));
    }
}
