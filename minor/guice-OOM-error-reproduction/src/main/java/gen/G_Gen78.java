
  package gen;
  public class G_Gen78 {
  		@com.google.inject.Inject
  		public G_Gen78(G_Gen79 g_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  