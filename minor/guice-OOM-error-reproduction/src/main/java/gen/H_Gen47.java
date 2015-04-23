
  package gen;
  public class H_Gen47 {
  		@com.google.inject.Inject
  		public H_Gen47(H_Gen48 h_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  