
  package gen;
  public class G_Gen99 {
  		@com.google.inject.Inject
  		public G_Gen99(G_Gen100 g_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  