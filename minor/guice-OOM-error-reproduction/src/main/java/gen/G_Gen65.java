
  package gen;
  public class G_Gen65 {
  		@com.google.inject.Inject
  		public G_Gen65(G_Gen66 g_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  