package Intermediate_JAVA;

class ThreeDArrayDemo {
    public static void main(String[] args) {
        // Define a 3D array with dimensions 3x3x3
        int[][][] array3D = new int[3][3][3];

        // Populate the 3D array with values
        int value = 1;
        for (int i = 0; i < array3D.length; i++) { // Loop over each layer
            for (int j = 0; j < array3D[i].length; j++) { // Loop over each row in the layer
                for (int k = 0; k < array3D[i][j].length; k++) { // Loop over each column in the row
                    array3D[i][j][k] = value; // Assign value
                    value++; // Increment value for demonstration purposes
                }
            }
        }

        // Print the 3D array
        System.out.println("3D Array elements:");
        for (int i = 0; i < array3D.length; i++) { // Loop over each layer
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < array3D[i].length; j++) { // Loop over each row in the layer
                for (int k = 0; k < array3D[i][j].length; k++) { // Loop over each column in the row
                    System.out.print(array3D[i][j][k] + " "); // Print each element
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // New line after each layer
        }
    }
}
