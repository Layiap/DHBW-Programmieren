package de.dhbwka.java.exercise.control;

public class ShoeSize {

	public static void main(String[] args) {

		float steps = 0.67f;

		System.out.println(" Zentimeter | Größe");
		System.out.println("-------------------");

		for (int i = 30; i < 50; i++) {

			float to = Math.round((i / 1.5f) * 100) / 100f;
			float from = Math.round((to - steps) * 100) / 100f;

			System.out.printf("%2.2f - %2.2f     |  %2d\n", from, to, i);
		}
	}
}
