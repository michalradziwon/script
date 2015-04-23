
  package gen;
  public class G_Gen28 {
  		@com.google.inject.Inject
  		public G_Gen28(G_Gen29 g_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  