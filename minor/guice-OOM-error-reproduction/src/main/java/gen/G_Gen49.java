
  package gen;
  public class G_Gen49 {
  		@com.google.inject.Inject
  		public G_Gen49(G_Gen50 g_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  