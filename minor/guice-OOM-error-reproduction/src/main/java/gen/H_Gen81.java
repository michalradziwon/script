
  package gen;
  public class H_Gen81 {
  		@com.google.inject.Inject
  		public H_Gen81(H_Gen82 h_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  