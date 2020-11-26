package trying;

public class nameoftheday {
  public static boolean bis(int annne) {
    if ((annne % 4 == 0 && annne % 100 != 0) || annne % 400 == 0) {
      return true;
    }
    return false;
  }

  public static int numJour(int mois, int anne) {

    switch (mois) {
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      case 2:
        if (bis(anne)) {
          return 29;
        }
        return 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
    }
    return 0;
  }

  // calcul le nombre jour total jusk'a cette annee
  public static int nNum(int year) {
    int sum = 0;
    for (int i = 1; i < year; i++) {
      if (bis(i)) {
        sum += 366;
      } else {
        sum += 365;
      }
    }
    return sum;
  }

  public static String lejour(int jour, int mois, int an) {
    int babs = 0;
    // calcul le nombre de nous avons dans l'anne
    for (int i = 1; i < mois; i++) {
      babs += numJour(i, an);
    }
    // calcul le nombre de jour total jusk'a ce jour
    int babacar = nNum(an) + babs + jour;
    switch ((babacar % 7)) {
      case 1:
        return "LUNDI";
      case 2:
        return "MARDI";
      case 3:
        return "MERCREDI";
      case 4:
        return "JEUDI";
      case 5:
        return "VENDREDI";
      case 6:
        return "SAMEDI";
      case 0:
        return "DIMANCHE";
    }
    return "problem";
  }

  public static void main(String[] args) {
     System.out.println("the name of your day is: "+lejour(26,7,1975));
    // for (int i = 1; i < 51; i++) {020
    // if (lejour(2,2,2018) == lejour(19, 9, 2000 + i)) System.out.printf("%d",i);
    // }
  }
}
                                                                                                            // ETIP
