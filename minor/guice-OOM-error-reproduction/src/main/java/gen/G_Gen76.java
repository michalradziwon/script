
  package gen;
  public class G_Gen76 {
  		@com.google.inject.Inject
  		public G_Gen76(G_Gen77 g_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  