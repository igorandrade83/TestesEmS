window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * Bloco
 */
window.blockly.js.blockly.Bloco.Executar = function() {
 var item, token;
  this.cronapi.cordova.device.getFirebaseNotificationData(function(sender_item) {
      item = sender_item;
    this.cronapi.screen.notify('success',item);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
  this.cronapi.util.callServerBlocklyNoReturn('blockly.BlocoS:Executar', this.blockly.js.blockly.Bloco.ObterToken());
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Bloco.ObterToken = function() {
 var item, token;
  this.cronapi.cordova.device.getFirebaseToken(function(sender_token) {
      token = sender_token;
    this.cronapi.screen.notify('success',token);
  }.bind(this), function(sender_item) {
      item = sender_item;
  }.bind(this));
  return token;
}
