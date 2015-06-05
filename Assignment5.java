/*This method reverses the picture in the horizontal dimension.*/
private GImage flipHorizontal(GImage image){
	int array = image.getPixelArray();
	int height = array.length;
	int width = array[0].length;

	for(int i = 0; i < heigth; i++){
		for(int p1 = 0; p1 < width/2; p1++){
			int p2 =width - p1 -1;
			int temp = array[i][p1];
			array[i][p1] = array[i][p2];
			array[i][p2] = temp;

		}
	}
	return new GImage(array);
}

/*
*This program asks the user for a list of names (one per line) until the user enters a
*blank line (i.e., just hits return when asked for a name). At that point the program should
*print out how many times each name in the list was entered.
*/
public class CountNames {

Map<String,Integer> nameCounts = new HashMap<String, Integer>();

while(true){
	String name = readLine("Enter name:");
	if name.equals(""){
		break;
	}else if(nameCounts.get(name) == null){
		nameCounts.put(name, 1);
	}else{
		nameCounts.put(name, nameCounts.get(name)+1);
	}
}

for(String name : nameCounts.keySet()){
	Integer counts = nameCounts.get(name);
	println("Entry [" + name + "] has count " + counts );
}
}