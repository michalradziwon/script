
  package gen;
  public class G_Gen97 {
  		@com.google.inject.Inject
  		public G_Gen97(G_Gen98 g_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  