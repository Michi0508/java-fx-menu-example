package com.example.java;
// Importamos JavaFx y dependencias
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Insertar imagen de sublime text
        ImageView imageView = new ImageView(new Image("C:\\sublime_text.png"));

        // CREACIÓN DE MENÚS
        // Paso 1. Crear la Barra de Menús
        MenuBar barraMenu = new MenuBar();

        // Paso 2. Crear los Menús
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuSelection = new Menu("Selection");
        Menu menuFind = new Menu("Find");
        Menu menuView = new Menu("View");
        Menu menuGoto = new Menu("Goto");
        Menu menuTools = new Menu("Tools");
        Menu menuProject = new Menu("Project");
        Menu menuPreferences = new Menu("Preferences");
        Menu menuHelp = new Menu("Help");
        // ...

        // Paso 3. Creamos los submenús
        //  para File
        Menu submenuOpenRecent = new Menu("    Open Recent");
        Menu submenuReopenWithEncodings = new Menu("    Reopen with Encodings");
        Menu submenuSaveWithEncodings = new Menu("    Save with Encodings");
        submenuOpenRecent.getItems().add(new MenuItem("    Reopen Closed File"));
        submenuOpenRecent.getItems().add(new MenuItem("    Clear Items"));
        submenuReopenWithEncodings.getItems().add(new MenuItem("    UTF-8"));
        submenuReopenWithEncodings.getItems().add(new MenuItem("    UTF-16"));
        submenuSaveWithEncodings.getItems().add(new MenuItem("    UTF-8"));
        submenuSaveWithEncodings.getItems().add(new MenuItem("    UTF-16"));

        // Submenu para Edit
        Menu submenuUndoSelection = new Menu("    Undo Selection");
        submenuUndoSelection.getItems().add(new MenuItem("    Soft Undo"));
        submenuUndoSelection.getItems().add(new MenuItem("    Soft Redo"));

        // Submenu para Selection
        Menu submenuTabSelection = new Menu("    Tab Selection");
        submenuTabSelection.getItems().add(new MenuItem("    Unselect Others"));
        submenuTabSelection.getItems().add(new MenuItem("    Unselect to Left"));
        submenuTabSelection.getItems().add(new MenuItem("    Unselect to Right"));
        submenuTabSelection.getItems().add(new MenuItem("    Select to Left"));
        submenuTabSelection.getItems().add(new MenuItem("    Select to Right"));
        submenuTabSelection.getItems().add(new MenuItem("    Focus to Left"));
        submenuTabSelection.getItems().add(new MenuItem("    Focus to Right"));

        // Submenu para Find
        Menu submenuFindResults = new Menu("    Find Results");
        submenuFindResults.getItems().add(new MenuItem("    Show Results Panel"));
        submenuFindResults.getItems().add(new MenuItem("    Next Result"));
        submenuFindResults.getItems().add(new MenuItem("    Previous Result"));

        // Submenu para View
        Menu submenuSideBar = new Menu("    Side Bar");
        submenuSideBar.getItems().add(new MenuItem("    Hide Side Bar"));
        submenuSideBar.getItems().add(new MenuItem("    Show Open Files"));

        // Submenu para Goto
        Menu submenuSwitchFile = new Menu("    Switch File");
        submenuSwitchFile.getItems().add(new MenuItem("    Next File"));
        submenuSwitchFile.getItems().add(new MenuItem("    Previous File"));
        submenuSwitchFile.getItems().add(new MenuItem("    Next File in Stack"));
        submenuSwitchFile.getItems().add(new MenuItem("    Previous File in Stack"));
        submenuSwitchFile.getItems().add(new MenuItem("    Switch header in Implementation"));
        Menu submenuScroll = new Menu("    Scroll");
        submenuScroll.getItems().add(new MenuItem("    Scroll to Selection"));
        submenuScroll.getItems().add(new MenuItem("    Line Up"));
        submenuScroll.getItems().add(new MenuItem("    Line Down"));
        Menu submenuBookMarks = new Menu("    Bookmarks");
        submenuBookMarks.getItems().add(new MenuItem("    Toggle Bookmark"));
        submenuBookMarks.getItems().add(new MenuItem("    Next Bookmark"));
        submenuBookMarks.getItems().add(new MenuItem("    Prev Bookmark"));
        submenuBookMarks.getItems().add(new MenuItem("    Clear Bookmark"));
        submenuBookMarks.getItems().add(new MenuItem("    Select All Bookmarks"));

        // Submenu para Tools
        Menu submenuBuildSystem = new Menu("    Build System");
        submenuBuildSystem.getItems().add(new MenuItem("    Automatic"));
        submenuBuildSystem.getItems().add(new MenuItem("    ActionScript"));
        submenuBuildSystem.getItems().add(new MenuItem("    Ant"));
        submenuBuildSystem.getItems().add(new MenuItem("    C"));
        submenuBuildSystem.getItems().add(new MenuItem("    C++"));
        submenuBuildSystem.getItems().add(new MenuItem("    C++"));
        submenuBuildSystem.getItems().add(new MenuItem("    Haskell"));
        submenuBuildSystem.getItems().add(new MenuItem("    JavaC"));
        submenuBuildSystem.getItems().add(new MenuItem("    New Build System"));
        Menu submenuBuildResults = new Menu("    Build Results");
        submenuBuildResults.getItems().add(new MenuItem("    Show Build Results"));
        submenuBuildResults.getItems().add(new MenuItem("    Next Results"));
        submenuBuildResults.getItems().add(new MenuItem("    Next Results"));
        submenuBuildResults.getItems().add(new MenuItem("    Previous Results"));

        // Submenu para Project
        Menu submenuOpenReset = new Menu("    Open Reset");
        submenuOpenReset.getItems().add(new MenuItem("    Clear Items"));
        submenuOpenReset.getItems().add(new MenuItem("    Remove Deleted"));

        // Submenu para Preferences
        Menu submenuFont = new Menu("    Font");
        submenuFont.getItems().add(new MenuItem("    Larger"));
        submenuFont.getItems().add(new MenuItem("    Smaller"));
        submenuFont.getItems().add(new MenuItem("    Reset"));


        // Paso 4. Agregamos los items a los menus
        // para File
        menuFile.getItems().add(new MenuItem("    New File                             Ctrl+N  "));
        menuFile.getItems().add(new MenuItem("    Open File...                         Ctrl+O  "));
        menuFile.getItems().add(new MenuItem("    Open Folder..."));
        menuFile.getItems().add(submenuOpenRecent);
        menuFile.getItems().add(submenuReopenWithEncodings);
        menuFile.getItems().add(new MenuItem("    Save                                 Ctrl+S  "));
        menuFile.getItems().add(submenuSaveWithEncodings);
        menuFile.getItems().add(new MenuItem("    Save As...                           Ctrl+O  "));
        menuFile.getItems().add(new MenuItem("    Save All"));
        menuFile.getItems().add(new MenuItem("    Print..."));
        menuFile.getItems().add(new MenuItem("    New Window                     Ctrl+Shift+N  "));
        menuFile.getItems().add(new MenuItem("    Close Window                   Ctrl+Shift+W  "));

        menuFile.getItems().add(new MenuItem("    Close File"));
        menuFile.getItems().add(new MenuItem("    Revert File"));
        menuFile.getItems().add(new MenuItem("    Close all Files"));
        menuFile.getItems().add(new MenuItem("    Exit"));

        // para Edit
        menuEdit.getItems().add(new MenuItem("    Undo"));
        menuEdit.getItems().add(new MenuItem("    Redo"));
        menuEdit.getItems().add(submenuUndoSelection);
        menuEdit.getItems().add(new MenuItem("    Cut                                  Ctrl+X  "));
        menuEdit.getItems().add(new MenuItem("    Copy                                 Ctrl+C  "));
        menuEdit.getItems().add(new MenuItem("    Copy as HTML                                 "));
        menuEdit.getItems().add(new MenuItem("    Copy as HTML                                 "));
        menuEdit.getItems().add(new MenuItem("    Paste                                Ctrl+V  "));
        menuEdit.getItems().add(new MenuItem("    Paste and Indent               Ctrl+Shift+V  "));
        menuEdit.getItems().add(new MenuItem("    Sort Lines                               F9  "));
        menuEdit.getItems().add(new MenuItem("    Sort Lines (Case Sensitive)              F9  "));
        menuEdit.getItems().add(new MenuItem("    Permute Lines"));
        menuEdit.getItems().add(new MenuItem("    Permute Selections"));

        // para Selection
        menuSelection.getItems().add(new MenuItem("    Split into Lines"));
        menuSelection.getItems().add(new MenuItem("    Single Selection"));
        menuSelection.getItems().add(new MenuItem("    Select All"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Line"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Word"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Block"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Paragraph"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Scope"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Brackets"));
        menuSelection.getItems().add(new MenuItem("    Expand Selection to Indentation"));
        menuSelection.getItems().add(new MenuItem("    Add Previous line"));
        menuSelection.getItems().add(new MenuItem("    Add Next line"));
        menuSelection.getItems().add(submenuTabSelection);

        // para Find
        menuFind.getItems().add(new MenuItem("    Find..."));
        menuFind.getItems().add(new MenuItem("    Find Next"));
        menuFind.getItems().add(new MenuItem("    Find Previous"));
        menuFind.getItems().add(new MenuItem("    Incremental Find"));
        menuFind.getItems().add(new MenuItem("    Replace..."));
        menuFind.getItems().add(new MenuItem("    Replace Next"));
        menuFind.getItems().add(new MenuItem("    Quick Find"));
        menuFind.getItems().add(new MenuItem("    Quick Find All"));
        menuFind.getItems().add(new MenuItem("    Quick Add Next"));
        menuFind.getItems().add(new MenuItem("    Quick Skip Next"));
        menuFind.getItems().add(new MenuItem("    Use Selection for Find"));
        menuFind.getItems().add(new MenuItem("    Use Selection for Replace"));
        menuFind.getItems().add(new MenuItem("    Find in Files..."));
        menuFind.getItems().add(submenuFindResults);

        // para View
        menuView.getItems().add(submenuSideBar);
        menuView.getItems().add(new MenuItem("    Hide Minimap"));
        menuView.getItems().add(new MenuItem("    Hide Tabs"));
        menuView.getItems().add(new MenuItem("    Hide Status Bar"));
        menuView.getItems().add(new MenuItem("    Hide Menu"));
        menuView.getItems().add(new MenuItem("    Show Console"));
        menuView.getItems().add(new MenuItem("    Enter Full Screen"));
        menuView.getItems().add(new MenuItem("    Enter Distraction Mode"));
        menuView.getItems().add(new MenuItem("    Layout"));
        menuView.getItems().add(new MenuItem("    Groups"));
        menuView.getItems().add(new MenuItem("    Focus Group"));
        menuView.getItems().add(new MenuItem("    Move File to Group"));
        menuView.getItems().add(new MenuItem("    Syntax"));
        menuView.getItems().add(new MenuItem("    Indentation"));
        menuView.getItems().add(new MenuItem("    Line Endings"));
        menuView.getItems().add(new MenuItem("    Word Wraps"));
        menuView.getItems().add(new MenuItem("    Word Wraps Column"));
        menuView.getItems().add(new MenuItem("    Ruler"));
        menuView.getItems().add(new MenuItem("    Speck Check"));
        menuView.getItems().add(new MenuItem("    Next Misspelling"));
        menuView.getItems().add(new MenuItem("    Prev Misspelling"));
        menuView.getItems().add(new MenuItem("    Dictionary"));

        // para Goto
        menuGoto.getItems().add(new MenuItem("    Goto Anything..."));
        menuGoto.getItems().add(new MenuItem("    Goto Symbol..."));
        menuGoto.getItems().add(new MenuItem("    Goto Symbol in Project..."));
        menuGoto.getItems().add(new MenuItem("    Goto Definition..."));
        menuGoto.getItems().add(new MenuItem("    Goto Reference..."));
        menuGoto.getItems().add(new MenuItem("    Goto Line..."));
        menuGoto.getItems().add(new MenuItem("    Next Modification"));
        menuGoto.getItems().add(new MenuItem("    Previous Modification"));
        menuGoto.getItems().add(new MenuItem("    Jump Back"));
        menuGoto.getItems().add(new MenuItem("    Jump Forward"));
        menuGoto.getItems().add(new MenuItem("    Switch File"));
        menuGoto.getItems().add(submenuSwitchFile);
        menuGoto.getItems().add(submenuScroll);
        menuGoto.getItems().add(submenuBookMarks);
        menuGoto.getItems().add(new MenuItem("    Jump to Matching Bracket"));

        // para Tools
        menuTools.getItems().add(new MenuItem("    Command Palette..."));
        menuTools.getItems().add(new MenuItem("    Snippets..."));
        menuTools.getItems().add(submenuBuildSystem);
        menuTools.getItems().add(new MenuItem("    Build"));
        menuTools.getItems().add(new MenuItem("    Build with..."));
        menuTools.getItems().add(new MenuItem("    Cancel build"));
        menuTools.getItems().add(submenuBuildResults);
        menuTools.getItems().add(new MenuItem("    Save All on Build"));
        menuTools.getItems().add(new MenuItem("    Record Macro"));
        menuTools.getItems().add(new MenuItem("    Playback Macro"));
        menuTools.getItems().add(new MenuItem("    Save Macro..."));
        menuTools.getItems().add(new MenuItem("    Macros"));
        menuTools.getItems().add(new MenuItem("    Developer"));
        menuTools.getItems().add(new MenuItem("    Install Package Control..."));

        // para Project
        menuProject.getItems().add(new MenuItem("    Open Project..."));
        menuProject.getItems().add(new MenuItem("    Switch Project..."));
        menuProject.getItems().add(new MenuItem("    Quick Switch Project..."));
        menuProject.getItems().add(submenuOpenReset);
        menuProject.getItems().add(new MenuItem("    Save Project As..."));
        menuProject.getItems().add(new MenuItem("    Close Project"));
        menuProject.getItems().add(new MenuItem("    Edit Project"));
        menuProject.getItems().add(new MenuItem("    New Workspace for Project"));
        menuProject.getItems().add(new MenuItem("    Save Workspace As..."));
        menuProject.getItems().add(new MenuItem("    Add Folder to Project..."));
        menuProject.getItems().add(new MenuItem("    Remove all Folders from Project"));
        menuProject.getItems().add(new MenuItem("    Refresh Folders"));

        // para Preferences
        menuPreferences.getItems().add(new MenuItem("    Browse Packages..."));
        menuPreferences.getItems().add(new MenuItem("    Settings"));
        menuPreferences.getItems().add(new MenuItem("    Settings - Syntax Specific"));
        menuPreferences.getItems().add(new MenuItem("    Settings - Distraction Free"));
        menuPreferences.getItems().add(new MenuItem("    Key Bindings"));
        menuPreferences.getItems().add(new MenuItem("    Select Color Scheme..."));
        menuPreferences.getItems().add(new MenuItem("    Customize Color Scheme..."));
        menuPreferences.getItems().add(new MenuItem("    Select Theme..."));
        menuPreferences.getItems().add(new MenuItem("    Customize Theme..."));

        // para Help
        menuHelp.getItems().add(new MenuItem("    Documentation"));
        menuHelp.getItems().add(new MenuItem("    Report a Bug"));
        menuHelp.getItems().add(new MenuItem("    Twitter"));
        menuHelp.getItems().add(new MenuItem("    Indexing status..."));
        menuHelp.getItems().add(new MenuItem("    Purchase License"));
        menuHelp.getItems().add(new MenuItem("    Enter License"));
        menuHelp.getItems().add(new MenuItem("    Check for Updates..."));
        menuHelp.getItems().add(new MenuItem("    Changelog..."));
        menuHelp.getItems().add(new MenuItem("    About Sublime Text"));

        // agregamos menus a BarraMENU
        barraMenu.getMenus().add(menuFile);
        barraMenu.getMenus().add(menuEdit);
        barraMenu.getMenus().add(menuSelection);
        barraMenu.getMenus().add(menuFind);
        barraMenu.getMenus().add(menuView);
        barraMenu.getMenus().add(menuGoto);
        barraMenu.getMenus().add(menuTools);
        barraMenu.getMenus().add(menuProject);
        barraMenu.getMenus().add(menuPreferences);
        barraMenu.getMenus().add(menuHelp);

        // Creamos Vertical Box y agregamos la barraMenu y la imagen
        VBox verticalBox = new VBox();
        verticalBox.getChildren().add(barraMenu);
        verticalBox.getChildren().add(imageView);

        // Definimos las dimensiones de la ventana y creamos la escena
        Scene scene = new Scene(verticalBox, 1280, 720);
        primaryStage.setTitle("JAVA - Licy Judith Enrique Pastrana  2023 - Sublime Text");
        // Ponemos la escena en el primary stage y lo mostramos
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}