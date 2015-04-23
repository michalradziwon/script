
  package gen;
  public class G_Gen30 {
  		@com.google.inject.Inject
  		public G_Gen30(G_Gen31 g_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  