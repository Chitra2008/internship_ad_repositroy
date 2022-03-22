package com.mastek.demo.model;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
 
    private void setRedBorder(Shape decoratedShape)
    {
      // Display message whenever function is called
        System.out.println("Border Color: Red");
    }
}
