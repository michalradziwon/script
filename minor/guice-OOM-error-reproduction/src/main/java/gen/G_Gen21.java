
  package gen;
  public class G_Gen21 {
  		@com.google.inject.Inject
  		public G_Gen21(G_Gen22 g_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  