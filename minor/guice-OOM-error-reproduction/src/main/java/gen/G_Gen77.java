
  package gen;
  public class G_Gen77 {
  		@com.google.inject.Inject
  		public G_Gen77(G_Gen78 g_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  