
  package gen;
  public class H_Gen127 {
  		@com.google.inject.Inject
  		public H_Gen127(H_Gen128 h_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  