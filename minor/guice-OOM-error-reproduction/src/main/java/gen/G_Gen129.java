
  package gen;
  public class G_Gen129 {
  		@com.google.inject.Inject
  		public G_Gen129(G_Gen130 g_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  