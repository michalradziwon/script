
  package gen;
  public class G_Gen163 {
  		@com.google.inject.Inject
  		public G_Gen163(G_Gen164 g_gen164){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen164 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  