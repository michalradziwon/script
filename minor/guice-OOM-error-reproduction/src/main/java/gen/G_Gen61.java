
  package gen;
  public class G_Gen61 {
  		@com.google.inject.Inject
  		public G_Gen61(G_Gen62 g_gen62){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen62 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  