
  package gen;
  public class G_Gen149 {
  		@com.google.inject.Inject
  		public G_Gen149(G_Gen150 g_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  