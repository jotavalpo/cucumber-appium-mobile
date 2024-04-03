Feature: Buscar Destino

  @BuscarHotel
  Scenario: Buscar Hotel para nuestro destino
    Given ingreso a la aplicacion Airbnb
    When doy clic a buscador
    Then escribo el destino "Algarrobo"