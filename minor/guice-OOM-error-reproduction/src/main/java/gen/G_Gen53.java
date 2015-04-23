
  package gen;
  public class G_Gen53 {
  		@com.google.inject.Inject
  		public G_Gen53(G_Gen54 g_gen54){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen54 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  