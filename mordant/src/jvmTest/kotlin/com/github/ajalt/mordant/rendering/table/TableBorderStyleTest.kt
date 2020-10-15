package com.github.ajalt.mordant.rendering.table

import com.github.ajalt.mordant.rendering.BorderStyle
import com.github.ajalt.mordant.rendering.Padding
import com.github.ajalt.mordant.rendering.RenderingTest
import com.github.ajalt.mordant.rendering.table.Borders.*
import org.junit.Test

class TableBorderStyleTest : RenderingTest() {
    @Test
    fun square() = doTest(BorderStyle.SQUARE, """
        ┌───┬───┐                   ┌───┬───┐   ╷   ╷   ╷   ╷
        │1  │2  │3   4   5   6   7  │8  │9  │10 │11 │12 │13 │
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │14 │15 │16  17  18  19  20  21  22  23  24  25  26  
        ├───┼───┤               ╷   ┌───┬───┐           ╷    
        │27 │28 │29  30  31  32 │33 │34 │35 │36  37  38 │39  
        ├───┼───┤   ┌───┬───┐   │   └───┴───┘   ╶───╴   ╵   ╷
        │40 │41 │42 │43 │44 │45 │46  47  48  49  50  51  52 │
        ├───┼───┤   └───┴───┘   ╵   ┌───┬───┐   ╷   ╷   ╷   │
        │53 │54 │55  56  57  58  59 │60 │61 │62 │63 │64 │65 │
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │66 │67 │68  69  70  71  72  73  74  75  76  77  78  
        ├───┼───┤               ╷   ┌───┬───┐           ╷    
        │79 │80 │81  82  83  84 │85 │86 │87 │88  89  90 │91  
        ├───┼───┤   ┌───┬───┐   │   └───┴───┘   ╶───╴   ╵   ╷
        │92 │93 │94 │95 │96 │97 │98  99  100 101 102 103 104│
        ├───┼───┤   └───┴───┘   ╵   ┌───┬───┐   ╷   ╷   ╷   │
        │105│106│107 108 109 110 111│112│113│114│115│116│117│
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │118│119│120 121 122 123 124 125 126 127 128 129 130 
        └───┴───┘                                            
        """)

    @Test
    fun rounded() = doTest(BorderStyle.ROUNDED, """
        ╭───┬───╮                   ╭───┬───╮   ╷   ╷   ╷   ╷
        │1  │2  │3   4   5   6   7  │8  │9  │10 │11 │12 │13 │
        ├───┼───┤   ╶───────╴       ╰───┴───╯   ╵   ╵   ╵   ╵
        │14 │15 │16  17  18  19  20  21  22  23  24  25  26  
        ├───┼───┤               ╷   ╭───┬───╮           ╷    
        │27 │28 │29  30  31  32 │33 │34 │35 │36  37  38 │39  
        ├───┼───┤   ╭───┬───╮   │   ╰───┴───╯   ╶───╴   ╵   ╷
        │40 │41 │42 │43 │44 │45 │46  47  48  49  50  51  52 │
        ├───┼───┤   ╰───┴───╯   ╵   ╭───┬───╮   ╷   ╷   ╷   │
        │53 │54 │55  56  57  58  59 │60 │61 │62 │63 │64 │65 │
        ├───┼───┤   ╶───────╴       ╰───┴───╯   ╵   ╵   ╵   ╵
        │66 │67 │68  69  70  71  72  73  74  75  76  77  78  
        ├───┼───┤               ╷   ╭───┬───╮           ╷    
        │79 │80 │81  82  83  84 │85 │86 │87 │88  89  90 │91  
        ├───┼───┤   ╭───┬───╮   │   ╰───┴───╯   ╶───╴   ╵   ╷
        │92 │93 │94 │95 │96 │97 │98  99  100 101 102 103 104│
        ├───┼───┤   ╰───┴───╯   ╵   ╭───┬───╮   ╷   ╷   ╷   │
        │105│106│107 108 109 110 111│112│113│114│115│116│117│
        ├───┼───┤   ╶───────╴       ╰───┴───╯   ╵   ╵   ╵   ╵
        │118│119│120 121 122 123 124 125 126 127 128 129 130 
        ╰───┴───╯                                            
        """)

