
  package gen;
  public class G_Gen110 {
  		@com.google.inject.Inject
  		public G_Gen110(G_Gen111 g_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  