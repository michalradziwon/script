
  package gen;
  public class H_Gen197 {
  		@com.google.inject.Inject
  		public H_Gen197(H_Gen198 h_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  