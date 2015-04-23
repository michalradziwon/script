
  package gen;
  public class G_Gen153 {
  		@com.google.inject.Inject
  		public G_Gen153(G_Gen154 g_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + g_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  