public class Main {
    public static void main(String[] args)
    {
        yazz(3);
        System.out.println(t);
    }
    static int t=0;
    static  void yazz(int a){
        if (a==0) return;
        t=t+a;
        System.out.println(a);
        yazz(a-1);
        System.out.println(a);
    }

}

//pythona yapıştır
//import matplotlib.pyplot as plt
//import networkx as nx
//
//# Yönlü grafik oluştur
//        G = nx.DiGraph()
//
//# Düğümleri ve geçişleri tanımlayalım
//G.add_edges_from([
//                         ("yazz(3)", "print 3 (önce)"),
//    ("print 3 (önce)", "yazz(2)"),
//            ("yazz(2)", "print 2 (önce)"),
//            ("print 2 (önce)", "yazz(1)"),
//            ("yazz(1)", "print 1 (önce)"),
//            ("print 1 (önce)", "yazz(0)"),
//            ("yazz(0)", "return"),
//            ("return", "print 1 (sonra)"),
//            ("print 1 (sonra)", "print 2 (sonra)"),
//            ("print 2 (sonra)", "print 3 (sonra)"),
//            ("print 3 (sonra)", "t = 6"),
//            ])
//
//            # Düğüm konumlarını manuel olarak ayarla
//        pos = {
//        "yazz(3)": (0, 6),
//        "print 3 (önce)": (0, 5.5),
//        "yazz(2)": (0, 5),
//        "print 2 (önce)": (0, 4.5),
//        "yazz(1)": (0, 4),
//        "print 1 (önce)": (0, 3.5),
//        "yazz(0)": (0, 3),
//        "return": (0, 2.5),
//        "print 1 (sonra)": (0, 2),
//        "print 2 (sonra)": (0, 1.5),
//        "print 3 (sonra)": (0, 1),
//        "t = 6": (0, 0.5),
//        }
//
//        # Şemayı çiz
//plt.figure(figsize=(8, 8))
//        nx.draw(G, pos, with_labels=True, node_size=3000, node_color="lightblue",
//                font_size=10, font_weight='bold', arrowsize=20)
//plt.title("yazz(3) Fonksiyonunun Özyineleme Akışı", fontsize=14)
//plt.axis('off')
//plt.show()
