package com.memorynotfound.thymeleaf.model;

import java.util.List;

//{
//        "update": "March 10, 2016",
//        "fields": ["Squadra", "Punti", "Giocate", "Vinte", "Neutre", "Perse", "Gol Fatti", "Gol Subiti"],
//        "data": [
//        ["Juventus",76,32,24,4,4,58,17  ],
//        ["Napoli",70,32,21,7,4,66,27  ],
//        ["Roma",63,31,18,9,4,66,32  ],
//        ["Inter",58,32,17,7,8,42,30  ],
//        ["Fiorentina",56,32,16,8,8,51,35  ],
//        ["Milan",49,32,13,10,9,42,35  ],
//        ["Sassuolo",48,32,12,12,8,40,35  ],
//        ["Lazio",45,32,12,9,11,42,42  ],
//        ["Chievo",44,32,12,8,12,38,40  ],
//        ["Genoa",40,32,11,7,14,37,37  ],
//        ["Empoli",39,32,10,9,13,36,43  ],
//        ["Torino",39,32,10,9,13,41,44  ],
//        ["Atalanta",36,32,9,9,14,31,38  ],
//        ["Bologna",36,31,10,6,15,30,36  ],
//        ["Sampdoria",36,32,9,9,14,46,49  ],
//        ["Udinese",34,32,9,7,16,29,48  ],
//        ["Carpi",28,32,6,10,16,29,50  ],
//        ["Palermo",28,32,7,7,18,29,57  ],
//        ["Frosinone",27,32,7,6,19,29,60  ],
//        ["Verona",22,32,3,13,16,27,54  ]
//        ]
//        }
public class PlotlyData {

    private String update;
    private List<String> fields;
    private List<String> data;
    private String color = "";
    private String title = "Mt Bruno Elevation";

    public PlotlyData(String update, List<String> fields, List<String> data, String color, String title) {
        this.update = update;
        this.fields = fields;
        this.data = data;
        this.color = color;
        this.title = title;
    }

    public PlotlyData() {

    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public List<String> getFields() {
        return fields;
    }

    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "PlotlyData{" +
                "update='" + update + '\'' +
                ", fields=" + fields +
                ", data=" + data +
                ", color='" + color + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
