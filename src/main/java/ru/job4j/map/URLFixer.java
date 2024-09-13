package ru.job4j.map;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class URLFixer {

    /**
     * Метод восстанавливает строку запроса,
     * добавляя пропущенные знаки = между ключами и значениями.
     *
     * @param query       Строка с Query String
     * @param validParams Список допустимых параметров
     * @return Восстановленная строка с Query String
     */
    public String fixQuery(String query, List<String> validParams) {
        Set<String> validParamSet = new HashSet<>(validParams);
        StringJoiner result = new StringJoiner("&");
        String[] parts = query.split("&");
        for (String part : parts) {
            boolean found = false;
            if (!part.contains("=")) {
                for (String validParam : validParamSet) {
                    if (part.startsWith(validParam)) {
                        result.add(validParam + "=" + part.substring(validParam.length()));
                        validParamSet.remove(validParam);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                result.add(part);
            }
        }
        return result.toString();
    }
}


