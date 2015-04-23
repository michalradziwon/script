
  package gen;
  public class G_Gen4 {
  		@com.google.inject.Inject
  		public G_Gen4(G_Gen5 g_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  