    @Test
    fun heavy() = doTest(BorderStyle.HEAVY, """
        ┏━━━┳━━━┓                   ┏━━━┳━━━┓   ╻   ╻   ╻   ╻
        ┃1  ┃2  ┃3   4   5   6   7  ┃8  ┃9  ┃10 ┃11 ┃12 ┃13 ┃
        ┣━━━╋━━━┫   ╺━━━━━━━╸       ┗━━━┻━━━┛   ╹   ╹   ╹   ╹
        ┃14 ┃15 ┃16  17  18  19  20  21  22  23  24  25  26  
        ┣━━━╋━━━┫               ╻   ┏━━━┳━━━┓           ╻    
        ┃27 ┃28 ┃29  30  31  32 ┃33 ┃34 ┃35 ┃36  37  38 ┃39  
        ┣━━━╋━━━┫   ┏━━━┳━━━┓   ┃   ┗━━━┻━━━┛   ╺━━━╸   ╹   ╻
        ┃40 ┃41 ┃42 ┃43 ┃44 ┃45 ┃46  47  48  49  50  51  52 ┃
        ┣━━━╋━━━┫   ┗━━━┻━━━┛   ╹   ┏━━━┳━━━┓   ╻   ╻   ╻   ┃
        ┃53 ┃54 ┃55  56  57  58  59 ┃60 ┃61 ┃62 ┃63 ┃64 ┃65 ┃
        ┣━━━╋━━━┫   ╺━━━━━━━╸       ┗━━━┻━━━┛   ╹   ╹   ╹   ╹
        ┃66 ┃67 ┃68  69  70  71  72  73  74  75  76  77  78  
        ┣━━━╋━━━┫               ╻   ┏━━━┳━━━┓           ╻    
        ┃79 ┃80 ┃81  82  83  84 ┃85 ┃86 ┃87 ┃88  89  90 ┃91  
        ┣━━━╋━━━┫   ┏━━━┳━━━┓   ┃   ┗━━━┻━━━┛   ╺━━━╸   ╹   ╻
        ┃92 ┃93 ┃94 ┃95 ┃96 ┃97 ┃98  99  100 101 102 103 104┃
        ┣━━━╋━━━┫   ┗━━━┻━━━┛   ╹   ┏━━━┳━━━┓   ╻   ╻   ╻   ┃
        ┃105┃106┃107 108 109 110 111┃112┃113┃114┃115┃116┃117┃
        ┣━━━╋━━━┫   ╺━━━━━━━╸       ┗━━━┻━━━┛   ╹   ╹   ╹   ╹
        ┃118┃119┃120 121 122 123 124 125 126 127 128 129 130 
        ┗━━━┻━━━┛                                            
        """)

