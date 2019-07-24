const items = require("../Database/itemsToBuy").items;

const ItemsClass = class{
    constructor(){
        this.items = items;
    }
    getAllItemsToBuyFromDatabase(){
        return this.items;
    }
}

module.exports.ItemsClass = ItemsClass;