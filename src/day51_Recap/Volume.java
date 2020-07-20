package day51_Recap;

/*
2. create an interface named Volume
			variable: boolean hasVolume
			abstract method: calculateVolume() ==> returns double

	3. create an interface named PI
			variable: PI

			(created Volume & PI within same Java file)

 */

public interface Volume {
    boolean hasVolume = true;

    double calculateVolume();

}

interface PI{
    double PI = 3.14;

}
