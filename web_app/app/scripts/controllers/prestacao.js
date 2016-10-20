'use strict';

/**
 * @ngdoc function
 * @name prestacaoContasApp.controller:PrestacaoCtrl
 * @description
 * # PrestacaoCtrl
 * Controller of the prestacaoContasApp
 */
angular.module('prestacaoContasApp').controller('PrestacaoCtrl', function ($scope) {

	$scope.dadosBancariosList = [
		{
			id: 1,
			nome: 'Santander'
		},
		{
			id: 2,
			nome: 'Itaú'		
		}
	];

	/*
		banco: 'SANTANDER',
		tipoConta: 'Conta Corrente',
		agencia: '4682',
		numeroConta: '01029609-3',
		cpf: '00700652507'

		banco: 'Itaú',
		tipoConta: 'Conta Corrente',
		agencia: '2796',
		numeroConta: '07260-7',
		cpf: '00700652507'
	*/
});
