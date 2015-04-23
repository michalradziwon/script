
  package gen;
  public class G_Gen73 {
  		@com.google.inject.Inject
  		public G_Gen73(G_Gen74 g_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  