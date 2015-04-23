
  package gen;
  public class H_Gen125 {
  		@com.google.inject.Inject
  		public H_Gen125(H_Gen126 h_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  