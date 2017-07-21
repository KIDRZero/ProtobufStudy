package com.protobuf.util;

import java.io.IOException;

public class GenerareClass {
	 public static void main(String[] args) {
	        String protoFile = "person-entity.proto";//  
	        String strCmd = "F:/protobuf-master/protobuf-master/src/protoc.exe -I=./proto --java_out=./src/main/java ./proto/"+ protoFile;  
	        try {
	            Runtime.getRuntime().exec(strCmd);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }//通过执行cmd命令调用protoc.exe程序  
	    }
}
