package com.krisna.biofun

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()


        val question1 = Question(
            1,
            "Istilah sel pertama kali dinyatakan oleh …",
            "Johannes Purkinje",
            "Robert Hooke",
            "Theodor Schawnn",
            "Rudolf Virchow",
            "Felix Dujardin",
            2
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Berikut merupakan pemahaman sel sebagai unit fungsional terkecil dari makhluk hidup " +
                    "ialah …",
            "Sel tersusun atas protein struktural dan fungsional",
            "Sel melakukan aktivitas hidup seperti organisme",
            "Organel sel tersusun atas protein, lemak dan karbohidrat",
            "Sel tersusun atas molekul organik dan non organik",
            "Sel merupakan memiliki struktur yang khas",
            2,
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "Membran sel sangat penting karena alasan di bawah ini, kecuali …",
            "Mengendalikan pertukaran zat antara sel",
            "Menjadi pembatas antara sitoplasma dan nukleoplasma",
            "Bersifat diferensial permeabel",
            "Menjadi pembatas antara isi sel dengan lingkungan luarnya",
            "Sebagai reseptor",
            3
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "Mitokondria merupakan organel yang memiliki membran rangkap, kista dan matriks. " +
                    "Fungsi matriks adalah …",
            "Tempat terjadinya respirasi seluler dan menghasilkan ATP",
            "Tempat sintesis protein",
            "Sintesis lipid ",
            "Metabolisme karbohidrat",
            "Oksidasi asam lemak dan katabolisme asetil koenzim",
            5
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "Organ sel yang berperan mengarahkan kromosom ke kutub pada saat pembelahan sel " +
                    "adalah …",
            "Nukleolus",
            "Nukleus",
            "Badan golgi",
            "Sentriol",
            "Ribosom",
            4
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "Perhatikan ciri-ciri berikut!\n" +
                    "1) Materi inti tidak memiliki membran\n" +
                    "2) DNA berada di dalam nukleolus\n" +
                    "3) Tidak memiliki organel\n" +
                    "4) Materi inti memiliki membran\n" +
                    "Dari ciri –ciri tersebut, ciri-ciri sel prokariotik ditunjukkan oleh nomor …",
            "1 dan 2",
            "2 dan 3",
            "3 dan 4",
            "2 dan 4",
            "1 dan 3",
            5
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "Difusi merupakan peristiwa …",
            "Pergerakan molekul dari ruang hampa ke ruang yang berisi udara",
            "Pergerakan molekul melalui selaput permiabel",
            "Pergerakan molekul dari daerah kerapatan tinggi ke kerapatan rendah",
            "Pergerakan molekul dari daerah kerapatan rendah ke kerapatan tinggi",
            "Pergerakan molekul tanpa melalui selaput permiabel\n",
            3
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "Organel sel memiliki ciri-ciri :\n" +
                    "1) Berbentuk oval\n" +
                    "2) Mempunyai dua lapis membran \n" +
                    "3) Membran dalam berlaku untuk memperluas bidang permukaan untuk menyerap \n" +
                    "oksigen \n" +
                    "Fungsi organ tersebut adalah …",
            "Kloroplas sebagai tempat reaksi terang",
            "Retikulum endoplasma sebagai penghubung inti dan splasma",
            "Mitokondria sebagai alat pengeluaran sisa metabolisme",
            "Kloroplas sebagai pembentuk ATP\n",
            "Mikrokandia sebagai tempat pembentuk energi",
            5
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "",
            "",
            "",
            "",
            "",
            "",
            3
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "",
            "",
            "",
            "",
            "",
            "",
            3
        )
        questionList.add(question10)

        val question11 = Question(
            3,
            "",
            "",
            "",
            "",
            "",
            "",
            3
        )
        questionList.add(question11)

        return questionList
    }
}