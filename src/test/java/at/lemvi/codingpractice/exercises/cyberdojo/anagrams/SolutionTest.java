package at.lemvi.codingpractice.exercises.cyberdojo.anagrams;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

/*
Write a program to generate all potential anagrams of an input string.

For example, the potential anagrams of "biro" are

biro bior brio broi boir bori
ibro ibor irbo irob iobr iorb
rbio rboi ribo riob roib robi
obir obri oibr oirb orbi orib
 */


class SolutionTest {

    @Test
    void generateAnagramSimple() {
        Solution solution = new Solution();
        String result = solution.generateAnagram("ab", 0, 1);

        assertThat(result).isEqualTo("ba");
    }

    @Test
    void generateAnagramAdvanced() {
        Solution solution = new Solution();
        String result = solution.generateAnagram("aab", 1, 2);

        assertThat(result).isEqualTo("aba");
    }

    @Test
    void generateAllAnagramsSimple() {
        Solution solution = new Solution();
        String result = solution.getAllLines(new TreeSet<>(), "aab");

        assertThat(result).isEqualTo("aab aba\n" +
                                             "baa");
    }


    @Test
    void findAllSixCombinationsFor4DifferentLettersWithFirstOneFixed() {
        Solution solution = new Solution();
        Set<String> result = solution.getSingleLine(new TreeSet<>(), "biro", 1);

        assertThat(result).isEqualTo(Set.of("biro", "bior", "boir", "bori", "brio", "broi"));
    }

    @Test
    void findAllCombinationsFor4DifferentLetters() {
        Solution solution = new Solution();
        String result = solution.getAllLines(new TreeSet<>(), "biro");

        assertThat(result).isEqualTo("bior biro boir bori brio broi\n" +
                                             "ibor ibro iobr iorb irbo irob\n" +
                                             "obir obri oibr oirb orbi orib\n" +
                                             "rbio rboi ribo riob robi roib");
    }

    @Test
    void getSingleLineWithFiveLetterInput() {
        Solution solution = new Solution();
        Set<String> result = solution.getSingleLine(new TreeSet<>(), "birom", 1);

        assertThat(result).isEqualTo(Set.of("bimor", "bimro", "biomr", "biorm", "birmo", "birom", "bmior", "bmiro", "bmoir", "bmori", "bmrio", "bmroi", "boimr", "boirm", "bomir", "bomri", "borim", "bormi", "brimo", "briom", "brmio", "brmoi", "broim", "bromi"));
    }

    @Test
    void findAllCombinationsForFiveDifferentLetters() {
        Solution solution = new Solution();
        String result = solution.getAllLines(new TreeSet<>(), "birom");

        assertThat(result).isEqualTo("bimor bimro biomr biorm birmo birom bmior bmiro bmoir bmori bmrio bmroi boimr boirm bomir bomri borim bormi brimo briom brmio brmoi broim bromi\n" +
                                             "ibmor ibmro ibomr iborm ibrmo ibrom imbor imbro imobr imorb imrbo imrob iobmr iobrm iombr iomrb iorbm iormb irbmo irbom irmbo irmob irobm iromb\n" +
                                             "mbior mbiro mboir mbori mbrio mbroi mibor mibro miobr miorb mirbo mirob mobir mobri moibr moirb morbi morib mrbio mrboi mribo mriob mrobi mroib\n" +
                                             "obimr obirm obmir obmri obrim obrmi oibmr oibrm oimbr oimrb oirbm oirmb ombir ombri omibr omirb omrbi omrib orbim orbmi oribm orimb ormbi ormib\n" +
                                             "rbimo rbiom rbmio rbmoi rboim rbomi ribmo ribom rimbo rimob riobm riomb rmbio rmboi rmibo rmiob rmobi rmoib robim robmi roibm roimb rombi romib");
    }


}