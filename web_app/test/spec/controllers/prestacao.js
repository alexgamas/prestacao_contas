'use strict';

describe('Controller: PrestacaoCtrl', function () {

  // load the controller's module
  beforeEach(module('prestacaoContasApp'));

  var PrestacaoCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    PrestacaoCtrl = $controller('PrestacaoCtrl', {
      $scope: scope
      // place here mocked dependencies
    });
  }));

  it('should attach a list of awesomeThings to the scope', function () {
    expect(PrestacaoCtrl.awesomeThings.length).toBe(3);
  });
});
