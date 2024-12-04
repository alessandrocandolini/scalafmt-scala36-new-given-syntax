package com.xyz

trait Show[A]:
  def show(a: A): String

given Show[String]:
  def show(a: String): String = a

//given Show[String] with
  //def show(a: String): String = a

@main def hello() = println("Hello, World")
