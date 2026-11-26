package com.example.profildeveloppeur

// Données locales d'un projet ou d'une expérience
data class ProjectUi(
    val id: Int,
    val title: String,
    val description: String,
    val techStack: String,
    val year: String
)

// Données locales du profil développeur
data class DeveloperProfileUi(
    val name: String,
    val role: String,
    val location: String,
    val description: String,
    val skills: List<String>,
    val projects: List<ProjectUi>,
    val email: String,
    val availability: String,
    val isAvailable: Boolean
)

fun sampleDeveloperProfile(): DeveloperProfileUi {
    return DeveloperProfileUi(
        name = "Alexandre Martin",
        role = "Développeur Android Junior",
        location = "Lyon, France",
        description = "Étudiant en Master 1 Informatique passionné par Kotlin et le développement mobile moderne avec Jetpack Compose.",
        skills = listOf(
            "Kotlin",
            "Jetpack Compose",
            "Material Design 3",
            "Android Studio",
            "Git & GitHub",
            "SQL"
        ),
        projects = listOf(
            ProjectUi(
                id = 1,
                title = "Product Explorer",
                description = "Application mobile de catalogue produits avec écrans d'accueil, détail produit, listes Lazy et thème Material 3.",
                techStack = "Kotlin • Jetpack Compose • Material 3",
                year = "2026"
            ),
            ProjectUi(
                id = 2,
                title = "Gestionnaire de tâches étudiant",
                description = "Application Android permettant d'organiser ses rendus de TP, devoirs et révisions par matière.",
                techStack = "Kotlin • Compose UI",
                year = "2026"
            ),
            ProjectUi(
                id = 3,
                title = "Mini-site Portfolio Web",
                description = "Vitrine responsive présentant mes projets académiques et mes coordonnées professionnelles.",
                techStack = "HTML • CSS • JavaScript",
                year = "2025"
            )
        ),
        email = "alexandre.martin@email.com",
        availability = "Disponible pour une alternance (Septembre 2026)",
        isAvailable = true
    )
}
