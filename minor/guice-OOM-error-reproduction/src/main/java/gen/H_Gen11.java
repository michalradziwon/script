
  package gen;
  public class H_Gen11 {
  		@com.google.inject.Inject
  		public H_Gen11(H_Gen12 h_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  