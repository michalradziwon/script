
  package gen;
  public class G_Gen7 {
  		@com.google.inject.Inject
  		public G_Gen7(G_Gen8 g_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  