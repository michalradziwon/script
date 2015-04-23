
  package gen;
  public class G_Gen102 {
  		@com.google.inject.Inject
  		public G_Gen102(G_Gen103 g_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  