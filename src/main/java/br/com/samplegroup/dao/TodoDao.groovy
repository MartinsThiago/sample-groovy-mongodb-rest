package br.com.samplegroup.dao

import com.google.gson.Gson
import org.jongo.MongoCollection

class TodoDao extends DAO {

    MongoCollection collection

    TodoDao() {
        super()
        this.collection = db.getCollection("todo")
    }

    @Override
    Object save(Object obj) {
        collection.save(obj)
        return obj
    }

    @Override
    Object find() {
        def docs = collection.find()
        new Gson().toJson(docs)
    }

    @Override
    Object find(Object obj) {
        return null
    }

    @Override
    Object remove(Object obj) {
        return null
    }
}
