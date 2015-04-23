
  package gen;
  public class G_Gen69 {
  		@com.google.inject.Inject
  		public G_Gen69(G_Gen70 g_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  