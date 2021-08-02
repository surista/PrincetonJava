public class WorldMap {
    public static void main(String[] args) {


        // read in bounding box and rescale
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        String name = StdIn.readString();
        StdDraw.setCanvasSize(width, height);

        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        while (!StdIn.isEmpty()) {
            String loc = StdIn.readString();
            int verts = StdIn.readInt();

            double[] x = new double[verts];
            double[] y = new double[verts];

            for (int i = 0; i < verts,i++){
                x[0] = StdIn.readDouble();
                y[0] = StdIn.readDouble();
            }
            StdDraw.point()
        }

    }
}
