package github.spritecn.swaggerTest.util

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer
import com.google.gson.reflect.TypeToken

import java.lang.reflect.Type;
import java.text.DateFormat


/**
 *
 */
class GsonUtil {
    //out gson
    final static Gson gson =  createGson()
    //GSON Date to Long
    private static Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder()
        gsonBuilder.registerTypeAdapter(Date.class, new DateSerializer()).setDateFormat(DateFormat.LONG)
        gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer()).setDateFormat(DateFormat.LONG)
        gsonBuilder.create()
    }
    static final <T> List<T> getList(final String json,final Class<T> clazz) {
        Type listType = TypeToken.getParameterized(List.class, clazz).getType()
        gson.fromJson(json,listType)
    }
}


class DateSerializer implements JsonSerializer<Date> {
    JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getTime())
    }
}

class DateDeserializer implements JsonDeserializer<Date> {
    Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong())
    }
}
