public class Main {
    public static void main(String[] args) {
        Point2d point2d=new Point2d(8,9);
        System.out.println(point2d);

        Point3d point3d =new Point3d(1,2,3);
        System.out.println(point3d);
        System.out.println(point3d.getX());
        point3d.setXYZ(5,6,7);
        System.out.println(point3d);
    }
}
