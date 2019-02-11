

<<< Webpage >>> 
	
	Small issues with Navbar, but still usable

	Web browser
		Chrome Version 72.0.3626.96 (Official Build) (64-bit)


<<< Widget >>>
	
	Json data was stored either in a .js file or in an object. I didn't have a key to the api so I was unable to access with HttpRequest. 
	
	Plain Widget.html 
		Json data displayed in a HTML table 

	ExtJS Widget.html
		Utilized EXT widget library to create table. Componenet: Grid



<<< ZeroCool >>>

	Testing
		The testing must be done manually. First input the expected ZeroCool string into the assertEquals statment, then set the size of the array. If the array size doesn't match the number of indeces in the expected ZeroCool string, the test will fail

	Methods
		reduceArraySize - resize the array from 0 to n. This allows you to use Junit package for testing






<<< Directions >>>

	Design Implementation
		Break this design into a functional web page using any tools/techniques you prefer
		https://drive.google.com/file/d/1x80uTAdvXz_UNb4z2eJt6v8YziSI4tRt/view?usp=sharing

		The individual ads and widgets do not need to be broken down into HTML elements they can be represented by flat images. Those pieces are highlighted in red in the image linked below.
		https://drive.google.com/file/d/1EF7ypKx-b3nO2U3e_Go58YmQ0FoFmI7h/view?usp=sharing

		Since this is a flat file and not a layered Photoshop/Sketch document font choices, colors, etc can be chosen to match as closely as possible. The finished page should look good on multiple screen sizes.

	Custom Javascript Widget
		Create a custom widget starting with this structured JSON file:
		https://api.stagingjobshq.com/madgexWidgetJobs.php?callback=displayJobs&city=Moorhead&state=Minnesota

		The finished widget should display some basic information about the first 5 items in the feed such as title, short description, business name(recruiter) and link to that items landing page.
		The widget should fit within a standard ad size of 300px wide by 600px tall.
		Design is up to you.

	Zerocool
		Write a program that prints the numbers from 1 to 100.
		But for multiples of three print "Zero" instead of the number and for the multiples of five print "Cool".
		For numbers which are multiples of both three and five print "ZeroCool".
		This can be written in any language but please provide for a way to test it.