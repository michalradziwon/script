
  package gen;
  public class H_Gen147 {
  		@com.google.inject.Inject
  		public H_Gen147(H_Gen148 h_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  