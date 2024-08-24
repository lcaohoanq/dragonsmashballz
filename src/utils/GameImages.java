package utils;

import constant.ResourcesFile;
import constant.ResourcesPath;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.net.URL;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class GameImages {

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

        hud = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.HUD);
        mapselection = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MAP_SELECTION);
        leben = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.LEBEN);
        schild = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.SHIELD);
        keyboard = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.KEYBOARD);
        gamepad = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.GAMEPAD);
        padchooser = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.PADS);
        pause = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.PAUSE);
        brollintro = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.BROLLINTRO);
        storybattle = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.BATTLESTORY);
        glitter = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.GLITTER);
        achblock[0] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ACHBLOCK);
        achblock[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ACHBLOCK2);
        pod = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.SPACEPOD);
        stars = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.STARS);
        pluscharacter = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.PLUS_CHARACTER);
        subcharacter = loadImage(ResourcesPath.BASE_PATH,  ResourcesFile.SUB_CHARACTER);
        mouse0 = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.DB_MOUSE);
        logo = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.LOGO);
        songoku = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.SONGOKU_MENU);
        songohan = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.GOHAN_MENU);
        nextrow = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.NEXT_ROW);
        messagebox = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MESSAGE_BOX);
        messagepfeil = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MESSAGE_PFEIL);
        duellpress[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.DUELL_PRESS);
        duellpress[0] = cropImage(duellpress[1], 0, 0, 50, 40);
        duellpress[1] = cropImage(duellpress[1], 50, 0, 50, 40);
        ki = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.KI);
        introback = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.INTRO);
        shenlong = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.SHENLONG);
        title = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.TITLE);
        cursor[2] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.CURSOR);
        for (int i = 0; i < 3; i++) {
            cursor[i] = cropImage(cursor[2], 0, i * 74, 781, 74);
        }
        ko = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.KO);
        congratulations = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.CONGRATULATIONS);
        failed = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.FAILED);
        vs = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.VS);
        ring = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.RING);
        ring2 = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.RING_2);
        raumschiff = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.RAUM_SCHIFF);
        versusscreen = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.VERSUSS_SCREEN);
        hudready = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.READY);
        hudfight = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.FIGHT);
        menuback = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MENU_BACK);

        Image[] font = new Image[41];
        font[40] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ALPHABET);
        for (int i = 0; i < 41; i++) {
            font[i] = cropImage(font[40], i * 40, 0, 40, 40);
        }

        for (int m = 0; m < 2; m++) {
            minimap[m] = loadImage(ResourcesPath.BASE_PATH, "world" + (m + 1) + ".png");
            maptiles[m][99] = loadImage(ResourcesPath.BASE_PATH, "tiles" + (m + 1) + ".png");
            for (int i = 0; i < 10; i++) {
                for (int h = 0; h < 10; h++) {
                    maptiles[m][i * 10 + h] = cropImage(maptiles[m][99], h * 32, i * 32, 32, 32);
                }
            }
        }

        mapchars[47] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MAP_CHARA);
        for (int i = 0; i < 4; i++) {
            for (int h = 0; h < 4; h++) {
                for (int j = 0; j < 3; j++) {
                    mapchars[i * 12 + h * 3 + j] = cropImage(mapchars[47], (j * 24) + i * 72,
                        h * 32, 24, 32);
                }
            }
        }

        titlemenucursors[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.TITLE_MENU_CURSOR);
        controllicons[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.CONTROL_LLICONS);
        for (int i = 0; i < 2; i++) {
            titlemenucursors[i] = cropImage(titlemenucursors[1], 0, i * 55, 472, 55);
            controllicons[i] = cropImage(controllicons[1], i * 40, 0, 40, 40);
        }

        worldicons[worldicons.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.WORLD_DICONS);
        for (int i = 0; i < worldicons.length; i++) {
            worldicons[i] = cropImage(worldicons[worldicons.length - 1], i * 50, 0, 50, 50);
        }

        atticons[atticons.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ATTICONS);
        for (int i = 0; i < atticons.length; i++) {
            atticons[i] = cropImage(atticons[atticons.length - 1], i * 30, 0, 30, 30);
        }

        itemicons[itemicons.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ITEMICONS);
        for (int i = 0; i < itemicons.length; i++) {
            itemicons[i] = cropImage(itemicons[itemicons.length - 1], i * 40, 0, 40, 40);
        }

        faces[faces.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ICONFACES);
        for (int i = 0; i < faces.length; i++) {
            faces[i] = cropImage(faces[faces.length - 1], i * 50, 0, 50, 50);
        }

        aura[9] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.AURA);
        for (int i = 0; i < 10; i++) {
            aura[i] = cropImage(aura[9], i * 100, 0, 100, 100);
        }

        fighterselection[fighterselection.length - 1] = loadImage(ResourcesPath.BASE_PATH,
            ResourcesFile.SELECTION);
        for (int i = 0; i < fighterselection.length; i++) {
            fighterselection[i] = cropImage(fighterselection[fighterselection.length - 1], i * 100,
                0, 100, 100);
        }

        menuicons[menuicons.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MENU_ICONS);
        for (int i = 0; i < menuicons.length; i++) {
            menuicons[i] = cropImage(menuicons[menuicons.length - 1], i * 50, 0, 50, 50);
        }

        dragonballs[6] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.DRAGONBALLS);
        for (int i = 0; i < 7; i++) {
            dragonballs[i] = cropImage(dragonballs[6], i * 50, 0, 50, 50);
        }

        clouds[2] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.CLOUDS);
        for (int i = 0; i < 3; i++) {
            clouds[i] = cropImage(clouds[2], i * 150, 0, 150, 150);
        }

        multisteer[multisteer.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.MULTISTEER);
        for (int i = 0; i < multisteer.length; i++) {
            multisteer[i] = cropImage(multisteer[multisteer.length - 1], i * 20, 0, 20, 20);
        }

        active[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.ACTIVE);
        for (int i = 0; i < 2; i++) {
            active[i] = cropImage(active[1], i * 20, 0, 20, 20);
        }

        chapterimages[4] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.CHAPTERS);
        for (int i = 0; i < 5; i++) {
            chapterimages[i] = cropImage(chapterimages[4], i * 100, 0, 100, 100);
        }

        for (int i = 0; i < maps.length; i++) {
            maps[i] = loadImage(ResourcesPath.MAPS_PATH, "map" + i + ".gif");
        }

        stages[stages.length - 1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.STAGES);
        for (int i = 0; i < stages.length; i++) {
            stages[i] = cropImage(stages[stages.length - 1], i * 200, 0, 200, 120);
        }

        blitzicon[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.BLITZICONS);
        fighticon[1] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.FIGHT_ICONS);
        for (int i = 0; i < 2; i++) {
            blitzicon[i] = cropImage(blitzicon[1], i * 8, 0, 8, 17);
            fighticon[i] = cropImage(fighticon[1], i * 25, 0, 25, 25);
        }

        help[0] = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.HELP_GAME_PAD);
        brolllogo = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.BROLLLOGO);
    }

    private Image loadImage(String basePath, String filename) {
        URL url = getClass().getResource(basePath + filename);
        return Toolkit.getDefaultToolkit().getImage(url);
    }

    private Image cropImage(Image source, int x, int y, int width, int height) {
        return frame.createImage(
            new FilteredImageSource(source.getSource(), new CropImageFilter(x, y, width, height)));
    }

    private Image[] loadEffects() {
        Image[] e = new Image[85];
        Image b = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.EFFECTS);
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
        Image b = loadImage(ResourcesPath.BASE_PATH, ResourcesFile.BOMBS);
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
            fighter[i][29] = loadImage(ResourcesPath.FIGHTER_IMAGES_PATH,
                "fighter" + (i + 1) + ".png");
            for (int g = 0; g < 3; g++) {
                for (int f = 0; f < 10; f++) {
                    fighter[i][g * 10 + f] = cropImage(fighter[i][29], f * 100, g * 100, 100, 100);
                }
            }
        }
        specialfighter[0][29] = loadImage(ResourcesPath.FIGHTER_IMAGES_PATH, ResourcesFile.GOKUKAIOKEN);
        for (int g = 0; g < 3; g++) {
            for (int f = 0; f < 10; f++) {
                specialfighter[0][g * 10 + f] = cropImage(specialfighter[0][29], f * 100, g * 100,
                    100, 100);
            }
        }
        return fighter;
    }

    public static void main(String[] args) {
        //test load image with
        //fighter[i][29] = loadImage(ResourcesPath.FIGHTER_IMAGES_PATH + "fighter" + (i + 1) + ".png");

        String filename = "fighter1.png";
        try {
            Image image = new GameImages().loadImage(ResourcesPath.FIGHTER_IMAGES_PATH, filename);

            if (image != null) {
                System.out.println("Image loaded successfully: " + image);
            } else {
                System.out.println("Image not found: " + filename);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}