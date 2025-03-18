package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans le Gestionnaire d'Étudiants 📚");

        // Adding sample students
        manager.AjoutStud(new Student("Ali", 101, 21, 3));
        manager.AjoutStud(new Student("Aya", 102, 22, 4));
        manager.AjoutStud(new GraduateStudents("Karim", 103, 24, 5, "Intelligence Artificielle"));

        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("1️⃣ - Ajouter un étudiant");
            System.out.println("2️⃣ - Afficher tous les étudiants");
            System.out.println("3️⃣ - Rechercher un étudiant par ID");
            System.out.println("4️⃣ - Supprimer un étudiant");
            System.out.println("5️⃣ - Quitter");
            System.out.print("👉 Choisissez une option : ");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choix) {
                case 1:
                    System.out.println("\n🔹 Ajouter un étudiant : ");
                    System.out.print("Nom : ");
                    String name = scanner.nextLine();

                    System.out.print("ID : ");
                    int id = scanner.nextInt();

                    System.out.print("Âge : ");
                    int age = scanner.nextInt();

                    System.out.print("GPA : ");
                    int gpa = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Est-ce un étudiant diplômé ? (y/n) : ");
                    char isGraduate = scanner.nextLine().charAt(0);

                    if (isGraduate == 'y' || isGraduate == 'Y') {
                        System.out.print("Titre de la thèse : ");
                        String thesis = scanner.nextLine();
                        manager.AjoutStud(new GraduateStudents(name, id, age, gpa, thesis));
                    } else {
                        manager.AjoutStud(new Student(name, id, age, gpa));
                    }

                    System.out.println("✅ Étudiant ajouté avec succès !");
                    break;

                case 2:
                    System.out.println("\n📋 Liste des étudiants :");
                    manager.ViewAllStudents();
                    break;

                case 3:
                    System.out.print("\n🔍 Entrez l'ID de l'étudiant à rechercher : ");
                    int searchId = scanner.nextInt();
                    Student found = manager.chercheStudent(searchId);
                    if (found != null) {
                        System.out.println("✅ Étudiant trouvé : " + found);
                    } else {
                        System.out.println("❌ Étudiant non trouvé.");
                    }
                    break;

                case 4:
                    System.out.print("\n❌ Entrez l'ID de l'étudiant à supprimer : ");
                    int deleteId = scanner.nextInt();
                    manager.deleteStudent(deleteId);
                    break;

                case 5:
                    System.out.println("👋 Au revoir !");
                    running = false;
                    break;

                default:
                    System.out.println("⚠️ Option invalide. Veuillez réessayer.");
                    break;
            }
        }

        scanner.close();
    }
}
