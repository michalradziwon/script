
  package gen;
  public class G_Gen126 {
  		@com.google.inject.Inject
  		public G_Gen126(G_Gen127 g_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  