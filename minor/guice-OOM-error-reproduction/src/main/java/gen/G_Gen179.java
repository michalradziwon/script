
  package gen;
  public class G_Gen179 {
  		@com.google.inject.Inject
  		public G_Gen179(G_Gen180 g_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  