
  package gen;
  public class G_Gen180 {
  		@com.google.inject.Inject
  		public G_Gen180(G_Gen181 g_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  