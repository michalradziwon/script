
  package gen;
  public class G_Gen67 {
  		@com.google.inject.Inject
  		public G_Gen67(G_Gen68 g_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  