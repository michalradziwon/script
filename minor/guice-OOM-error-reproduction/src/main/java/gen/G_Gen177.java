
  package gen;
  public class G_Gen177 {
  		@com.google.inject.Inject
  		public G_Gen177(G_Gen178 g_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  