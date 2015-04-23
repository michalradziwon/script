
  package gen;
  public class G_Gen150 {
  		@com.google.inject.Inject
  		public G_Gen150(G_Gen151 g_gen151){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen151 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  