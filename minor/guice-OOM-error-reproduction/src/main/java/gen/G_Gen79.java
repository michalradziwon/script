
  package gen;
  public class G_Gen79 {
  		@com.google.inject.Inject
  		public G_Gen79(G_Gen80 g_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  