
  package gen;
  public class G_Gen132 {
  		@com.google.inject.Inject
  		public G_Gen132(G_Gen133 g_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  