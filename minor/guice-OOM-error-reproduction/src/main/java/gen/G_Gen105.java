
  package gen;
  public class G_Gen105 {
  		@com.google.inject.Inject
  		public G_Gen105(G_Gen106 g_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  