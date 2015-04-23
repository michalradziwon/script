
  package gen;
  public class G_Gen164 {
  		@com.google.inject.Inject
  		public G_Gen164(G_Gen165 g_gen165){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen165 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  