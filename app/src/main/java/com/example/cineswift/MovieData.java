package com.example.cineswift;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public static List<Movie> getMovieList(){

            Movie movie1 = new Movie("Trolls Band Together", "When Branch’s brother, Floyd, is kidnapped for his musical talents by a pair of nefarious pop-star villains, Branch and Poppy embark on a harrowing and emotional journey to reunite the other brothers and rescue Floyd from a fate even worse than pop-culture obscurity.", "2023", "https://www.themoviedb.org/t/p/w1280/bkpPTZUdq31UGDovmszsg2CchiI.jpg");
            Movie movie2 = new Movie("The Creator", "Amid a future war between the human race and the forces of artificial intelligence, a hardened ex-special forces agent grieving the disappearance of his wife, is recruited to hunt down and kill the Creator, the elusive architect of advanced AI who has developed a mysterious weapon with the power to end the war—and mankind itself.", "2023", "https://www.themoviedb.org/t/p/w1280/vBZ0qvaRxqEhZwl6LWmruJqWE8Z.jpg");
            Movie movie3 = new Movie("Oppenheimer", "The story of J. Robert Oppenheimer's role in the development of the atomic bomb during World War II.", "2023", "https://www.themoviedb.org/t/p/w1280/8Gxv8gSFCU0XGDykEGv7zR1n2ua.jpg");
            Movie movie4 = new Movie("Fast X", "Dom Toretto dan keluarganya menjadi sasaran putra gembong narkoba Hernan Reyes yang pendendam.", "2023", "https://www.themoviedb.org/t/p/w1280/fiVW06jE7z9YnO4trhaMEdclSiC.jpg");
            Movie movie5 = new Movie("Five Nights at Freddy's", "Recently fired and desperate for work, a troubled young man named Mike agrees to take a position as a night security guard at an abandoned theme restaurant: Freddy Fazbear's Pizzeria. But he soon discovers that nothing at Freddy's is what it seems.", "2023", "https://www.themoviedb.org/t/p/w1280/j9mH1pr3IahtraTWxVEMANmPSGR.jpg");
            Movie movie6 = new Movie("Mission: Impossible - Dead Reckoning Part One", "Ethan Hunt dan tim IMF beraksi dalam misi paling berbahaya dari yang pernah ada: Melacak sebuah senjata jenis baru yang dapat mengancam kelangsungan umat manusia, sebelum jatuh ke tangan yang salah. Dengan kendali terhadap masa depan dan nasib dunia sebagai taruhannya, serta pihak-pihak jahat dari masa lalu Ethan yang turut mengintai, perlombaan maut lintas negara dimulai. Dihadang oleh musuh yang misterius dan berkuasa, Ethan dipaksa untuk menjadikan misi ini sebagai prioritas terpentingbahkan lebih penting dari nyawa orang-orang terdekatnya sekalipun.", "2023", "https://www.themoviedb.org/t/p/w1280/NNxYkU70HPurnNCSiCjYAmacwm.jpg");
            Movie movie7 = new Movie("The Hunger Games: The Ballad of Songbirds & Snakes", "64 years before he becomes the tyrannical president of Panem, Coriolanus Snow sees a chance for a change in fortunes when he mentors Lucy Gray Baird, the female tribute from District 12.", "2023", "https://www.themoviedb.org/t/p/w1280/mBaXZ95R2OxueZhvQbcEWy2DqyO.jpg");
            Movie movie8 = new Movie("Leo", "Jaded 74-year-old lizard Leo has been stuck in the same Florida classroom for decades with his terrarium-mate turtle. When he learns he only has one year left to live, he plans to escape to experience life on the outside but instead gets caught up in the problems of his anxious students — including an impossibly mean substitute teacher.", "2023", "https://www.themoviedb.org/t/p/w1280/gSOVog7ydsaF1YpgAqBqnKYFGY.jpg");
            Movie movie9 = new Movie("The Marvels", "Carol Danvers, aka Captain Marvel, has reclaimed her identity from the tyrannical Kree and taken revenge on the Supreme Intelligence. But unintended consequences see Carol shouldering the burden of a destabilized universe. When her duties send her to an anomalous wormhole linked to a Kree revolutionary, her powers become entangled with that of Jersey City super-fan Kamala Khan, aka Ms. Marvel, and Carol’s estranged niece, now S.A.B.E.R. astronaut Captain Monica Rambeau. Together, this unlikely trio must team up and learn to work in concert to save the universe.", "2023","https://www.themoviedb.org/t/p/w1280/Ag3D9qXjhJ2FUkrlJ0Cv1pgxqYQ.jpg");
            Movie movie10 = new Movie("The Super Mario Bros. Movie ", "Ketika sedang bekerja di bawah tanah untuk memperbaiki pipa air, Mario dan Luigi, yang merupakan tukang ledeng dari Brooklyn, tiba-tiba terhisap ke dalam pipa misterius dan masuk ke dunia yang sangat berbeda. Mereka berada di tempat yang ajaib dan aneh. Tapi sayangnya, mereka terpisah satu sama lain. Mario memulai petualangan besar untuk mencari dan menemukan Luigi.", "2023", "https://www.themoviedb.org/t/p/w1280/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg");

            List<Movie> list = new ArrayList<>();
            list.add(movie1);
            list.add(movie2);
            list.add(movie3);
            list.add(movie4);
            list.add(movie5);
            list.add(movie6);
            list.add(movie7);
            list.add(movie8);
            list.add(movie9);
            list.add(movie10);

            return list;
    }


}
