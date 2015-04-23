
  package gen;
  public class G_Gen101 {
  		@com.google.inject.Inject
  		public G_Gen101(G_Gen102 g_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  