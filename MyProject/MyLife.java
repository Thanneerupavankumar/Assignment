package MyProject;
public class MyLife {
public static void main(String[] args) {


		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");

		menuOptions.printWelcomeScreen("MyLife", "Pavan");

		HandleOption.handleWelcomeScreenInput();
		}
}