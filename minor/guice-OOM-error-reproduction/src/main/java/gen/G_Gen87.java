
  package gen;
  public class G_Gen87 {
  		@com.google.inject.Inject
  		public G_Gen87(G_Gen88 g_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  