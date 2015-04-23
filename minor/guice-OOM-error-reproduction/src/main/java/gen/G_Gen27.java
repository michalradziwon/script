
  package gen;
  public class G_Gen27 {
  		@com.google.inject.Inject
  		public G_Gen27(G_Gen28 g_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  