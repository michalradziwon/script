
  package gen;
  public class G_Gen92 {
  		@com.google.inject.Inject
  		public G_Gen92(G_Gen93 g_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  