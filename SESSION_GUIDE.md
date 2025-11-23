# Guia d'activitats: Sessió amb Spring Boot + Codespaces
Durada estimada: 90 minuts (1 sessió)

Objectius d'aprenentatge
- Crear i executar una aplicació Spring Boot.
- Implementar un endpoint GET amb paràmetres i retornar JSON.
- Escriure tests i provar localment a Codespaces.

Prerrequisits
- Compte GitHub amb accés a Codespaces.
- Coneixements bàsics de Java i HTTP.

Estructura de la sessió
1. Introducció (10 min) — Explicació de Codespaces i devcontainers.
2. Arrencada del Codespace (10 min) — Obrir el repo, verificar el port 8080.
3. Exercici 1 — Endpoint GET (20 min)
   - Afegir o modificar endpoint GET "/api/greet" que accepti `name` i retorni `{ "message": "Hola, <name>!" }`.
   - Afegir test unitari.
4. Exercici 2 — Persistència simple (30 min)
   - Crear entitat Note amb CRUD en memòria (llista estàtica).
   - Implementar endpoints GET/POST/PUT/DELETE.
5. Revisió i tancament (20 min)
   - Crear PR amb solució i fer code review entre parelles.

Extensió: substituir emmagatzematge en memòria per H2/JPA, afegir Spring Security, o pipeline CI.

Rúbrica (proposta)
- Endpoint GET /api/greet (10%)
- Resposta JSON i paràmetres (15%)
- CRUD Notes (40%)
- Tests (20%)
- Qualitat de PR i codi (15%)
