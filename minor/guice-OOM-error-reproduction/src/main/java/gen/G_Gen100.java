
  package gen;
  public class G_Gen100 {
  		@com.google.inject.Inject
  		public G_Gen100(G_Gen101 g_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  