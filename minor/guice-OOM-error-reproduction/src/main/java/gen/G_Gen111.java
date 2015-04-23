
  package gen;
  public class G_Gen111 {
  		@com.google.inject.Inject
  		public G_Gen111(G_Gen112 g_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  