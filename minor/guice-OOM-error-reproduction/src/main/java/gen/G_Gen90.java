
  package gen;
  public class G_Gen90 {
  		@com.google.inject.Inject
  		public G_Gen90(G_Gen91 g_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  