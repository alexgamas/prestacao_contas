'use strict';

/**
 * @ngdoc function
 * @name prestacaoContasApp.controller:PrestacaoCtrl
 * @description
 * # PrestacaoCtrl
 * Controller of the prestacaoContasApp
 */
angular.module('prestacaoContasApp').controller('PrestacaoCtrl', function ($scope, $q, $timeout) {


	$scope.naturezaDespesaList = [
		{id: 1, descricao: 'TAXI'},
		{id: 2, descricao: 'ALIMENTACAO'},
		{id: 3, descricao: 'HOSPEDAGEM'},
		{id: 4, descricao: 'LAVANDERIA'},
		{id: 5, descricao: 'OUTROS'},
	];

	$scope.tipoDocumentoList = [
		{id: 1, descricao: 'RECIBO'},
		{id: 2, descricao: 'CUPOM FISCAL'},
		{id: 3, descricao: 'NOTA FISCAL'},
		{id: 4, descricao: 'OUTROS'},
	];

	$scope.tipoDespesaList = [
		{id: 1, descricao: 'Viagem'},
		{id: 2, descricao: 'Despesas Diversas'}
	];

	$scope.dadosBancariosList = [
		{id: 1, descricao: 'Santander'},
		{id: 2, descricao: 'Itaú'}
	];

	$scope.prestacaoItemList = [];

	$scope.trechoList = [];

	$scope.novoItem = function() {
		var arr = $scope.prestacaoItemList;
		arr[arr.length] = {};
	};

	$scope.novoTrecho = function() {
		$scope.trechoList.push({});
		/*
		var arr = $scope.trechoList;
		arr[arr.length] = {};
		*/
	};

	$scope.total = function () {
		var total = 0;
		for(var i = 0; i < $scope.prestacaoItemList.length; i++){
			var valor = $scope.prestacaoItemList[i].valor;
			if (valor != undefined && !isNaN(valor)) {
				total += parseFloat(valor);
			}
		}
		return total;
	}

	$scope.mostrarTrechos = function(){
		return $scope.prestacao.tipoDespesa == 1;
	};

	$scope.excluirItem = function (item) {

		console.debug($scope.prestacaoItemList);
		console.debug(item);
	}

	$scope.excluirTrecho = function (item) {

		console.debug($scope.trechoList);
		console.debug(item);
	}

	$scope.querySearch = function (query) {
		var results = query ? self.states.filter( createFilterFor(query) ) : self.states;
		var deferred = $q.defer();
		$timeout(
			function () {
				deferred.resolve( results );
			},
			Math.random() * 1000, false);
		return deferred.promise;
	}


	function loadAll() {
		var allStates = 'Alabama, Alaska, Arizona, Arkansas, California, Colorado, Connecticut, Delaware, Florida, Georgia, Hawaii, Idaho, Illinois, Indiana, Iowa, Kansas, Kentucky, Louisiana, Maine, Maryland, Massachusetts, Michigan, Minnesota, Mississippi, Missouri, Montana, Nebraska, Nevada, New Hampshire, New Jersey, New Mexico, New York, North Carolina, North Dakota, Ohio, Oklahoma, Oregon, Pennsylvania, Rhode Island, South Carolina, South Dakota, Tennessee, Texas, Utah, Vermont, Virginia, Washington, West Virginia, Wisconsin, Wyoming';
		return allStates.split(/, +/g).map( function (state) {
			return {
				value: state.toLowerCase(),
				display: state
			};
		});
	}

	function createFilterFor(query) {
		var lowercaseQuery = angular.lowercase(query);
		return function filterFn(state) {
			return (state.value.indexOf(lowercaseQuery) === 0);
		};
	}


	self.states = loadAll();

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
