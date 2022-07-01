class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (x, y) -> y[1] - x[1]);
        int count = 0, size = boxTypes.length;
        for (int i = 0; i < size && truckSize > 0; ++i) {
            int boxes = boxTypes[i][0];
            int units = boxTypes[i][1];
            truckSize -= boxes;
            count += boxes * units;
            if (truckSize < 0) {
                count += truckSize * units;
                break;
            }
        }
        return count;
    }
}