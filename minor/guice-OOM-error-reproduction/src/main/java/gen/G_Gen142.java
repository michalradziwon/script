
  package gen;
  public class G_Gen142 {
  		@com.google.inject.Inject
  		public G_Gen142(G_Gen143 g_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  