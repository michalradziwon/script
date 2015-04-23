
  package gen;
  public class G_Gen42 {
  		@com.google.inject.Inject
  		public G_Gen42(G_Gen43 g_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  