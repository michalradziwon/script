
  package gen;
  public class G_Gen147 {
  		@com.google.inject.Inject
  		public G_Gen147(G_Gen148 g_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  