'use strict';

/**
* @ngdoc overview
* @name prestacaoContasApp
* @description
* # prestacaoContasApp
*
* Main module of the application.
*/
angular.module(
	'prestacaoContasApp',
	['ngMaterial', 'ngAnimate', 'ngCookies', 'ngMessages', 'ngResource', 'ngRoute', 'ngSanitize', 'ngTouch']).config(

	function ($routeProvider) {
		$routeProvider.when('/', {
			templateUrl: 'views/main.html',
			controller: 'MainCtrl',
			controllerAs: 'main'
		}).when('/about', {
			templateUrl: 'views/about.html',
			controller: 'AboutCtrl',
			controllerAs: 'about'
		}).when('/prestacao/:id_viagem', {
		  templateUrl: 'views/prestacao.html',
		  controller: 'PrestacaoCtrl',
		  controllerAs: 'prestacao'
		}).otherwise({
			templateUrl: 'views/error/404.html'
		});
	});
