
  package gen;
  public class H_Gen56 {
  		@com.google.inject.Inject
  		public H_Gen56(H_Gen57 h_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  