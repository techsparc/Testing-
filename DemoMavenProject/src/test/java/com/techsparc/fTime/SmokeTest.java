package com.techsparc.fTime;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SmokeTest {

	@BeforeClass
	public static void openFridge() {

		System.out.println("Open Fridge");
	}

	@Before
	public void fruits() {

		System.out.println("Apples, oranges and mangoes");

	}

	@Test
	public void fruit1() {
		System.out.println("apple");
	}

	@Test
	public void fruit2() {

		System.out.println("Mango");
	}

	@After

	public void washFruit() {

		System.out.println("wash fruits");
	}

	@AfterClass
	public static void eatFruit() {

		System.out.println("enjoy yummy fruit");
	}
}
