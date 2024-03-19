## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Enunciat
En el joc de 74-Z Speeder Bike, el pilot o Speeder controla una Speeder Bike (SBike) que
competeix contra els altres Speeder’s per arribar primer a la línia d’arribada. El joc inclou
diferents pistes de carreres amb obstacles i power-ups que els speeders poden recollir i/o usar
per augmentar la velocitat o bé estorbar la cursa dels altres Speeders.

El joc contempla diferents nivells de dificultat per adaptar-se als diferents tipus de speeders,
des dels Caganius fins als Marvel (Superherois).

Les especificacions bàsiques, les classes i els mètodes que cal desenvolupar, així com la base
de regles “mínimes” del joc són:
1. Especificacions bàsiques:
    a. Mode de joc en consola de sistema (sense interfície gràfica).
    b. Utilitzar Java com a llenguatge de programació.
    c. Implementar classes i mètodes per controlar les carreres dels speeders.
2. Classes i mètodes:
    a. Classe SBike
        ● Atributs: speeder (String), velocitat (int), posicio (int)
        ● Mètodes: move(), getPosicio(), getSpeeder(), setSpeeder()
    b. Classe Race
        ● Atributs: sbikes (ArrayList<SBike>), distància (int), guanyador (SBike)
        ● Mètodes: startRace(), checkWinner(), displayResults()
    c. Classe Main
        ● Mètodes: main()
        ● Mètode calcVelocitat()
            1. Crear una matriu d’enters de 8x8
            2. Omplir 16 cel·les aleatòriament amb números naturals en el rang [-1..0..3].
            3. Generar dos números aleatoris per seleccionar fila i columna.
            4. Si el valor de la cel·la és positiu, aplicar un factor multiplicador m =”0.25” tal que:
                𝑓𝑚 = 𝑓𝑖𝑙𝑎 + (𝑚 * 𝑓𝑖𝑙𝑎)
            5. La velocitat de la 74-Z Speeder Bike serà:
                𝑣 = 𝑣𝑎𝑙𝑜𝑟[𝑓𝑖𝑙𝑎, 𝑐𝑜𝑙𝑢𝑚𝑛𝑎] * 𝑓𝑚

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
