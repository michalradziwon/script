
  package gen;
  public class G_Gen35 {
  		@com.google.inject.Inject
  		public G_Gen35(G_Gen36 g_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  