    @Test
    fun double() = doTest(BorderStyle.DOUBLE, """
        ╔═══╦═══╗                   ╔═══╦═══╗                
        ║1  ║2  ║3   4   5   6   7  ║8  ║9  ║10 ║11 ║12 ║13 ║
        ╠═══╬═══╣    ═══════        ╚═══╩═══╝                
        ║14 ║15 ║16  17  18  19  20  21  22  23  24  25  26  
        ╠═══╬═══╣                   ╔═══╦═══╗                
        ║27 ║28 ║29  30  31  32 ║33 ║34 ║35 ║36  37  38 ║39  
        ╠═══╬═══╣   ╔═══╦═══╗   ║   ╚═══╩═══╝    ═══         
        ║40 ║41 ║42 ║43 ║44 ║45 ║46  47  48  49  50  51  52 ║
        ╠═══╬═══╣   ╚═══╩═══╝       ╔═══╦═══╗               ║
        ║53 ║54 ║55  56  57  58  59 ║60 ║61 ║62 ║63 ║64 ║65 ║
        ╠═══╬═══╣    ═══════        ╚═══╩═══╝                
        ║66 ║67 ║68  69  70  71  72  73  74  75  76  77  78  
        ╠═══╬═══╣                   ╔═══╦═══╗                
        ║79 ║80 ║81  82  83  84 ║85 ║86 ║87 ║88  89  90 ║91  
        ╠═══╬═══╣   ╔═══╦═══╗   ║   ╚═══╩═══╝    ═══         
        ║92 ║93 ║94 ║95 ║96 ║97 ║98  99  100 101 102 103 104║
        ╠═══╬═══╣   ╚═══╩═══╝       ╔═══╦═══╗               ║
        ║105║106║107 108 109 110 111║112║113║114║115║116║117║
        ╠═══╬═══╣    ═══════        ╚═══╩═══╝                
        ║118║119║120 121 122 123 124 125 126 127 128 129 130 
        ╚═══╩═══╝                                            
        """)
    @Test
    fun heavy_head_foot() = doTest(BorderStyle.HEAVY_HEAD_FOOT, """
        ┏━━━┳━━━┓                   ┏━━━┳━━━┓   ╻   ╻   ╻   ╻
        ┃1  ┃2  ┃3   4   5   6   7  ┃8  ┃9  ┃10 ┃11 ┃12 ┃13 ┃
        ┣━━━╋━━━┫   ╺━━━━━━━╸       ┗━━━┻━━━┛   ╹   ╹   ╹   ╹
        ┃14 ┃15 ┃16  17  18  19  20  21  22  23  24  25  26  
        ┣━━━╋━━━┫               ╻   ┏━━━┳━━━┓           ╻    
        ┃27 ┃28 ┃29  30  31  32 ┃33 ┃34 ┃35 ┃36  37  38 ┃39  
        ┡━━━╇━━━┩   ┍━━━┯━━━┑   ╿   ┗━━━┻━━━┛   ╺━━━╸   ╹   ╷
        │40 │41 │42 │43 │44 │45 │46  47  48  49  50  51  52 │
        ├───┼───┤   └───┴───┘   ╵   ┌───┬───┐   ╷   ╷   ╷   │
        │53 │54 │55  56  57  58  59 │60 │61 │62 │63 │64 │65 │
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │66 │67 │68  69  70  71  72  73  74  75  76  77  78  
        ├───┼───┤               ╷   ┌───┬───┐           ╷    
        │79 │80 │81  82  83  84 │85 │86 │87 │88  89  90 │91  
        ┢━━━╈━━━┪   ┏━━━┳━━━┓   ╽   ┕━━━┷━━━┙   ╺━━━╸   ╵   ╻
        ┃92 ┃93 ┃94 ┃95 ┃96 ┃97 ┃98  99  100 101 102 103 104┃
        ┣━━━╋━━━┫   ┗━━━┻━━━┛   ╹   ┏━━━┳━━━┓   ╻   ╻   ╻   ┃
        ┃105┃106┃107 108 109 110 111┃112┃113┃114┃115┃116┃117┃
        ┣━━━╋━━━┫   ╺━━━━━━━╸       ┗━━━┻━━━┛   ╹   ╹   ╹   ╹
        ┃118┃119┃120 121 122 123 124 125 126 127 128 129 130 
        ┗━━━┻━━━┛                                            
        """)

    @Test
    fun square_double_head_separator() = doTest(BorderStyle.SQUARE_DOUBLE_SECTION_SEPARATOR, """
        ┌───┬───┐                   ┌───┬───┐   ╷   ╷   ╷   ╷
        │1  │2  │3   4   5   6   7  │8  │9  │10 │11 │12 │13 │
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │14 │15 │16  17  18  19  20  21  22  23  24  25  26  
        ├───┼───┤               ╷   ┌───┬───┐           ╷    
        │27 │28 │29  30  31  32 │33 │34 │35 │36  37  38 │39  
        ╞═══╪═══╡   ╒═══╤═══╕   │   ╘═══╧═══╛    ═══    ╵   ╷
        │40 │41 │42 │43 │44 │45 │46  47  48  49  50  51  52 │
        ├───┼───┤   └───┴───┘   ╵   ┌───┬───┐   ╷   ╷   ╷   │
        │53 │54 │55  56  57  58  59 │60 │61 │62 │63 │64 │65 │
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │66 │67 │68  69  70  71  72  73  74  75  76  77  78  
        ├───┼───┤               ╷   ┌───┬───┐           ╷    
        │79 │80 │81  82  83  84 │85 │86 │87 │88  89  90 │91  
        ╞═══╪═══╡   ╒═══╤═══╕   │   ╘═══╧═══╛    ═══    ╵   ╷
        │92 │93 │94 │95 │96 │97 │98  99  100 101 102 103 104│
        ├───┼───┤   └───┴───┘   ╵   ┌───┬───┐   ╷   ╷   ╷   │
        │105│106│107 108 109 110 111│112│113│114│115│116│117│
        ├───┼───┤   ╶───────╴       └───┴───┘   ╵   ╵   ╵   ╵
        │118│119│120 121 122 123 124 125 126 127 128 129 130 
        └───┴───┘                                            
        """)

