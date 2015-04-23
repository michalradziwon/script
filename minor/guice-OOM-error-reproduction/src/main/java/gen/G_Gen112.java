
  package gen;
  public class G_Gen112 {
  		@com.google.inject.Inject
  		public G_Gen112(G_Gen113 g_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  