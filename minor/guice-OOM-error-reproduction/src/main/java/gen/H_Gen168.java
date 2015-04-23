
  package gen;
  public class H_Gen168 {
  		@com.google.inject.Inject
  		public H_Gen168(H_Gen169 h_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  