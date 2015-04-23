
  package gen;
  public class G_Gen122 {
  		@com.google.inject.Inject
  		public G_Gen122(G_Gen123 g_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  