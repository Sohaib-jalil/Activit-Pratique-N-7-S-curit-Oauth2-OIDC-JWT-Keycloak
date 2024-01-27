# Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak

Dans cette activité ont va apprendre comment sécurisé une application micro-service en utilisant Oauth2 et Keycloak

### Objectif de l'atelier : ###

(Voir vidéo : https://www.youtube.com/watch?v=vNKVm2vTL2Q):
Partie 1 : (Traiter uniquement les 49 premières minutes de la vidéo)
1. Télécharger Keycloak 23
2. Démarrer Keycloak
3. Créer un compte Admin
4. Créer une Realm
5. Créer un client à sécuriser
6. Créer des utilisateurs
7. Créer des rôles
8. Affecter les rôles aux utilisateurs
9. Avec PostMan :
    - Tester l'authentification avec le mot de passe
    - Analyser les contenus des deux JWT Access Token et Refresh Token
    - Tester l'authentification avec le Refresh Token
    - Tester l'authentification avec Client ID et Client Secret
    - Changer les paramètres des Tokens Access Token et Refresh Token

Partie 2 :
 Développer et sécuriser une application basée sur les micro-services en utilsant Oauth 2, OIDC, Keycloak :
   - Invenroty-service
   - Frontend Tymeleaf
   - Frontend Angular

 Vidéos :
    1- https://www.youtube.com/watch?v=zI0Xr-O3sqM&authuser=0 
    2- https://www.youtube.com/watch?v=YbCooJDUtOM&authuser=0 
    3- https://www.youtube.com/watch?v=aSPWnRSteTk&authuser=0 
    4- https://www.youtube.com/watch?v=NnzoM08CvgA&authuser=0 
    5- https://www.youtube.com/watch?v=LrqRjokK5dY&authuser=0 


### Configuration du projet : ###

Langue : Java

Type : Maven

JDK : Oracle OpenJDK version 20

Java : 17

Packaging : Jar

### Dépendances utilisées : ###

#### Inventory service ####
- Spring Data JPA
- H2database
- lombok
- OAuth2 Resource Server
- MySQL Driver

#### Frontend Tymeleaf ####
- Spring Data JPA
- H2database
- lombok
- Spring Web
- OAuth2 Client
- Thymeleaf
- Spring Security
- Thymeleaf Extras Springsecurity6
- Bootstrap

# Partie 1 :

## Démarrer Keycloak :
![Screenshot 2024-01-27 174407](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/6c427353-5a6a-4f92-9d95-f7e0c299a26a)

## Créer une Realm :
![Opera Snapshot_2024-01-15_204453_localhost](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/c86d36d3-349a-4cd6-854f-66e4a9fbe9de)

## Créer un client à sécuriser :
![Opera Snapshot_2024-01-15_201716_localhost](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/a6da3d44-4922-4060-bc36-45e1e3679761)

## Créer des utilisateurs :
![Opera Snapshot_2024-01-15_202206_localhost](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/3dd8af94-43d9-4e55-a1e4-759b495d03ef)

## Créer des rôles :
![Opera Snapshot_2024-01-15_202310_localhost](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/5f43c86c-47c4-4781-bee4-ef7ae7f0c094)

## Affecter les rôles aux utilisateurs :
![Opera Snapshot_2024-01-27_175105_localhost](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/5a9b2973-f9b5-4b25-8ca4-9479877c94a6)

## Tester l'authentification avec le mot de passe :
![Screenshot 2024-01-15 205328](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/0a19a97b-f6b7-4936-b500-db57be47e8f7)

## Analyser les contenus des deux JWT Access Token et Refresh Token :
![Opera Snapshot_2024-01-27_175734_jwt io](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/78d760bd-a77a-4c1d-ac3c-a05448a59403)

## Tester l'authentification avec Client ID et Client Secret :
![Screenshot 2024-01-15 212058](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/c768d72e-6674-4068-912d-4ffee43379bc)

## Changer les paramètres des Tokens Access Token et Refresh Token :
![Screenshot 2024-01-15 211344](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/b45a4d2a-1e6a-4645-9700-ed79fe9d1bf8)


# Partie 2 :

## Invenroty Service :
![Screenshot 2024-01-27 180328](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/c6f2a0ac-244f-4001-b734-f69fb3c8caa0)

## Frontend Tymeleaf :
![Screenshot 2024-01-27 180429](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/371170b9-0b10-41d4-ba8b-672940a8fff6)

## Frontend Angular :
![Screenshot 2024-01-27 180512](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/d8bb420c-7f85-4ae2-9fa8-9bcfda4b92af)

## Authentification avec google et github :
![screenshot1](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/31b9f547-ccc5-4211-9763-b9fc04ebdf32)

![Screenshot 2024-01-16 194019](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/5aac88b5-bb06-4fde-bd3c-55ca24cd8da4)

![Screenshot 2024-01-16 194057](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/f22b3cd9-871e-4fbb-8ed3-206de28158e2)

![Screenshot 2024-01-16 194343edit](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/b6403e95-385c-440e-91b5-0fba8e2cadc8)


## Authentification avec keycloak :

#### Invenroty Service
![screenshot2](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/c3606dcf-a7c8-4369-908a-332797c36aa8)

### Frontend Tymeleaf
![screenshot3](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/829b035d-1085-4583-930f-13f937cedd39)

![Screenshot 2024-01-16 201654](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/191c36d9-81a6-4389-b7e5-b50a5d94cc9e)

![Screenshot 2024-01-16 203709](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/f9be9616-853b-4389-bba3-c04b35c7c736)

![Screenshot 2024-01-16 223547](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/388e49b4-715c-4776-91cf-ff6b000ee1cb)

![Screenshot 2024-01-22 202130](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/4ddfd318-56d6-4a85-8641-d0d5739f1267)

![Screenshot 2024-01-22 202149](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/e56f8148-e4e6-4b8f-9f1f-09054ba6d90e)

![Screenshot 2024-01-22 202024](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/2536ecd0-96be-4e3d-bb47-d3b95379a4d3)

![Screenshot 2024-01-22 202045](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/d4129516-28f7-4e04-9cd7-aee0de368ca9)

![Screenshot 2024-01-22 203649](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/27cebe24-ea21-43f7-89dd-65469538b5c1)

![Screenshot 2024-01-22 203616](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/1f46ad85-a7cc-4187-9446-95887b6d49fd)


## Deployer sur Docker :

### Dokerfile (Invenroty-service & Frontend Tymeleaf)
![screenshot5](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/7e0a496a-7ffe-4b93-a051-38ef8b819bf3)

### Dokerfile (Frontend Angular)
![screenshot6](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/98acf34e-6ef6-4260-b77e-ff876a34d164)

### Docker compose
![screenshot4](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/619de702-83ca-4c03-9d8b-ff922f124227)

![Screenshot 2024-01-27 155727](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/f294c489-a914-42f4-ba7f-0079d9110cae)

![Screenshot 2024-01-27 155604](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/63c7ce1e-5b42-46e8-9c1d-5cacff316ddc)

## PgAdmin :
![Screenshot 2024-01-27 144840](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/462b9a7f-ccbc-4196-9961-a43e72442587)

![Screenshot 2024-01-27 145446](https://github.com/Sohaib-jalil/Activit-Pratique-N-7-S-curit-Oauth2-OIDC-JWT-Keycloak/assets/92445933/9aacbf8c-606a-48f8-8965-448e2f1de987)

