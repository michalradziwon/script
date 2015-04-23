
  package gen;
  public class G_Gen182 {
  		@com.google.inject.Inject
  		public G_Gen182(G_Gen183 g_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  