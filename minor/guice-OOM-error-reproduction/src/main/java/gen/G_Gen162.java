
  package gen;
  public class G_Gen162 {
  		@com.google.inject.Inject
  		public G_Gen162(G_Gen163 g_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  