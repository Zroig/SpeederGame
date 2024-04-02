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
    1. Mode de joc en consola de sistema (sense interfície gràfica).
    2. Utilitzar Java com a llenguatge de programació.
    3. Implementar classes i mètodes per controlar les carreres dels speeders.
2. Classes i mètodes:
    1. Classe SBike
        1. Atributs: speeder (String), velocitat (int), posicio (int)
        2. Mètodes: move(), getPosicio(), getSpeeder(), setSpeeder()
    2. Classe Race
        1. Atributs: sbikes (ArrayList<SBike>), distància (int), guanyador (SBike)
        2. Mètodes: startRace(), checkWinner(), displayResults()
    3. Classe Main
        1. Mètodes: main()
        2. Mètode calcVelocitat()
            1. Crear una matriu d’enters de 8x8
            2. Omplir 16 cel·les aleatòriament amb números naturals en el rang [-1..0..3].
            3. Generar dos números aleatoris per seleccionar fila i columna.
            4. Si el valor de la cel·la és positiu, aplicar un factor multiplicador m =”0.25” tal que:
                𝑓𝑚 = 𝑓𝑖𝑙𝑎 + (𝑚 * 𝑓𝑖𝑙𝑎)
            5. La velocitat de la 74-Z Speeder Bike serà:
                𝑣 = 𝑣𝑎𝑙𝑜𝑟[𝑓𝑖𝑙𝑎, 𝑐𝑜𝑙𝑢𝑚𝑛𝑎] * 𝑓𝑚
3. Les Pistes amb obstacles: [OPCIONAL]
    Fins ara el joc es realitza sobre una pista que té una distància màxima. Extendre el joc tal que cada speeder tingui una Pista Personalitzada. Cada nova partida assigna un tipus de pista personalitzada a cada jugador. Característiques de les pistes:
    1. La pista conté un conjunts d’obstacles i bonificacions.
        1. Tipus d'obstacles (Penalitzacions):
            1. Speeder està cansat i s’atura a descansar, el que representa que la següent tirada el moviment de la 74-Z Speeder Bike serà igual a zero.
            2. Speeder és penalitzat amb un pit back i ha de tornar a la posició anterior.
        2. Tipus d’obstacles (Bonificacions):
            1. Speeder cau en una posició amb un camí alternatiu, funnel time, que el fa avançar un nombre ‘np’ de casellas igual a multiplicar el valor de la propera tirada per 1.25.
            2. Speeder cau en una posició on hi ha el power-up “Zwift 1001-Z Speeder Bike”. Aquest power-up fa avançar a l’Speeder la suma de la tirada anterior més la següent multiplicat per 2.
    2. En una pista poden haver-hi un màxim d’un 11% d’obstacles. Tal que un 40% seran penalitzacions i un 60% bonificacions. El nombre màxim d’obstacles es computará en base a la mida total de la pista.

    Heu de crear les classes Pista i Obstacle, i les subclasses Bonifica, Penalitza. Així com tots els mètodes que considereu per a donar solució a aquest escenari.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
