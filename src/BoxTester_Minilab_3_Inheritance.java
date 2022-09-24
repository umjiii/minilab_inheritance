// This will run test cases for the Box class that is a subclass of Rectangle.
//  THERE IS NO PROMPT, but it is expecting input of the form "testing <what to test>"

public class BoxTester_Minilab_3_Inheritance
{
	public static void main(String[] args)
	{
		//get the arguments for the test
		java.util.Scanner kb = new java.util.Scanner(System.in);
		String test = kb.nextLine();

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing parameterized constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			int[ ] widthArray = { 2, 3};
			int[ ] heightArray = { 5, 7 };
			int[ ] depthArray = { 1, 6 };

			for (int widthCoeffIndex=0; widthCoeffIndex<widthArray.length; widthCoeffIndex++)
				for (int heightCoeffIndex=0; heightCoeffIndex<heightArray.length; heightCoeffIndex++)
					for (int depthCoeffIndex=0; depthCoeffIndex<depthArray.length; depthCoeffIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing parameterized constructor/toString(): passing in " +
										widthArray[widthCoeffIndex] + "  and  " +
										heightArray[heightCoeffIndex] + "  and  " +
										depthArray[depthCoeffIndex]);
						try
						{
							Box theBox = new Box(	widthArray[widthCoeffIndex],
																		heightArray[heightCoeffIndex],
																		depthArray[depthCoeffIndex]);
							System.out.println(theBox);
						}
						catch (Throwable ex)
						{
							System.out.println(ex.getClass().getName());
							//ex.printStackTrace();         //in case the user wants more information on the exception
						}
					}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing default constructor") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			if (printDescription)
				System.out.println("==>Testing default constructor/toString()");

			try
			{
				Box theBox = new Box();
				System.out.println(theBox);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
		}

		//***************************************************
		//***************************************************
		if (test.equalsIgnoreCase("testing getPerimeter") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = false;

			Box theBox = null;
			String origToString = "<empty>";

			try
			{
				theBox = new Box(7, 3, 4);
				origToString = theBox.toString();
				if (printDescription)
					System.out.println("==>Testing " + theBox + " 's .getPerimeter()");
				int result = theBox.getPerimeter();
				System.out.println(result);
			}
			catch (Throwable ex)
			{
				System.out.println(ex.getClass().getName());
				//ex.printStackTrace();         //in case the user wants more information on the exception
			}
			finally
			{
				if (checkChanges && !theBox.toString().equals(origToString))
					System.out.println("...but the original Box CHANGED during the operation");
			}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing getSumOfDimensions") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			Box theBox = null;
			String origToString = "<empty>";

			int[ ] widthArray = { 2, 8};
			int[ ] heightArray = { 5, 7 };
			int[ ] depthArray = { 1, 6 };

			for (int widthCoeffIndex=0; widthCoeffIndex<widthArray.length; widthCoeffIndex++)
				for (int heightCoeffIndex=0; heightCoeffIndex<heightArray.length; heightCoeffIndex++)
					for (int depthCoeffIndex=0; depthCoeffIndex<depthArray.length; depthCoeffIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing getSumOfDimensions(), on a Box created with " +
										widthArray[widthCoeffIndex] + "  and  " +
										heightArray[heightCoeffIndex] + "  and  " +
										depthArray[depthCoeffIndex]);
						try
						{
							theBox = new Box(	widthArray[widthCoeffIndex],
																heightArray[heightCoeffIndex],
																depthArray[depthCoeffIndex]);
							origToString = theBox.toString();

							int result = theBox.getSumOfDimensions();
							System.out.println(result);
						}
						catch (Throwable ex)
						{
							System.out.println(ex.getClass().getName());
							//ex.printStackTrace();         //in case the user wants more information on the exception
						}
						finally
						{
							if (checkChanges && !theBox.toString().equals(origToString))
								System.out.println("...but the original Box CHANGED during the operation");
						}
					}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing getWidth") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			Box theBox = null;
			String origToString = "<empty>";

			int[ ] widthArray = { 2, 8};
			int[ ] heightArray = { 5, 7 };
			int[ ] depthArray = { 1, 6 };

			for (int widthCoeffIndex=0; widthCoeffIndex<widthArray.length; widthCoeffIndex++)
				for (int heightCoeffIndex=0; heightCoeffIndex<heightArray.length; heightCoeffIndex++)
					for (int depthCoeffIndex=0; depthCoeffIndex<depthArray.length; depthCoeffIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing getWidth(), on a Box created with " +
										widthArray[widthCoeffIndex] + "  and  " +
										heightArray[heightCoeffIndex] + "  and  " +
										depthArray[depthCoeffIndex]);
						try
						{
							theBox = new Box(	widthArray[widthCoeffIndex],
																heightArray[heightCoeffIndex],
																depthArray[depthCoeffIndex]);
							origToString = theBox.toString();

							int result = theBox.getWidth();
							System.out.println(result);
						}
						catch (Throwable ex)
						{
							System.out.println(ex.getClass().getName());
							//ex.printStackTrace();         //in case the user wants more information on the exception
						}
						finally
						{
							if (checkChanges && !theBox.toString().equals(origToString))
								System.out.println("...but the original Box CHANGED during the operation");
						}
					}
		}

		//***************************************************
		//***************************************************

		if (test.equalsIgnoreCase("testing getSurfaceArea") ||
			test.equalsIgnoreCase("testing all"))
		{
			System.out.println("\n-----------------------------\n");
			boolean printDescription = true;
			boolean checkChanges = true;

			Box theBox = null;
			String origToString = "<empty>";

			int[ ] widthArray = { 2, 8};
			int[ ] heightArray = { 5, 7 };
			int[ ] depthArray = { 1, 6 };

			for (int widthCoeffIndex=0; widthCoeffIndex<widthArray.length; widthCoeffIndex++)
				for (int heightCoeffIndex=0; heightCoeffIndex<heightArray.length; heightCoeffIndex++)
					for (int depthCoeffIndex=0; depthCoeffIndex<depthArray.length; depthCoeffIndex++)
					{
						if (printDescription)
							System.out.println("==>Testing getSurfaceArea(), on a Box created with " +
										widthArray[widthCoeffIndex] + "  and  " +
										heightArray[heightCoeffIndex] + "  and  " +
										depthArray[depthCoeffIndex]);
						try
						{
							theBox = new Box(	widthArray[widthCoeffIndex],
																heightArray[heightCoeffIndex],
																depthArray[depthCoeffIndex]);
							origToString = theBox.toString();

							int result = theBox.getSurfaceArea();
							System.out.println(result);
						}
						catch (Throwable ex)
						{
							System.out.println(ex.getClass().getName());
							//ex.printStackTrace();         //in case the user wants more information on the exception
						}
						finally
						{
							if (checkChanges && !theBox.toString().equals(origToString))
								System.out.println("...but the original Box CHANGED during the operation");
						}
					}
		}

	}
}
