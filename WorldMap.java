public class WorldMap {
    public static void main(String[] args) {

        // get and set canvas dimensions
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);

        // scale x and y coordinates
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        StdDraw.setPenRadius(0.001);

        // read each block in specific order:
        // location name, # of vertices, coordinates via arrays
        while (!StdIn.isEmpty()) {
            String loc = StdIn.readString();
            int verts = StdIn.readInt();

            double[] x = new double[verts];
            double[] y = new double[verts];

            for (int i = 0; i < verts; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            //last part of while loop is to draw the shape
            StdDraw.polygon(x, y);
        }
    }
}

