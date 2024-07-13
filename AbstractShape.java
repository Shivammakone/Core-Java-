
abstract class Shape
{
	abstract void cal_area();
	abstract void cal_volume();
}

class Sphere extends Shape
{
	float r;
	Sphere (float r)
	{
		this.r=r;	
	}
	void cal_area()
	{
		float a=4*3.14f*r*r;
		System.out.println("Area of sphere="+a);
	}
	void cal_volume()
	{
		float v=4/3*3.14f*r*r*r;
		System.out.println("Volume of sphere="+v);
	}

}

class Cone extends Shape
{
	float rc,h;
	Cone (float rc,float h)
	{
		this.rc=rc;	
		this.h=h;
	}
	void cal_area()
	{
		float ca=4*3.14f*rc*rc;
		System.out.println("Area of Cone="+ca);
	}
	void cal_volume()
	{
		float cv=4/3*3.14f*rc*rc*rc;
		System.out.println("Volume of sphere="+cv);
	}

}

class MSB 
{
	public static void main(String abc[])
	{
		Sphere ob=new Sphere(3.5f);
		ob.cal_area();
		ob.cal_volume();
		Cone ob1=new Cone(5.6f,7.4f);
		ob1.cal_area();
		

	}
}  

/*

abstract class Shape 
{
    abstract void cal_area();
    abstract void cal_volume();
}

class Sphere extends Shape {
    float r;

    Sphere(float r) {
        this.r = r;
    }

    void cal_area() {
        float a = 4 * 3.14f * r * r;
        System.out.println("Area of sphere = " + a);
    }

    void cal_volume() {
        float v = (4.0f / 3.0f) * 3.14f * r * r * r;
        System.out.println("Volume of sphere = " + v);
    }
}

class Cone extends Shape {
    float rc, h;

    Cone(float rc, float h) {
        this.rc = r;
        this.h = h;
    }

    void cal_area() {
        float slantHeight = (float) Math.sqrt(r * r + h * h);
        float lateralSurfaceArea = 3.14f * r * slantHeight;
        float baseArea = 3.14f * r * r;
        float totalSurfaceArea = lateralSurfaceArea + baseArea;
        System.out.println("Area of cone = " + totalSurfaceArea);
    }

    void cal_volume() {
        float v = (3.14f * r * r * h) / 3;
        System.out.println("Volume of cone = " + v);
    }
}

class MSB {
    public static void main(String[] args) {
        Sphere ob = new Sphere(3.5f);
        ob.cal_area();
        ob.cal_volume();

        Cone ob1 = new Cone(5.6f, 7.4f);
        ob1.cal_area();
        ob1.cal_volume();
    }
}
*/