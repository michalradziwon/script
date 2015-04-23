
  package gen;
  public class H_Gen149 {
  		@com.google.inject.Inject
  		public H_Gen149(H_Gen150 h_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  