    @Test
    fun ascii() = doTest(BorderStyle.ASCII, """
        +---+---+                   +---+---+                
        |1  |2  |3   4   5   6   7  |8  |9  |10 |11 |12 |13 |
        +---+---+    -------        +---+---+                
        |14 |15 |16  17  18  19  20  21  22  23  24  25  26  
        +---+---+                   +---+---+                
        |27 |28 |29  30  31  32 |33 |34 |35 |36  37  38 |39  
        +---+---+   +---+---+   |   +---+---+    ---         
        |40 |41 |42 |43 |44 |45 |46  47  48  49  50  51  52 |
        +---+---+   +---+---+       +---+---+               |
        |53 |54 |55  56  57  58  59 |60 |61 |62 |63 |64 |65 |
        +---+---+    -------        +---+---+                
        |66 |67 |68  69  70  71  72  73  74  75  76  77  78  
        +---+---+                   +---+---+                
        |79 |80 |81  82  83  84 |85 |86 |87 |88  89  90 |91  
        +---+---+   +---+---+   |   +---+---+    ---         
        |92 |93 |94 |95 |96 |97 |98  99  100 101 102 103 104|
        +---+---+   +---+---+       +---+---+               |
        |105|106|107 108 109 110 111|112|113|114|115|116|117|
        +---+---+    -------        +---+---+                
        |118|119|120 121 122 123 124 125 126 127 128 129 130 
        +---+---+                                            
        """)

    @Test
    fun ascii_double_section_separator() = doTest(BorderStyle.ASCII_DOUBLE_SECTION_SEPARATOR, """
        +---+---+                   +---+---+                
        |1  |2  |3   4   5   6   7  |8  |9  |10 |11 |12 |13 |
        +---+---+    -------        +---+---+                
        |14 |15 |16  17  18  19  20  21  22  23  24  25  26  
        +---+---+                   +---+---+                
        |27 |28 |29  30  31  32 |33 |34 |35 |36  37  38 |39  
        +===+===+   +===+===+   |   +===+===+    ===         
        |40 |41 |42 |43 |44 |45 |46  47  48  49  50  51  52 |
        +---+---+   +---+---+       +---+---+               |
        |53 |54 |55  56  57  58  59 |60 |61 |62 |63 |64 |65 |
        +---+---+    -------        +---+---+                
        |66 |67 |68  69  70  71  72  73  74  75  76  77  78  
        +---+---+                   +---+---+                
        |79 |80 |81  82  83  84 |85 |86 |87 |88  89  90 |91  
        +===+===+   +===+===+   |   +===+===+    ===         
        |92 |93 |94 |95 |96 |97 |98  99  100 101 102 103 104|
        +---+---+   +---+---+       +---+---+               |
        |105|106|107 108 109 110 111|112|113|114|115|116|117|
        +---+---+    -------        +---+---+                
        |118|119|120 121 122 123 124 125 126 127 128 129 130 
        +---+---+                                            
        """)

    private fun doTest(borderStyle: BorderStyle, expected: String) {
        checkRender(table {
            this.borderStyle = borderStyle
            padding = Padding.none()

            var i = 1
            fun SectionBuilder.sectionRows() {
                row {
                    cells(i++, i++)
                    cell(i++) { borders = NONE }
                    cells(i++, i++) { borders = BOTTOM }
                    cells(i++, i++) { borders = NONE }
                    cells(i++, i++) { borders = ALL }
                    cell(i++) { borders = NONE }
                    cells(i++, i++, i++) { borders = LEFT_RIGHT }
                }
                row {
                    cells(i++, i++)
                    cell(i++) { borders = NONE }
                    cell(i++) { borders = TOP }
                    cells(i++, i++, i++, i++, i++, i++, i++, i++, i++) { borders = NONE }
                }
            }

            fun SectionBuilder.transitionRow(top: Boolean) {
                row {
                    cells(i++, i++) { ALL }
                    cell(i++) { borders = NONE }
                    cells(i++, i++) { borders = if (top) NONE else ALL }
                    cell(i++) { borders = RIGHT }
                    cell(i++) { borders = NONE }
                    cells(i++, i++) { borders = if (top) ALL else NONE }
                    cell(i++) { borders = NONE }
                    cell(i++) { borders = if (top) BOTTOM else NONE }
                    cell(i++) { borders = if (top) RIGHT else NONE }
                    cell(i++) { borders = if (top) NONE else RIGHT }

                }
            }
            header {
                sectionRows()
                transitionRow(true)
            }

            body {
                transitionRow(false)
                sectionRows()
                transitionRow(true)
            }

            footer {
                transitionRow(false)
                sectionRows()
            }
        }, expected)
    }
}
