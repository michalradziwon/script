
  package gen;
  public class G_Gen13 {
  		@com.google.inject.Inject
  		public G_Gen13(G_Gen14 g_gen14){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen14 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  