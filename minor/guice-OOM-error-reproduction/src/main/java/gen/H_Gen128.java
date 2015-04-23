
  package gen;
  public class H_Gen128 {
  		@com.google.inject.Inject
  		public H_Gen128(H_Gen129 h_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  