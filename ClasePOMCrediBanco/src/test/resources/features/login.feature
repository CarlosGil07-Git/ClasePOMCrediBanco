Feature: Compra completa en SauceDemo

  Scenario: Iniciar sesion, agregar producto y finalizar compra

    Given que el usuario esta en la pagina web
    When el usuario ingresar sus credenciales
    And el usuario agrega una mochila al carrito
    And el usuario abre el carrito
    Then el usuario podra ver la mochila en el carrito
    When el usuario hace clic en Checkout
    And el usuario completa los datos de compra
    And el usuario hace clic en Continue
    Then el usuario ve el resumen de compra
    And el usuario hace clic en Finish
    Then el usuario confirma que la compra finalizo