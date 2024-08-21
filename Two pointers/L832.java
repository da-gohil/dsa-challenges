class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // Loop through each row in the image
        for (int i = 0; i < image.length; i++) {
            // Step 1: Flip the row horizontally (reverse it)
            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {
                // Swap elements at `left` and `right`
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                // Move the pointers towards the center
                left++;
                right--;
            }

            // Step 2: Invert the values in the row
            for (int j = 0; j < image[i].length; j++) {
                // Invert the current element (0 becomes 1, 1 becomes 0)
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }

        // Return the modified image
        return image;
    }
}
