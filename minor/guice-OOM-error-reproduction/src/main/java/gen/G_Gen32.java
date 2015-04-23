
  package gen;
  public class G_Gen32 {
  		@com.google.inject.Inject
  		public G_Gen32(G_Gen33 g_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  