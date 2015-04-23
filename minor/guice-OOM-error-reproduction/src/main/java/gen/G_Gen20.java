
  package gen;
  public class G_Gen20 {
  		@com.google.inject.Inject
  		public G_Gen20(G_Gen21 g_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  