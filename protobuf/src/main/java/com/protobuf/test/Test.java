package com.protobuf.test;

import java.io.IOException;

import com.aaa.test.PersonEntity;
import com.aaa.test.PersonEntity.Person;
/*
 * 这个测试文件是用来模拟序列化和反序列化过程
 */
public class Test {
	 public static void main(String[] args) throws IOException {
	        //模拟将对象转成byte[]，方便传输
	        PersonEntity.Person.Builder builder = PersonEntity.Person.newBuilder();
	        builder.setId(1);
	        builder.setName("aaa");
	        builder.setEmail("111@s222.com");
	        PersonEntity.Person person = builder.build();
	        System.out.println("before :"+ person.toString());

	        System.out.println("===========Person Byte==========");
	        for(byte b : person.toByteArray()){
	            System.out.print(b);
	        }
	        System.out.println();
	        System.out.println(person.toByteString());
	        System.out.println("================================");

	        //模拟接收Byte[]，反序列化成Person类
	        byte[] byteArray =person.toByteArray();
	        Person p2 = Person.parseFrom(byteArray);
	        System.out.println("after :" +p2.toString());
	    }
}
