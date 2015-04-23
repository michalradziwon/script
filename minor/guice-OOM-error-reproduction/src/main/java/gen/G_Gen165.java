
  package gen;
  public class G_Gen165 {
  		@com.google.inject.Inject
  		public G_Gen165(G_Gen166 g_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  