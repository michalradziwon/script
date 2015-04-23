
  package gen;
  public class G_Gen192 {
  		@com.google.inject.Inject
  		public G_Gen192(G_Gen193 g_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  