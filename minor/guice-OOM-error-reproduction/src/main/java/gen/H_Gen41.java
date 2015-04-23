
  package gen;
  public class H_Gen41 {
  		@com.google.inject.Inject
  		public H_Gen41(H_Gen42 h_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  