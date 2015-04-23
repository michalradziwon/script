
  package gen;
  public class G_Gen85 {
  		@com.google.inject.Inject
  		public G_Gen85(G_Gen86 g_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  