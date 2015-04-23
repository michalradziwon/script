
  package gen;
  public class G_Gen83 {
  		@com.google.inject.Inject
  		public G_Gen83(G_Gen84 g_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  