
  package gen;
  public class G_Gen3 {
  		@com.google.inject.Inject
  		public G_Gen3(G_Gen4 g_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  