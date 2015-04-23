
  package gen;
  public class G_Gen59 {
  		@com.google.inject.Inject
  		public G_Gen59(G_Gen60 g_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  