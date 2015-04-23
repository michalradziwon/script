
  package gen;
  public class G_Gen193 {
  		@com.google.inject.Inject
  		public G_Gen193(G_Gen194 g_gen194){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen194 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  