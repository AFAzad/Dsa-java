public class StringsSb {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Sunil Chetri");

        System.out.println(sb);

        // find Char at index 6.

        System.out.println(sb.charAt(6));

        // set char at index 0.

        sb.setCharAt(6, 'M');
        System.out.println(sb);

        //insert

        sb.insert(7,'t');
        System.out.println(sb);

        //detlete the last name char.

        sb.delete(6, 13);
        System.out.println(sb);

        // append (for add charcter in last name).

        sb.append("C");
        sb.append("h");
        sb.append("e");
        sb.append("t");
        sb.append("r");
        sb.append("i");
        System.out.println(sb);


        // to get length

        System.out.println(sb.length());


    }
}
