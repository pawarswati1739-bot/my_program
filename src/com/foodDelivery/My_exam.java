package com.foodDelivery;

import com.exam.Exam_System;

public class My_exam {
public static void main(String[] args) {
	Exam_System e;
	e=new online();
	e.examMode();
	
	e=new Offline();
	e.examMode();
	
	e=new Practicle();
	e.examMode();
	};
}
}
