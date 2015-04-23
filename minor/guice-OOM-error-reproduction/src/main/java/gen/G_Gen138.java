
  package gen;
  public class G_Gen138 {
  		@com.google.inject.Inject
  		public G_Gen138(G_Gen139 g_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  