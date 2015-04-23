
  package gen;
  public class G_Gen152 {
  		@com.google.inject.Inject
  		public G_Gen152(G_Gen153 g_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  