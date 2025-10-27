/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_biourge;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author utilisateur
 */
public class TP1_guessMyNumber_Biourge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TP1 exercice 3, Arthur Biourge, 24/10/2025 
        int n;
        int difficulty;
        int i = 0;
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("choissisez la difficulter");
        System.out.println("1) Facile");
        System.out.println("2) Moyen");
        System.out.println("3) Difficile");
        System.out.println();
        difficulty = sc.nextInt();
        if (difficulty == 1) {
            Random generateurAleat = new Random();
            n = generateurAleat.nextInt(100);
            System.out.println("Regles:");
            System.out.println("Si le nombre choisi est a 31 d'ecart le mot Vraiment s'affichera ");
            System.out.println("Si le nombre choisi est a 21 d'ecart le mot Trop s'affichera ");
            System.out.println("Si le nombre choisi est 11 d'ecart le mot Un peu s'affichera");
            System.out.println("Si le nombre choisi est entre 10 et n d'ecart le mot a cote s'affichera");
            System.out.println("tu as un nombre de reponse illimiter");
            System.out.println("Saissisez un nombre");
            choice = sc.nextInt();
            i = i + 1;
            while (choice != n) {

                if (choice < n - 30) {
                    System.out.println("Vraiment petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 30) {

                    System.out.println("Vraiment grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n - 20) {
                    System.out.println("Trop petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 20) {

                    System.out.println("Trop grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n - 10) {
                    System.out.println("Un peu petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 10) {

                    System.out.println("Un peu grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n) {
                    System.out.println("a cote petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n) {

                    System.out.println("a cote grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice == n) {
                    System.out.println("Bravo vous avez trouve");
                    if (i == 0) {
                        System.out.println("Nombre d'essais total: 1");
                    } else {
                        System.out.println("Nombre d'essais total: " + i);
                    }
                }

            }
        }
        if (difficulty == 2) {
            Random generateurAleat = new Random();
            n = generateurAleat.nextInt(100);
            System.out.println("Regles:");
            System.out.println("Si le nombre choisi est a 31 d'ecart le mot Vraiment s'affichera ");
            System.out.println("Si le nombre choisi est a 21 d'ecart le mot Trop s'affichera ");
            System.out.println("Si le nombre choisi est entre 21 et n d'ecart le mot a cote s'affichera");
            System.out.println("tu as 15 essai");
            System.out.println("Saissisez un nombre");
            choice = sc.nextInt();
            i = i + 1;

            while (choice != n && i < 15) {

                if (choice < n - 30) {
                    System.out.println("Vraiment petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 30) {

                    System.out.println("Vraiment grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n - 20) {
                    System.out.println("Trop petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 20) {

                    System.out.println("Trop grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n) {
                    System.out.println("a cote petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n) {

                    System.out.println("a cote grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice == n) {
                    System.out.println("Bravo vous avez trouve");
                    if (i == 0) {
                        System.out.println("Nombre d'essais total: 1");
                    } else {
                        System.out.println("Nombre d'essais total: " + i);
                    }
                }

            }
            if (i == 15) {
                System.out.println("Perdu");
            }
        }
        if (difficulty == 3) {
            Random generateurAleat = new Random();
            n = generateurAleat.nextInt(100);
            System.out.println("Regles:");
            System.out.println("Si le nombre choisi est a 31 d'ecart le mot Vraiment s'affichera ");
            System.out.println("Si le nombre choisi est entre 30 et n d'ecart le mot Trop s'affichera");
            System.out.println("tu as 7 essai");
            System.out.println("Saissisez un nombre");
            choice = sc.nextInt();
            i = i + 1;

            while (choice != n && i < 7) {

                if (choice < n - 30) {
                    System.out.println("Vraiment petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n + 30) {

                    System.out.println("Vraiment grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice < n) {
                    System.out.println("Trop petit");
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    i = i + 1;
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice > n) {

                    System.out.println("Trop grand");
                    i = i + 1;
                    System.out.println("Saissisez un nouveau nombre");
                    choice = sc.nextInt();
                    if (choice == n) {
                        System.out.println("Bravo vous avez trouve");
                        if (i == 0) {
                            System.out.println("Nombre d'essais total: 1");
                        } else {
                            System.out.println("Nombre d'essais total: " + i);
                        }
                    }
                } else if (choice == n) {
                    System.out.println("Bravo vous avez trouve");
                    if (i == 0) {
                        System.out.println("Nombre d'essais total: 1");
                    } else {
                        System.out.println("Nombre d'essais total: " + i);
                    }
                }

            }
            if (i == 7) {
                System.out.println("Perdu");
            }
        }
    }
}
