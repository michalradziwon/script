
  package gen;
  public class G_Gen34 {
  		@com.google.inject.Inject
  		public G_Gen34(G_Gen35 g_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  