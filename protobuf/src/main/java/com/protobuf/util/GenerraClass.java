package com.protobuf.util;

import java.io.IOException;

public class GenerraClass {
	 public static void main(String[] args) {
	        String protoFile = "test.proto";//  
	        String strCmd = "F:/protobuf-master/protobuf-master/src/protoc.exe -I=./proto2 --java_out=./src/main/java ./proto2/"+ protoFile;
	        try {
	            Runtime.getRuntime().exec(strCmd);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }//通过执行cmd命令调用protoc.exe程序  
	    }
}
