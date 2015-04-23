
  package gen;
  public class G_Gen114 {
  		@com.google.inject.Inject
  		public G_Gen114(G_Gen115 g_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  