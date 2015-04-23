
  package gen;
  public class G_Gen51 {
  		@com.google.inject.Inject
  		public G_Gen51(G_Gen52 g_gen52){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen52 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  