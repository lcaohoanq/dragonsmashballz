package utils;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.net.URL;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameImages {

	private static final String BASE_PATH = "/resources/Ressourcen/";
	private static final String MAPS_PATH = "/resources/Maps/";
	private static final String FIGHTER_IMAGES_PATH = "/resources/Images/FighterImages/";

	public static int fighteranz = DBZ.Main.fighteranz;
	public static Image[][] fighter = new Image[fighteranz][30];
	public static Image[][] specialfighter = new Image[1][30];
	public static Image[] faces = new Image[fighteranz];
	public static Image[] clouds = new Image[3];
	public static Image[] maps = new Image[22];
	public static Image[] aura = new Image[10];
	public static Image[] chapterimages = new Image[5];
	public static Image[] stages = new Image[maps.length + 1];
	public static Image[] fighterselection = new Image[fighteranz + 2];
	public static Image[] effects;
	public static Image[] explosions;
	public static Image congratulations;
	public static Image messagepfeil;
	public static Image messagebox;
	public static Image failed;
	public static Image hud;
	public static Image leben;
	public static Image ki;
	public static Image nextrow;
	public static Image title;
	public static Image ko;
	public static Image menuback;
	public static Image mapselection;
	public static Image vs;
	public static Image versusscreen;
	public static Image[] blitzicon = new Image[2];
	public static Image[] fighticon = new Image[2];
	public static Image[] multisteer = new Image[11];
	public static Image[] menuicons = new Image[3];
	public static Image[] cursor = new Image[3];
	public static Image[] active = new Image[2];
	public static Image[] dragonballs = new Image[7];
	public static Image[] itemicons = new Image[10];
	public static Image[] worldicons = new Image[26];
	public static Image[][] maptiles = new Image[2][100];
	public static Image[] titlemenucursors = new Image[2];
	public static Image[] minimap = new Image[2];
	public static Image[] controllicons = new Image[2];
	public static Image[] help = new Image[10];
	public static Image[] atticons = new Image[5];
	public static Image[] achblock = new Image[2];
	public static Image[] duellpress = new Image[2];
	public static Image[] mapchars = new Image[48];
	public static Image mouse0, keyboard, gamepad, padchooser, pause, brollintro, storybattle, glitter;
	public static Image pod, stars, pluscharacter, subcharacter, introback, logo, schild, shenlong, songoku, songohan, ring, ring2, raumschiff, brolllogo, hudready, hudfight;

	private Frame frame;

	public GameImages(Frame f) {
		this.frame = f;
		renderImages();
	}

	private void renderImages() {
		System.out.println("Render Fighters");
		fighter = loadFighterImages();
		System.out.println("Render Effects");
		effects = loadEffects();
		System.out.println("Render Explosions");
		explosions = loadExplosions();
		System.out.println("Render Others");

		hud = loadImage(BASE_PATH,"hud.png");
		mapselection = loadImage(BASE_PATH, "mapselection.png");
		leben = loadImage(BASE_PATH, "leben.png");
		schild = loadImage(BASE_PATH, "shield.png");
		keyboard = loadImage(BASE_PATH, "keyboard.png");
		gamepad = loadImage(BASE_PATH, "gamepad.png");
		padchooser = loadImage(BASE_PATH, "pads.png");
		pause = loadImage(BASE_PATH, "pause.png");
		brollintro = loadImage(BASE_PATH, "brollintro.jpg");
		storybattle = loadImage(BASE_PATH, "battleStory.jpg");
		glitter = loadImage(BASE_PATH, "glitter.png");
		achblock[0] = loadImage(BASE_PATH, "achblock.png");
		achblock[1] = loadImage(BASE_PATH, "achblock2.png");
		pod = loadImage(BASE_PATH, "spacepod.gif");
		stars = loadImage(BASE_PATH, "stars.gif");
		pluscharacter = loadImage(BASE_PATH, "pluscharacter.png");
		subcharacter = loadImage(BASE_PATH, "subcharacter.png");
		mouse0 = loadImage(BASE_PATH, "dbmouse0.png");
		logo = loadImage(BASE_PATH, "logo.png");
		songoku = loadImage(BASE_PATH, "songokumenu.gif");
		songohan = loadImage(BASE_PATH, "gohanmenu.gif");
		nextrow = loadImage(BASE_PATH, "nextrow.png");
		messagebox = loadImage(BASE_PATH, "messagebox.png");
		messagepfeil = loadImage(BASE_PATH, "messagepfeil.png");
		duellpress[1] = loadImage(BASE_PATH, "duellpress.png");
		duellpress[0] = cropImage(duellpress[1], 0, 0, 50, 40);
		duellpress[1] = cropImage(duellpress[1], 50, 0, 50, 40);
		ki = loadImage(BASE_PATH, "ki.png");
		introback = loadImage(BASE_PATH, "intro.gif");
		shenlong = loadImage(BASE_PATH, "shenlong.gif");
		title = loadImage(BASE_PATH, "title.png");
		cursor[2] = loadImage(BASE_PATH, "cursor.png");
		for (int i = 0; i < 3; i++) {
			cursor[i] = cropImage(cursor[2], 0, i * 74, 781, 74);
		}
		ko = loadImage(BASE_PATH, "ko.png");
		congratulations = loadImage(BASE_PATH, "congratulations.png");
		failed = loadImage(BASE_PATH, "failed.png");
		vs = loadImage(BASE_PATH, "vs.png");
		ring = loadImage(BASE_PATH, "ring.png");
		ring2 = loadImage(BASE_PATH, "ring2.png");
		raumschiff = loadImage(BASE_PATH, "raumschiff.jpg");
		versusscreen = loadImage(BASE_PATH, "versusscreen.png");
		hudready = loadImage(BASE_PATH, "ready.png");
		hudfight = loadImage(BASE_PATH, "fight.png");
		menuback = loadImage(BASE_PATH, "menuback.png");

		Image[] font = new Image[41];
		font[40] = loadImage(BASE_PATH, "alphabet.gif");
		for (int i = 0; i < 41; i++) {
			font[i] = cropImage(font[40], i * 40, 0, 40, 40);
		}

		for (int m = 0; m < 2; m++) {
			minimap[m] = loadImage(BASE_PATH, "world" + (m + 1) + ".png");
			maptiles[m][99] = loadImage(BASE_PATH, "tiles" + (m + 1) + ".png");
			for (int i = 0; i < 10; i++) {
				for (int h = 0; h < 10; h++) {
					maptiles[m][i * 10 + h] = cropImage(maptiles[m][99], h * 32, i * 32, 32, 32);
				}
			}
		}

		mapchars[47] = loadImage(BASE_PATH, "mapchara.png");
		for (int i = 0; i < 4; i++) {
			for (int h = 0; h < 4; h++) {
				for (int j = 0; j < 3; j++) {
					mapchars[i * 12 + h * 3 + j] = cropImage(mapchars[47], (j * 24) + i * 72, h * 32, 24, 32);
				}
			}
		}

		titlemenucursors[1] = loadImage(BASE_PATH, "titlemenucursor.png");
		controllicons[1] = loadImage(BASE_PATH, "controllicons.png");
		for (int i = 0; i < 2; i++) {
			titlemenucursors[i] = cropImage(titlemenucursors[1], 0, i * 55, 472, 55);
			controllicons[i] = cropImage(controllicons[1], i * 40, 0, 40, 40);
		}

		worldicons[worldicons.length - 1] = loadImage(BASE_PATH, "worldicons.png");
		for (int i = 0; i < worldicons.length; i++) {
			worldicons[i] = cropImage(worldicons[worldicons.length - 1], i * 50, 0, 50, 50);
		}

		atticons[atticons.length - 1] = loadImage(BASE_PATH, "atticons.png");
		for (int i = 0; i < atticons.length; i++) {
			atticons[i] = cropImage(atticons[atticons.length - 1], i * 30, 0, 30, 30);
		}

		itemicons[itemicons.length - 1] = loadImage(BASE_PATH, "itemicons.png");
		for (int i = 0; i < itemicons.length; i++) {
			itemicons[i] = cropImage(itemicons[itemicons.length - 1], i * 40, 0, 40, 40);
		}

		faces[faces.length - 1] = loadImage(BASE_PATH, "iconfaces.png");
		for (int i = 0; i < faces.length; i++) {
			faces[i] = cropImage(faces[faces.length - 1], i * 50, 0, 50, 50);
		}

		aura[9] = loadImage(BASE_PATH, "aura.png");
		for (int i = 0; i < 10; i++) {
			aura[i] = cropImage(aura[9], i * 100, 0, 100, 100);
		}

		fighterselection[fighterselection.length - 1] = loadImage(BASE_PATH, "selection.png");
		for (int i = 0; i < fighterselection.length; i++) {
			fighterselection[i] = cropImage(fighterselection[fighterselection.length - 1], i * 100, 0, 100, 100);
		}

		menuicons[menuicons.length - 1] = loadImage(BASE_PATH, "menuicons.png");
		for (int i = 0; i < menuicons.length; i++) {
			menuicons[i] = cropImage(menuicons[menuicons.length - 1], i * 50, 0, 50, 50);
		}

		dragonballs[6] = loadImage(BASE_PATH, "dragonballs.png");
		for (int i = 0; i < 7; i++) {
			dragonballs[i] = cropImage(dragonballs[6], i * 50, 0, 50, 50);
		}

		clouds[2] = loadImage(BASE_PATH, "clouds.gif");
		for (int i = 0; i < 3; i++) {
			clouds[i] = cropImage(clouds[2], i * 150, 0, 150, 150);
		}

		multisteer[multisteer.length - 1] = loadImage(BASE_PATH, "multisteer.png");
		for (int i = 0; i < multisteer.length; i++) {
			multisteer[i] = cropImage(multisteer[multisteer.length - 1], i * 20, 0, 20, 20);
		}

		active[1] = loadImage(BASE_PATH, "active.png");
		for (int i = 0; i < 2; i++) {
			active[i] = cropImage(active[1], i * 20, 0, 20, 20);
		}

		chapterimages[4] = loadImage(BASE_PATH, "chapters.png");
		for (int i = 0; i < 5; i++) {
			chapterimages[i] = cropImage(chapterimages[4], i * 100, 0, 100, 100);
		}

		for (int i = 0; i < maps.length; i++) {
			maps[i] = loadImage(MAPS_PATH, "map" + i + ".gif");
		}

		stages[stages.length - 1] = loadImage(BASE_PATH, "stages.png");
		for (int i = 0; i < stages.length; i++) {
			stages[i] = cropImage(stages[stages.length - 1], i * 200, 0, 200, 120);
		}

		blitzicon[1] = loadImage(BASE_PATH, "blitzicons.png");
		fighticon[1] = loadImage(BASE_PATH, "fighticons.png");
		for (int i = 0; i < 2; i++) {
			blitzicon[i] = cropImage(blitzicon[1], i * 8, 0, 8, 17);
			fighticon[i] = cropImage(fighticon[1], i * 25, 0, 25, 25);
		}

		help[0] = loadImage(BASE_PATH, "helpGamepad.jpg");
		brolllogo = loadImage(BASE_PATH, "brolllogo.png");
	}

	private Image loadImage(String basePath, String filename) {
		URL url = getClass().getResource(basePath + filename);
		return Toolkit.getDefaultToolkit().getImage(url);
	}

	private Image cropImage(Image source, int x, int y, int width, int height) {
		return frame.createImage(new FilteredImageSource(source.getSource(), new CropImageFilter(x, y, width, height)));
	}

	private Image[] loadEffects() {
		Image[] e = new Image[85];
		Image b = loadImage(BASE_PATH, "effects.png");
		for (int g = 0; g < 4; g++) {
			for (int f = 0; f < 10; f++) {
				e[g * 10 + f] = cropImage(b, f * 35, g * 35, 35, 35);
			}
		}
		for (int g = 0; g < 4; g++) {
			for (int f = 0; f < 5; f++) {
				e[g * 5 + f + 40] = cropImage(b, f * 70, g * 70 + 140, 70, 70);
			}
		}
		for (int g = 0; g < 5; g++) {
			e[g + 60] = cropImage(b, 0, g * 70 + 420, 350, 70);
		}
		for (int g = 0; g < 4; g++) {
			for (int f = 0; f < 5; f++) {
				e[g * 5 + f + 65] = cropImage(b, f * 70, g * 70 + 770, 70, 70);
			}
		}
		return e;
	}

	private Image[] loadExplosions() {
		Image[] e = new Image[50];
		Image b = loadImage(BASE_PATH, "bombs.png");
		for (int f = 0; f < 10; f++) {
			e[f] = cropImage(b, f * 35, 0, 35, 35);
		}
		for (int g = 0; g < 8; g++) {
			for (int f = 0; f < 5; f++) {
				e[g * 5 + f + 10] = cropImage(b, f * 70, g * 70 + 35, 70, 70);
			}
		}
		return e;
	}

	private Image[][] loadFighterImages() {
		Image[][] fighter = new Image[fighteranz][30];
		for (int i = 0; i < fighteranz; i++) {
			fighter[i][29] = loadImage(FIGHTER_IMAGES_PATH ,"fighter" + (i + 1) + ".png");
			for (int g = 0; g < 3; g++) {
				for (int f = 0; f < 10; f++) {
					fighter[i][g * 10 + f] = cropImage(fighter[i][29], f * 100, g * 100, 100, 100);
				}
			}
		}
		specialfighter[0][29] = loadImage(FIGHTER_IMAGES_PATH, "gokukaioken.png");
		for (int g = 0; g < 3; g++) {
			for (int f = 0; f < 10; f++) {
				specialfighter[0][g * 10 + f] = cropImage(specialfighter[0][29], f * 100, g * 100, 100, 100);
			}
		}
		return fighter;
	}

	public static void main(String[] args) {
		//test load image with
		//fighter[i][29] = loadImage(FIGHTER_IMAGES_PATH + "fighter" + (i + 1) + ".png");

		String filename = "fighter1.png";
		try{
			Image image = new GameImages().loadImage(FIGHTER_IMAGES_PATH,filename);

			if(image != null){
				System.out.println("Image loaded successfully: " + image);
			}else{
				System.out.println("Image not found: " + filename);
			}
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}