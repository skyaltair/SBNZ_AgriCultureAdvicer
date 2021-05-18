package uns.ftn.siit.sbnz.proj.sbnz.medjuklase;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uns.ftn.siit.sbnz.proj.sbnz.model.enums.TipPovrsine;

@AllArgsConstructor
@NoArgsConstructor
public class Povrsina {


    @Getter
    @Setter
    private TipPovrsine tipPovrsine;
}
