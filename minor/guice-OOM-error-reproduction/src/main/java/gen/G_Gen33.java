
  package gen;
  public class G_Gen33 {
  		@com.google.inject.Inject
  		public G_Gen33(G_Gen34 g_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  