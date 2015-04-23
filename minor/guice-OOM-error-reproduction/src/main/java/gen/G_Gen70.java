
  package gen;
  public class G_Gen70 {
  		@com.google.inject.Inject
  		public G_Gen70(G_Gen71 g_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  