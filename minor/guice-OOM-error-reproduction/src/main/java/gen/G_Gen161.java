
  package gen;
  public class G_Gen161 {
  		@com.google.inject.Inject
  		public G_Gen161(G_Gen162 g_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  