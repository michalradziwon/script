
  package gen;
  public class G_Gen96 {
  		@com.google.inject.Inject
  		public G_Gen96(G_Gen97 g_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  