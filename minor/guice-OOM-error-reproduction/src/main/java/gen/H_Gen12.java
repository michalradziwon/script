
  package gen;
  public class H_Gen12 {
  		@com.google.inject.Inject
  		public H_Gen12(H_Gen13 h_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  